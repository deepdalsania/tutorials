import threading as th
import array as arr
from time import  sleep

if __name__ == '__main__':
    ct = th.current_thread();
    t = th.currentThread();
    print("Main thread name : ",ct.name)
    print("Main current thrad name : ",t.name)
    print("Demon : ",ct.daemon)
    print("Ident : ",ct.ident)
    print("is_alive : ",ct.is_alive())
    print("isAlive : ",ct.isAlive())
    print("isDaemon : ",ct.isDaemon())
    ct.setName("MyThread")
    print("Get name : ",ct.getName())
    print("After changing main thread name : ",ct.name)
    n = int(input("Enter a size of iteration variable for addition  : "))
    addition = 0
    for i in range(n):
        print(i)
        try:
            sleep(1)
        except Exception as e:
            print(e)
        addition+=i
    print("Addition is : ",addition)



