import threading

''' This program can't give an output because by using lock we can acquire lock
    then we have to release lock otherwise no other thread can able to acquire lock'''
'''lock = threading.Lock()
i = 0
lock.acquire()
i += 1
lock.acquire()
i +=2
lock.release()
print(i)'''

''' We can solve this issue by using RLock'''
lock = threading.RLock()
i = 0
lock.acquire()
i += 1
lock.acquire()
i +=2
lock.release()
print(i)

''' For theoretical reference (RLock vs. Lock) : https://www.geeksforgeeks.org/python-difference-between-lock-and-rlock-objects/ '''
