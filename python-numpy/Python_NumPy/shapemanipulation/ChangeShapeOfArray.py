import numpy as np

# An array has a shape given by the number of elements along each axis
a = np.floor(10*np.random.random((3,4)))
print("Array a : ",a)
print("Shape : ",a.shape)

# The shape of an array can be changed with various commands. Note that the following three
# commands all return a modified array, but do not change the original array

# returns the array, flattened
print("ravel : ",a.ravel())
# returns the array with a modified shape
print("reshape : ",a.reshape(6,2))
# returns the array, transposed
print("transposed : ",a.T)
print("transposed shape : ",a.T.shape)
print("array shape : ",a.shape)

# The reshape function returns its argument with a modified shape, whereas the ndarray.resize
# method modifies the array itself
print("resize : ",a.resize((2,6)))

# If a dimension is given as -1 in a reshaping operation, the other dimensions are automatically calculated
print("-1 in reshaping operation : ",a.reshape(3,-1))
