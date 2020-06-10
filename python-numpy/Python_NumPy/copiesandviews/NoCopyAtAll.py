import numpy as np

# Simple assignments make no copy of array objects or of their data.
a = np.arange(10)
b = a # no new object is created
print("is operator : ",b is a)
b.shape = 2,5
print("shape of a : ",a.shape)

# Python passes mutable objects as references, so function calls make no copy.
def find_id(a):
    print("id of a using function calling : ",id(a))
print("id of a : ",id(a)) # id is a unique identifier of an object
find_id(a)