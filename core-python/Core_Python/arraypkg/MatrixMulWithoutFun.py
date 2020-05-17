n1 = int(input("Enter a numbers of rows for matrix1 : "))
m1 = int(input("Enter a numbers of cols for matrix1 : "))
arr1 = []
arr2 = []
for i in range(n1):
    arr3 = []
    for j in range(m1):
        o1 = int(input("Enter an element for 1st matrix : "))
        arr3.append(o1)
    arr1.append(arr3)
print("first matrix is : ",arr1)

n2 = int(input("Enter a same numbers rows which must be same as number of cols of matrix 1 : "))
m2 = int(input("Enter a numbers of cols for matrix2 : "))
for i in range(n2):
    arr4 = []
    for j in range(m2):
        o2 = int(input("Enter an element for 2nd matrix : "))
        arr4.append(o2)
    arr2.append(arr4)
print("second matrix is  : ", arr2)
arr6 = []
for i in range(n1):
    arr5 = []
    for j in range(m2):
        arr5.append(0)
    arr6.append(arr5)

# rows of arr1
for i in range(len(arr1)):
    # cols of arr2
    for j in range(len(arr2[0])):
        # rows of arr2
        for k in range(len(arr2)):
            arr6[i][j] += arr1[i][k] * arr2[k][j]

for i in arr6:
    print(i)