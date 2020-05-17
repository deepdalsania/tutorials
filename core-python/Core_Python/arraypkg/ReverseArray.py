from array import *
from builtins import print

arr = array('i',[])
n = int (input('Enter the length of array : '))
print('Enter the values : ')

for i in range(n):
    x = int (input())
    arr.append(x)

print("old array : ",arr)
# without using function
rev = arr[::-1]
print("new array : ",rev)

# using a function
'''arr.reverse()
print(arr)'''



