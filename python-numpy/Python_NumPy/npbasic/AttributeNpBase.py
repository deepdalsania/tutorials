import numpy as np

# Base object if memory is from some other object.
a = np.array([1,2,3,4,5,6,7,8,9,10])
print("The base of an array that owns its memory is None : ",a.base is None)
b = a[4:9]
print("Slicing creates a view, whose memory is shared with a : ",b.base is a)