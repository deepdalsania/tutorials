import numpy as np

# One-dimensional arrays can be indexed, sliced and iterated over, much like lists and other Python sequences.
print("<---- One Dimensional ---->")
a = np.arange(1,11)**2
print("Array a : ",a)
# indexing
print("Indexing : ",a[4])
# slicing
print("1) slicing : ",a[3:6])
# equivalent to a[0:5:2] = -10; from start to position 5, exclusive, set every 2nd element to -1000
a[:5:2] = -10
print("2) slicing : ",a)
# revers
print("Reverse an array : ",a[::-1])
print("<---- Iterating using for loop ---->")
for i in a:
    # negative number exponent give runtime error so i did this
    if i < 0:
        print((i+0j)**(1/2.))
    else:
        print(i**(1/2.))

# Multidimensional arrays can have one index per axis. These indices are given in a tuple separated by commas:
print("<---- Multi Dimensional ---->")
# if you are not familiar with fromfunction then check My program on this called ArrayCreateFromFunction.py on this package
def mdimDun(x,y):
    return 10*x+y
a = np.fromfunction(function=mdimDun,shape=(5,4),dtype=int)
print("Array a : ",a)
print("Indexing : ",a[2,3])
print("1) Slice each row in the second column of a : ",a[:,1])
print("2) Slice each column in the second and third row of a : ",a[1:3,:])
print("3) the last row. Equivalent to a[-1,:] : ",a[-1])
# for more understanding of slicing an array(1-D,2-D,3-D) check my program ArraySlicing.py on this package
print("<---- 3D Array ---->")
b = np.array( [[[  0,  1,  2],               # a 3D array (two stacked 2D arrays)
                [ 10, 12, 13]],
               [[100,101,102],
                [110,112,113]]])
print("Shape : ",b.shape)
# same as c[1,:,:] or c[1]
print("Slice and indexing : ",b[1,...])
# same as c[:,:,2]
print("Slice and indexing : ",b[...,2])

# Iterating over multidimensional arrays is done with respect to the first axis:
print("<---- Iterating Multidimensional Array ---->")
for row in a:
    print(row)

# However, if one wants to perform an operation on each element in the array, one can use the
# flat attribute which is an iterator over all the elements of the array:
print("<---- Iterate over each element of array ---->")
for element in a.flat:
    print(element)