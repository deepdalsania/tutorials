from numpy import *

n = int(input("Enter the size of an array : "))
arr = array([],int)
for i in range(n):
    x = int(input("Enter Element : "))
    arr = append(arr,x)
maxNum = arr[0]
'''for i in arr:
    if i > maxNum:
        maxNum = i'''
w
for i in range(0,len(arr)):
    if arr[i] > maxNum:
        maxNum = arr[i]
print("Maximum number from an array : ", maxNum)