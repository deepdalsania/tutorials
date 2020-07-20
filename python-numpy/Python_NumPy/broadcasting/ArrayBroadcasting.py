from numpy import array

# In order to broadcast, the size of the trailing axes for both arrays in an operation
# must either be the same size or one of them must be one.
# Reference : https://numpy.org/devdocs/user/theory.broadcasting.html
arr1 = array([1, 2, 3])
arr2 = array([4,4,4])
print("Array Multiplication with Array: ", arr1 * arr2)
arr1 = array([1, 2, 3])
arr2 = 4
print("Array Multiplication with Scalar: ", arr1 * arr2)
