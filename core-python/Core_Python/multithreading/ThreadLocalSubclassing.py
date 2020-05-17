import threading as th
from random import randint
from time import sleep

def display(n):
    th_name = "["+th.currentThread().getName()+"] "
    try:
        val = n.val
    except AttributeError:
        print(th_name+"No value yet")
    else:
        print(th_name+"Value : ",val)

def task(n):
    display(n)
    #n.val = randint(1,100)
    n.value = randint(1, 100)
    display(n)

class MyThLocal(th.local):
    def __init__(self,n):
        print("["+th.currentThread().getName()+"] "+"Initializing ",self)
        self.val = n

if __name__ == "__main__":
    n = MyThLocal(410)
    display(n)

    for i in range(2):
        th.Thread(target=task,args=(n,)).start()
        sleep(2)
