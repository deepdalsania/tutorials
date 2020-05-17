import threading as th
from time import sleep

def wait_for_event(e):
    t_name = "["+th.currentThread().getName()+"] "
    print(t_name+"wait_for_event is starting")
    print(t_name+"Event set : {}".format(e.wait()))
    #e.clear()

def wait_for_event_timeout(e,t):
    t_name = "[" + th.currentThread().getName() + "] "
    while not e.isSet():
        print(t_name+"wait_for_event_timeout is starting")
        event_is_set = e.wait(t)
        print(t_name+"Event set : {}".format(event_is_set))
        if event_is_set:
            print(t_name+"Processing Event")
           #e.clear()
        else:
            print(t_name+"Doing Other Things")

if __name__ == "__main__":
    e = th.Event()
    t1 = th.Thread(name="Blocking Thread",target=wait_for_event,args=(e,))
    t1.start()
    sleep(2)
    t2 = th.Thread(name="NonBlocking Thread",target=wait_for_event_timeout,args=(e,2))
    t2.start()
    print("Waiting before calling Event.set()")
    sleep(3)
    e.set()
    print("Event is set")
    #e.clear()
