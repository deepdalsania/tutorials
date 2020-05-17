import threading as th
from time import sleep

class ThreadPool:

    def __init__(self):
        super(ThreadPool,self).__init__()
        self.active = []
        self.lock = th.Lock()

    def makeActive(self,name):
        with self.lock:
            self.active.append(name)
            print("Active Running: {}".format(self.active))

    def makeInactive(self,name):
        with self.lock:
            self.active.append(name)
            print("InActive Running: {}".format(self.active))

def task(s,pool):
    print("Waiting to join the pool")
    with s:
        name = th.currentThread().getName()
        pool.makeActive(name)
        sleep(0.5)
        pool.makeInactive(name)

if __name__ == "__main__":
    pool = ThreadPool()
    #s = th.Semaphore(2)
    '''  A bounded semaphore checks to make sure its current value doesn’t exceed 
         its initial value '''
    #s = th.BoundedSemaphore(2)
    for i in range(1,3):
        t = th.Thread(name='Thread-'+str(i),target=task,args=(s,pool,))
        t.start()