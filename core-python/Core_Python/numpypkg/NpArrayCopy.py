from numpy import *

# Aliasing (new array from existing array but we have only one array in memory because address is same)
'''arr1 = array([1,2,3,4,5,6])
arr2 = arr1
print("old array : ",arr1)
print("new array : ",arr2)
print("old id : ",id(arr1))
print("new id : ",id(arr2))'''

# shallow copy (changes will affect in both array)
'''arr1 = array([1,2,3,4,5,6])
arr2 = arr1.view()
arr1[1] = 20
print("old array : ",arr1)
print("new array : ",arr2)
print("old id : ",id(arr1))
print("new id : ",id(arr2))'''

# deep copy (changes will affect in only one array)
arr1 = array([1,2,3,4,5,6])
arr2 = arr1.copy()
arr1[1] = 20
print("old array : ",arr1)
print("new array : ",arr2)
print("old id : ",id(arr1))
print("new id : ",id(arr2))
