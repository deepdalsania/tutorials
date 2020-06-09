import numpy as np

# Using hsplit, you can split an array along its horizontal axis, either by specifying the
# number of equally shaped arrays to return, or by specifying the columns after which the
# division should occur

print("<---- hsplit ---->")
a = np.floor(10*np.random.random((2,12)))
print("Array a : ",a)
# **indices_or_sections**
# If indices_or_sections is an integer, N, the array will be divided into N equal arrays along
# axis. If such a split is not possible, an error is raised.
# If indices_or_sections is a 1-D array of sorted integers, the entries indicate where along
# axis the array is split. For example, [2, 3] would, for axis=0, result in
# ary[:2]
# ary[2:3]
# ary[3:]
# If an index exceeds the dimension of the array along axis, an empty sub-array is returned
# correspondingly.
# it split with axis=0(row) but it split vertically
print("hsplit by specifying integer : ",np.hsplit(ary=a,indices_or_sections=3))
print("hsplit by specifying sorted integers : ",np.hsplit(ary=a,indices_or_sections=(4,5)))

print("<--- vsplit ---->")
a = np.floor(10*np.random.random((8,4)))
print("Array a : ",a)
# it split with axis=0(row) but it split horizontally
print("vsplit by specifying integer : ",np.vsplit(ary=a,indices_or_sections=4))
print("vsplit by specifying sorted integers : ",np.vsplit(ary=a,indices_or_sections=(2,5,11)))

# With a higher dimensional array the split is still along the first axis.
b = np.arange(8.0).reshape(2,2,2)
print("Array b : ",b)
print("vsplit by specifying integer : ",np.vsplit(ary=b,indices_or_sections=2))
