import threading
from time import sleep
from os import getpid,getppid

'''A PPID is your Professional Personnel Identification Number. This # is unique 
   to you. The intended purpose of the PPID was to create a secure alternative to 
   use instead of Social Security Numbers for reporting and retrieving Act 48 
   continuing professional education credits and hours.'''
def find_cube(n):
    try:
        print("PID of find_cube is {}".format(getpid()))
        print("PPID of find_cube is {}".format(getppid()))
        for i in range(1, n + 1):
            sleep(1)
            print("Cube of {} is : {}".format(i, i * i * i))
    except Exception as e:
        print(e)

def find_square(n):
    try:
        print("PID of find_square is {}".format(getpid()))
        print("PPID of find_square is {}".format(getppid()))
        for i in range(1, n + 1):
            sleep(1)
            print("Square of {} is : {}".format(i, i * i))
    except Exception as e:
        print(e)


print("PID of running main program is {}".format(getpid()))
print("PPID of running main program is {}".format(getppid()))
n = int(input("Enter a size of iteration variable for cube and square : "))
''' If we are passing group name here then also we can't get all threads from one 
    group because ThreadGroup class is not implemented in python as of now. We can 
    verify that by using get method because in threading there is get and set name 
    method like java we don't Thread Group class'''
''' Thread has a constructor which allows you to set a ThreadGroup:
Thread(ThreadGroup group, String name) '''
th1 = threading.Thread(target= find_cube , name= "CubeThread",args=(n,),group=None,)
th2  =threading.Thread(target= find_square , name= "SquareThread",args=(n,),group=None)
th1.start()
sleep(1)
th2.start()
th1.join()
th2.join()
''' Here we are printing all methods of thread if we don't use join then all 
    statements will be print when one thread executed so join gets the control
    for execution when first is executing second will wait and vice-versa '''
print("Thread1 Name : ",th1.name)
print("Thread2 Name : ",th2.name)
print("Thread1 alive status : ",th1.isAlive())
print("Thread2 alive status : ",th2.isAlive())
''' all other methods of Thread instance in MainDefaultThread.py'''
''' it gives one because all two threads were killed or completed their execution
    now only main thread is there '''
print("Active Thread count : ",threading.active_count())
''' Return a list of all Thread objects currently alive. The list includes daemonic 
    threads, dummy thread objects created by current_thread(), and the main thread. 
    It excludes terminated threads and threads that have not yet been started.'''
print("List of all threads : ",threading.enumerate())
print("Main Thread : ",threading.main_thread())