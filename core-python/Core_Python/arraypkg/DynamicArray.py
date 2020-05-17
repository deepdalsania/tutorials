from array import *
from builtins import print

arr = array('i',[])
n = int (input('Enter the length of array : '))
print('Enter the values : ')

for i in range(n):
    x = int (input())
    arr.append(x)

print(arr)

val = int (input('Enter the value for search : '))
# print('index of value is : ',arr.index(val))
'''k = 0
for j in arr:
    if (j == val):
        print(k)
        break
    k+=1'''
for j in arr:
    if (j == val):
        print('index of value is : ', arr.index(val))
        break
    else:
        print('Value Not Found')
        break


