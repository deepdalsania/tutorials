import numpy as np

# the last axis is printed from left to right,
# the second-to-last is printed from top to bottom,
# the rest are also printed from top to bottom, with each slice separated from the next by an empty line.
print("1-D Array : ", np.arange(8))
print("2-D Array : ", np.arange(12).reshape(3, 4))
print("3-D Array : ", np.arange(36).reshape(3, 3, 4))

# If an array is too large to be printed, NumPy automatically skips the central part of the array and only prints the corners:
print("1) Skip Elements : ", np.arange(10000))
print("2) Skip Elements : ", np.arange(10000).reshape(100,100))

# To disable this behaviour and force NumPy to print the entire array, you can change the
# printing options using set_printoptions. i.e np.set_printoptions(threshold=sys.maxsize)
