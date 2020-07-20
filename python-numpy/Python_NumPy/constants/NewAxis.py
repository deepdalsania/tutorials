import numpy as np

# A convenient alias for None, useful for indexing arrays
print("Alias of None : ", np.newaxis is None)
arr1 = np.arange(1, 4)
print("Array : ", arr1)
print("NewAxis 1 : ", arr1[:, np.newaxis])
print("NewAxis 2 : ", arr1[:, np.newaxis, np.newaxis])
print("NewAxis Operation : ", arr1[:, np.newaxis] * arr1)

# Outer product, same as outer(arr1, arr2)
arr2 = np.arange(4, 7)
print("Outer Product : ", arr1[:, np.newaxis] * arr2)

# arr1[newaxis, :] is equivalent to arr1[newaxis] and arr1[None]:
print("Shape 1 : ", arr1[np.newaxis, :].shape)
print("Shape 2 : ", arr1[np.newaxis].shape)
print("Shape 3 : ", arr1[None].shape)
print("Shape 4 : ", arr1[:, np.newaxis].shape)
