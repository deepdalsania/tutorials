import numpy as np
import time, sys

lst = range(1000)
arr = np.arange(1000)

# less memory
print("Memory occupied in list : ",sys.getsizeof(4)*len(lst)) # in getsizeof() we have to pass any one element
print("Memory occupied in numpy : ",arr.size*arr.itemsize)

# less time
size = 10000
lst1 = range(size)
lst2 = range(size)

arr1 = np.arange(size)
arr2 = np.arange(size)
start = time.time()
result = [(x,y) for x, y in zip(lst1,lst2)]
print("Time(ms) taken by list : ",(time.time()-start)*1000)
start = time.time()
result = arr1+arr2
print("Time(ms) taken by numpy : ",(time.time()-start)*1000)