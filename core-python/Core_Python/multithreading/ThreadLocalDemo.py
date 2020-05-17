import threading as th
from random import randint



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
    n.val = randint(1,100)
    display(n)

if __name__ == "__main__":
    n = th.local()
    display(n)
    n.val  = 410
    display(n)

    for i in range(2):
        th.Thread(target=task,args=(n,)).start()