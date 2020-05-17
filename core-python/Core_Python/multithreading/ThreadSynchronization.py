import threading as th
from time import sleep

def sync_thread(s,lock):
    lock.acquire()
    print("["+s,end="")
    try:
        sleep(1)
    except Exception as e:
        print(e)
    lock.release()
    print("]")

if __name__ == "__main__":
    lock = th.Lock()
    t1 = th.Thread(target=sync_thread,args=("I",lock,))
    t2 = th.Thread(target=sync_thread,args=("Love",lock,))
    t3 = th.Thread(target=sync_thread,args=("Python",lock,))
    t1.start()
    sleep(1)
    t2.start()
    sleep(1)
    t3.start()
    t1.join()
    t2.join()
    t3.join()