import numpy as np

# 1D array slicing
arr10 = np.array([1, 3, 5, 7, 9, 11, 13])
print("full : ",arr10[:])
print("first 4 elements : ",arr10[:4])
# slicing include upper limit and lower exclude and range exclude upper limit
print("4th elements : ",arr10[3:4])
# when we use - indexing upper limit is excluded
print("last 2 elements not consider : ",arr10[:-2])
print("from last 2nd plus 3 elements : ",arr10[-5:-2])
print("last 3rd element : ",arr10[-3:-2])
# reverse
print("reveres array : ",arr10[::-1])


# 2D array slicing
arr11 = np.array([[1, 4, 5, 12, 14],
    [-5, 8, 9, 10, 17],
    [-6, 7, 11, 19, 21]])

print("Full : ",arr11[:,:]) # arr11[row slice,col slice]
# lower limit is excluded
print("arr11[2,4] : ",arr11[1:2,3:4])
print("first 2 rows and 3 columns",arr11[:2,:3])
print("third row with all columns: ",arr11[2:3,])
# in - indexing upper limit is excluded
print("arr11[1,2] : ",arr11[-3:-2,-4:-3])

arr12 = np.array([[1, 4, 5, 12,21,22],
    [-5, 8, 9, 10,23,24],
    [-6, 7, 11, 19,25,26]])

arr13 = arr12.reshape(2,3,3)
print("full : ",arr13)
''' output of above
[[[ 1  4  5]
  [12 21 22]
  [-5  8  9]]

 [[10 23 24]
  [-6  7 11]
  [19 25 26]]]

from above first 3*3 matrix is
  [ 1  4  5]
  [12 21 22]
  [-5  8  9]
  second 3*3 matrix is
  [10 23 24]
  [-6  7 11]
  [19 25 26] '''
# check below description for understand all parameters
print("all matrices only, first column : ",arr13[:,:,:1])
'''B[:,:,1] we are passing : , : and 1. First : indicates that we are selecting both the 3X3 matrices.
The second : indicates that we are selecting all the rows from both the 3X3 matrices. The third parameter 
1 indicates that we are selecting only the second column values of all the rows from both the 3X3 matrices'''

print("all matrices ,second row , second and third column : ",arr13[:,1:2,1:3])
print("2 matrix ,second and third row , second and third column : ",arr13[1:2,1:3,1:3])