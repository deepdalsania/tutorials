import numpy as np
from numpy import newaxis
# Several arrays can be stacked together along different axes
print("<---- vstack and hstack ---->")
a = np.floor(10*np.random.random((2,2)))
b = np.floor(10*np.random.random((2,2)))
print("Array a : ",a)
print("Array b : ",b)

print("Vertical stack : ",np.vstack((a,b)))
print("Horizontal stack : ",np.hstack((a,b)))

# The function column_stack stacks 1D arrays as columns into a 2D array. It is equivalent to
# hstack only for 2D arrays
print("<---- column stack ---->")
print("Column stack : ",np.column_stack((a,b)))
a = np.array([2.,3.])
b = np.array([4.,5.])
# returns a 2D array
print("column stack on 1-D array : ",np.column_stack((a,b)))
# the result is different
print("hstack on 1-D array : ",np.hstack((a,b)))
# this allows to have a 2D columns vector
print("newaxis : ",a[:,newaxis])
print("column stack with newaxis : ",np.column_stack((a[:,newaxis],b[:,newaxis])))
print("hstack with newaxis : ",np.column_stack((a[:,newaxis],b[:,newaxis])))
# row stack
print("<---- rowstack ---->")
print("row stack using ma.row_stack : ",np.ma.row_stack((a,b)))

print("<---- dstack ---->")
# dstack : Stack arrays in sequence depth wise (along third axis).
a = np.array((1,2,3))
b = np.array((2,3,4))
print("1-D dstack : ",np.ma.dstack((a,b)))
a = np.array([[1],[2],[3]])
b = np.array([[2],[3],[4]])
print("2-D dstack : ",np.dstack((a,b)))

print("<---- stack ---->")
# Join a sequence of arrays along a new axis.
# The axis parameter specifies the index of the new axis in the dimensions of the result.
# For example, if axis=0 it will be the first dimension and if axis=-1 it will be the last dimension.
arrays = [np.random.randn(3, 4) for _ in range(10)]
print("stack with axis-0 : ",np.stack(arrays, axis=0).shape)
print("stack with axis-1 : ",np.stack(arrays, axis=1).shape)
print("stack with axis-(-1) : ",np.stack(arrays, axis=-1).shape)
a = np.array([1, 2, 3])
b = np.array([2, 3, 4])
print("1-D array stack : ",np.stack((a, b)))
print("1-D stack ith axis (-1) : ",np.stack((a, b), axis=-1))
