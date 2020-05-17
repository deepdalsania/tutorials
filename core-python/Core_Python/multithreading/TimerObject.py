import threading as th
from time import sleep

def threadFun():
    print("["+th.currentThread().getName()+"]"+" Thread function is running")
    return

if __name__ == "__main__":
    t1 = th.Timer(interval=5,function=threadFun,args=None,kwargs=None)
    t1.setName("Thread-1")
    t2 = th.Timer(interval=5,function=threadFun,args=None,kwargs=None)
    t2.setName("Thread-2")
    print("Starting Timers")
    t1.start()
    #sleep(1)
    t2.start()
    print("Wait before canceling {}".format(t2.getName()))
    sleep(2)
    print("Canceling {}".format(t2.getName()))
    print("Before cancel {0} is_alive : {1}".format(t2.getName(),t2.isAlive()))
    t2.cancel()
    sleep(2)
    print("After cancel {0} is_alive : {1}".format(t2.getName(),t2.isAlive()))
    t1.join()
    t2.join()
    print("Completed")

