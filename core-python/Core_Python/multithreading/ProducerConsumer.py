import threading
from time import sleep

def consumer(cv):
    thread_name = "["+threading.currentThread().getName()+"]"
    print(thread_name,"<---- Consumer Thread Started --->")
    with cv:
        print(thread_name,"Consumer Waiting....")
        cv.wait()
        print(thread_name,"<---- Consumer consume the item ---->")

def producer(cv):
    thread_name = "["+threading.currentThread().getName()+"]"
    print(thread_name,"<--- Producer Thread Started ---->")
    with cv:
        print(thread_name,"<---- Making Resource Available ---->")
        ''' If you want to use notifyAll() then remove these comment make notify and
            print statement as comment and also make 1 thread of producer instead of
            two and call it at the end'''
        #print(thread_name,"<---- Notify All Consumer ---->")
        #cv.notifyAll()
        cv.notify()
        print(thread_name,"<---- Notify Consumer ---->")

if __name__ == "__main__":
    cv = threading.Condition()
    th1 = threading.Thread(name = "Consumer1",target=consumer,args=(cv,))
    th2 = threading.Thread(name = "Consumer2",target=consumer,args=(cv,))
    th3 = threading.Thread(name = "Producer1",target=producer,args=(cv,))
    th4 = threading.Thread(name = "Producer2",target=producer,args=(cv,))

    th1.start()
    sleep(2)
    th3.start()
    sleep(2)
    th2.start()
    sleep(2)
    #th3.start()
    th4.start()
