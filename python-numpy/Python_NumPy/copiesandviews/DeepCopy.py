import numpy as np

# The copy method makes a complete copy of the array and its data.
a = np.arange(10)
# a new array object with new data is created
b = a.copy()
print("is operator : ",b is a)
print("base attribute : ",b.base is a)
b.shape = 2,5
print("shape of a (not changed): ",a.shape)
b[0,4] = 10
# data also not changed
print("array a (not changed) : ",a)

# Sometimes copy should be called after slicing if the original array is not required anymore.
# For example, suppose a is a huge intermediate result and the final result b only contains a
# small fraction of a, a deep copy should be made when constructing b with slicing:

#  XeY means x * 10^Y
a = np.arange(int(1e3))
b = a[0:100].copy()
del a  # the memory of ``a`` can be released.
# If b = a[:100] is used instead, a is referenced by b and will persist in memory even if del a is executed.

