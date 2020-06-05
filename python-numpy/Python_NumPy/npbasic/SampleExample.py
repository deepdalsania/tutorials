from builtins import type

import numpy as np

a = np.arange(15).reshape(3,5)
print("Array : ",a)
print("Shape : ",a.shape)
print("Dimensions : ",a.ndim)
print("DType : ",a.dtype.name)
# the size in bytes of each element of the array. For example, an array of elements of type
# float64 has itemsize 8 (=64/8)
print("Item size : ",a.itemsize)
print("Size : ",a.size)
print("Type : ",type(a))