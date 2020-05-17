import threading as th
from time import sleep

x = 0

def increament():

    global x
    x+=1

def threadTask(lock):

    for i in range(100):
        lock.acquire()
        increament()
        lock.release()

def mainTask():

    ''' if we are setting it to zero then all value should be 200 if we want to
        increament by 200 then comment it'''
    global x
    x = 0

    lock = th.Lock()

    t1 = th.Thread(target=threadTask, args=(lock,))
    t2 = th.Thread(target=threadTask, args=(lock,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()


if __name__ == "__main__":
    for i in range(1,11):
        mainTask()
        print("Iteration {0}: x = {1} ".format(i,x))