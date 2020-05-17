from threading import Thread
from time import sleep

class JoinThread1(Thread):

    def __init__(self,n,name):
        Thread.__init__(self)
        self.n = n
        self.name = name

    def run(self):
        addition = 0
        for i in range(1,self.n + 1):
            print(i)
            try:
                sleep(1)
            except Exception as e:
                print(e)
            addition += i
        print("Addition is : ",addition)

class JoinThread2(Thread):

    def __init__(self,n,name):
        Thread.__init__(self)
        self.n = n
        self.name = name

    def run(self):
        mul = 1
        for i in range(1,self.n + 1):
            print(i)
            try:
                sleep(1)
            except Exception as e:
                print(e)
            mul += i
        print("Multiplication is : ",mul)

n = int(input("Enter a size of iteration variable for addition and multiplication : "))
t1 = JoinThread1(n,"Thread-1")
t2 = JoinThread2(n,"Thread-2")
t1.start()
''' If we add sleep then it will print parallelly so when t1 get control for execution t2 wait and vice-versa '''
sleep(1)
t2.start()
''' If we are using join method then thread will execute simultaneously but not printed line by line'''
t1.join()
t2.join()

