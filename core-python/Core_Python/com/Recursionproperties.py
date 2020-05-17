import sys

print("getrecursionlimit : ",sys.getrecursionlimit())
sys.setrecursionlimit(100)
i = 0
def count():
    global i
    i+=1
    print("Hello ",i)
    count()

count()