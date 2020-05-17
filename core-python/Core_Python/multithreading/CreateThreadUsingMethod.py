from threading import Thread
from time import sleep

def find_cube(n):
    try:
        for i in range(1, n + 1):
            sleep(1)
            print("Cube of {} is : {}".format(i, i * i * i))
    except Exception as e:
        print(e)
        
n = int(input("Enter a size of iteration variable for cube  : "))
th = Thread(target= find_cube , args=(n,))
th.start()
