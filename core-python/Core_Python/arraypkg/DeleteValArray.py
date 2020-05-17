from array import *
from builtins import print

arr = array('i',[])
n = int (input('Enter the length of array : '))
print('Enter the values : ')

for i in range(n):
    x = int (input())
    arr.append(x)

print(arr)


# removes from a specific index
# arr.pop(0)


# del removes the item at a specific index
del arr[2]

print('After Deleting at 2 index : ',arr)

# using a function remove
# it removes the first matching value not a specific index
'''for j in arr:
    arr.remove(j)'''

