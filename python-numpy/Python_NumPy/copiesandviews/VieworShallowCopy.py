import numpy as np

# Different array objects can share the same data. The view method creates a new array object
# that looks at the same data.

arr1 = np.arange(10)
arr2 = arr1.view()
print("is operator : ",arr2 is arr1)
# arr2 is a view of the data owned by arr1
print("base attribute : ",arr2.base is arr1)
print("owndata attribute of flags attribute : ",arr2.flags.owndata)
arr2.shape = 2,5
# arr1's shape doesn't change
print("shape of arr1 (not changed) : ",arr1.shape)
arr2[0,4] = 20
print("arr1 array (arr1 data changes) : ",arr1)
print("<---- Slicing an array returns a view of it ---->")
arr3 = arr2[:,1:4] # spaces added for clarity; could also be written "arr3 = arr1[:,1:4]"
arr3[:] = 10 # arr3[:] is a view of arr3. Note the difference between arr3=10 and arr3[:]=10
print("arr2 : ",arr2)