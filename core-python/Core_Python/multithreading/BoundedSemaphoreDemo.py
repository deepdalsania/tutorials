import threading
from time import sleep

th_names = []


def task(s):
    global th_names
    t_name = threading.current_thread().getName()
    print("Waiting to start execution : ", t_name)
    s.acquire()
    print("Started execution : ", t_name)
    th_names.append(t_name)
    sleep(1)
    print("Finished Execution : ", t_name)
    sleep(1)
    print("Threads : ",th_names)
    sleep(1)
    s.release()
    th_names.remove(t_name)


s = threading.BoundedSemaphore(value=3)
for i in range(10):
    t = threading.Thread(target=task, name='Thread-' + str(i), args=(s,))
    t.start()
    #semaphore.release()