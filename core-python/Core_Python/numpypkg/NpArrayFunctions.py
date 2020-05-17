from numpy import *

#single dimesional array

# not working
'''arr = array(int,[1,2,3,4,5])
arr = array([1,2,3,4,5],'i')
arr = array('i',[1,2,3,4,5])'''

# this is right syntax
'''arr = array([1,2,3,4,5],int)
arr = array([1,2,3,4,5])
print(arr)'''
'''arr = array([1,2,3,4,5])
print(arr.dtype)
print(arr)'''

# it converts all the values into float
'''arr = array([1,2,3,4,5.0])
print(arr.dtype)
print(arr)'''


# linspace function

#arr = linspace(0,15,16) # it decvides the 0 to 15 in to 16 parts
#arr = linspace(0,15,20)
'''arr = linspace(0,16) # if we not specify a stop limit then the last element is take as a part of numbers 
print(arr)'''

# arange function
'''arr = arange(1,15,2) # same as range and its not a arrange it is a  (a range)
print(arr)'''

# logspace function

''''# arr = logspace(1,40,5) # spacing between 2 numbers would be depend upon a log of it, this will start from 10^1 to 10^40 it will get devide into 5 parts
#print(arr)
# print(arr[0])
# print('%.4f' %arr[4])
arr = logspace(1,10,4)
print(arr)'''

# zeros function
'''# arr = zeros(5) # default values is 0 and its in float
arr = zeros(5,int)
print(arr)'''

#ones function
'''#arr = ones(5) # default values is 1 and its in float
arr = ones(5,int)
print(arr)'''
