from threading import Thread,Barrier
from time import sleep

class BarrierDemo(Thread):

    def __init__(self,name,b):
        Thread.__init__(self)
        self.name = name
        self.b = b

    def run(self):
        print("Thread name : ",self.name)
        sleep(1)
        print("Parties (number of threads) : ",b.parties)
        sleep(2)
        print("n_waiting (The number of threads currently waiting in the barrier) : ",b.n_waiting)
        b.wait()

if __name__ == "__main__":
    b = Barrier(3)
    t1 = BarrierDemo("Thread-1",b)
    t2 = BarrierDemo("Thread-2",b)
    t1.start()
    sleep(1)
    t2.start()
    b.wait()
    print("Barrier Broken (True if barrier is broken): ",b.broken)
    sleep(1)
    b.reset()
    print("n_waiting after barrier.reset() call : ",b.n_waiting)
    b.abort()
    print("Barrier Aborted")