from numpy import *

arr1 = array([1,2,3])
arr2 = array([4,5,6])


# concatenate two arrays

# using list comprehension to concat
arr3 = [y for x in [arr1 , arr2] for y in x]
print("concatenated array : ",arr3)

# sum of both elements
for i in range(0, len(arr2)):
    arr1[i]+=arr2[i]
print("new array : ",arr1)
