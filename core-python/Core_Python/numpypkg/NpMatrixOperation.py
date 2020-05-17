from numpy import *


# matrix function is deprecated check this link -> https://stackoverflow.com/questions/53254738/deprecation-status-of-the-numpy-matrix-class
#m1 = matrix(arr1) # using 2D array
#m2 = matrix('1 2 ; 3 4;5 6;') (2 x 3) using string as arg
#print("diagonal matrix : ",diagonal(m))
'''m1= matrix('1 2 ; 3 4;5 6;')
m2 =matrix('1 2 ; 3 4;5 6;')
m3 = m1 + m2
m4 = m1 * m2'''

'''# matrix multiplication
arr1 = array([[1,2,3,4],[5,6,7,8]])
arr2 = array([[1,2],[3,4],[5,6],[7,8]])

row1 , col1 = arr1.shape
row2 , col2 = arr2.shape
if col1 == row2:
    print("Matrix Multiplication is possible because (%d x %d[row1,col1]) X (%d x %d[row2,col2])"%(row1 , col1,row2,col2),"where %d == %d(col1==row2)"%(col1,row2),"So that it is not possible (%d x %d[row1,col1]) X (%d x %d[row2,col2]) -> (%d x %d[row1,col2])"%(row1 , col1,row2,col2,row1,col2))
    print("Multiplication is : ",arr1.dot(arr2))
else:
    print("Matrix Multiplication is not possible because  (%d x %d[row1,col1]) X (%d x %d[row2,col2])"%(row1 , col1,row2,col2),"where %d != %d(col1!=row2)"%(col1,row2),"So that it is not possible %d x %d X %d x %d -> %d x %d"%(row1 , col1,row2,col2,col1,row2))

# addition
arr3 = array([[1,2],[3,4]])
arr4 = array([[1,2],[3,4]])
row1 , col1 = arr3.shape
row2 , col2 = arr4.shape
if arr3.shape == arr4.shape:
    print("Matrix addition is possible because","shape is (%d,%d) == (%d,%d)"%(row1 , col1,row2,col2))
    print("addition is : ",arr3+arr4) # also use this add(arr3,arr4)
else:
    print("Matrix addition is not possible because","shape is (%d,%d) != (%d,%d)"%(row1 , col1,row2,col2))


# subtraction
arr5 = array([[1,2],[3,4]])
arr6 = array([[2,3],[1,2]])
row1 , col1 = arr5.shape
row2 , col2 = arr6.shape
if arr5.shape == arr6.shape:
    print("Matrix subtraction is possible because","shape is (%d,%d) == (%d,%d)"%(row1 , col1,row2,col2))
    print("Subtraction is : ",arr5-arr6) # subtract(arr3,arr4)
else:
    print("Matrix subtraction is not possible because","shape is (%d,%d) != (%d,%d)"%(row1 , col1,row2,col2))

# element vise multiplication
arr7 = array([[1,2],[3,4]])
arr8 = array([[1,2],[3,4]])
row1 , col1 = arr7.shape
row2 , col2 = arr8.shape
if arr7.shape == arr8.shape:
    print("Matrix element wise multiplication is possible because","shape is (%d,%d) == (%d,%d)"%(row1 , col1,row2,col2))
    print("Multiplication is : ",multiply(arr7,arr8)) # also use arr7*arr8 same for divide
else:
    print("Matrix element wise multiplication is not possible because","shape is (%d,%d) != (%d,%d)"%(row1 , col1,row2,col2))

# Transpose of matrix
arr9 = array([[1, 1], [2, 1], [3, -3]])
print("Transpose of matrix : ",arr9.transpose())'''


# Slicing of Matrix

# 1D array slicing
'''arr10 = array([1, 3, 5, 7, 9, 11, 13])
print("full : ",arr10[:])
print("first 4 elements : ",arr10[:4])
# slicing include upper limit and lower exclude and range exclude upper limit
print("4th elements : ",arr10[3:4])
# when we use - indexing upper limit is excluded
print("last 2 elements not consider : ",arr10[:-2])
print("from last 2nd plus 3 elements : ",arr10[-5:-2])
print("last 3rd element : ",arr10[-3:-2])
# reverse
print("reveres array : ",arr10[::-1])'''


# 2D array slicing
'''arr11 = array([[1, 4, 5, 12, 14],
    [-5, 8, 9, 10, 17],
    [-6, 7, 11, 19, 21]])

print("Full : ",arr11[:,:]) # arr11[row slice,col slice]
# lower limit is excluded
print("arr11[2,4] : ",arr11[1:2,3:4])
print("first 2 rows and 3 columns",arr11[:2,:3])
print("third row with all columns: ",arr11[2:3,])
# in - indexing upper limit is excluded
print("arr11[1,2] : ",arr11[-3:-2,-4:-3])'''

arr12 = array([[1, 4, 5, 12,21,22],
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
