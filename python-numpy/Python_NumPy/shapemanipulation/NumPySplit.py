import numpy as np

# Split an array into multiple sub-arrays as views into ary.
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
# axis : The axis along which to split, default is 0(row).
print("<---- split method ---->")
a = np.arange(1.0, 11.0)
print("Array a : ", a)
print("split array by specifying integer : ", np.split(ary=a, indices_or_sections=5, axis=0))
a = np.arange(9.0)
print("split array by specifying sorted integer : ", np.split(ary=a, indices_or_sections=(2, 5, 6, 10)))

print("<---- array_split ---->")
#  The only difference between these functions is that array_split allows indices_or_sections
#  to be an integer that does not equally divide the axis. For an array of length l that should
#  be split into n sections, it returns l % n sub-arrays of size l//n + 1 and the rest of
#  size l//n.
a = np.arange(11.0)
print("Array a : ", a)
# if we want unequal partition then we can use this
print("array_split array by specifying integer : ", np.array_split(ary=a, indices_or_sections=4, axis=0))
