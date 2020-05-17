from threading import Lock,Thread
''' We can also called as lock using context manager '''
'''  The acquire() method will be called when the block is entered, and release() 
     will be called when the block is exited. '''
''' If you know the log management then you can use log instead of print statement '''

def lock_with(lock):
    with lock:
        print("Lock acquired via with statement")

def lock_not_with(lock):
    lock.acquire()
    try:
        print("Lock acquired directly")
    finally:
        lock.release()

if __name__ == "__main__":
    lock = Lock()
    th1 = Thread(target=lock_with,args=(lock,))
    th2 = Thread(target=lock_not_with,args=(lock,))

    th1.start()
    th2.start()
