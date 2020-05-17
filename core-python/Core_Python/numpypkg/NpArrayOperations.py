from builtins import print

from numpy import *

'''
add any value to each element to the array
arr1 = array([1,2,3,4,7])

arr1+=5
print(arr1)
'''

'''
add two array also called vectorized operation
arr1 = array([1,2,3,4,5])
arr2 = array([6,7,8,9,10])

print("Addition is : " , arr1 + arr2)

'''

arr1 = array([2, 1, 45, 3, 21, 12, 2, 1])
arr2 = array([12, 54, 65, 32, 1, 8, 3, 2, 4])
print("sin : ", sin(arr1))
print("cos : ", cos(arr1))
print("log : ", log(arr1))
print("sqrt : ", sqrt(arr1))
print("sum : ", sum(arr1))
print("min : ", min(arr1))
print("max : ", max(arr1))
# check it print(subtract(arr1-1))
print("sort : ", sort(arr1))
print("unique : ", unique(arr1))
print("concatenate : ", sort(concatenate([arr1, arr2])))
#print("subtract : ",subtract(arr1-1))

# Creating array object
arr = array([[1, 2, 3],
                [4, 2, 5]])

# Printing type of arr object
print("Array is of type: ", type(arr))

# Printing array dimensions (axes)
print("No. of dimensions: ", arr.ndim)

# Printing shape of array rows * cols
print("Shape of array: ", arr.shape)

# Printing size (total number of elements) of array
print("Size of array: ", arr.size)

# Printing type of elements in array
print("Array stores elements of type: ", arr.dtype)
