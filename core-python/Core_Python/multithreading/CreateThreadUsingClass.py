from threading import Thread
from time import sleep

class MyThread(Thread):
    ''' When start method call by instance of Mythread then it will call run method of
        thread so we have to declare run method here no other name supported '''
    def run(self):
        n = int(input("Enter a size of iteration variable for square  : "))
        for i in range(1,n+1):
            try:
                sleep(1)
                print("Square of {} is : {}".format(i,i*i))
            except Exception as e:
                print(e)

t1 = MyThread();
t1.start()
