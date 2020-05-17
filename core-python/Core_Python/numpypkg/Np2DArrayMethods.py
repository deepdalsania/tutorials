from numpy import *

arr1 = array([
    [1,2,3,4,3,2],
    [4,5,6,7,8,9]
])

print("print array : ",arr1)
print("type : ",arr1.dtype)
print("dimension : ",arr1.ndim)
print("shape : ",arr1.shape) # rows x colns
print("size : ",arr1.size)
arr2 = arr1.flatten() # convert 2D into 1D
print("arr2(2D to 1D) : ",arr2)
arr3 = arr2.reshape(3,4) # convert 1D to 2D
print("arr3(1D to 2D) : ",arr3)
arr4 = arr3.reshape(2,2,3) # convert 2D to 3D (2 2D array each 2D have 2 1D array and each 1D array have 3 elements)
print("arr4(2D to 3D) : ",arr4)


