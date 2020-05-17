from threading import Thread
from time import sleep

def say_hello():
    print("Hello I am a Daemon Thread start")
    sleep(5)
    print("Hello I am a Daemon Thread stop")

def say_hi():
    print("Hi I am a non Daemon Thread start")
    print("Hi I am a non Daemon Thread stop")

try:
    th1 = Thread(name="DaemonThread",target=say_hello , daemon=True)
    ''' If we are not specifying daemon flag value then by default it is False '''
    th2 = Thread(name="Non-DaemonThread",target=say_hi , daemon=False)
    th1.start()
    th2.start()
    th1.join()
    th2.join()
except (RuntimeError,Exception) as e:
    print(e)

''' The daemon thread will take 5 seconds to complete its task, but main thread 
    did not wait for the daemon thread. '''
''' <------ Program 2 ------->'''
''' Now remove sleep from say_hello'''
''' Now in output all print statements are executed. The main thread had to wait 
    for the non-daemon process.'''
''' <------ Program 3 -------> '''
''' Now add sleep(5) in say_hello and remove commented join statements '''
''' If you use the join statement for the daemon thread,then the main thread has to
    wait for the completion of the daemon thread’s task.'''