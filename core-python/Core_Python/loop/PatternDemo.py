
'''for i in range(1,6):
    for j in range(1,6):
        print('*',end="")
    print()'''

'''for i in range(1,6):
    for j in range(6-i):
        print('*',end="")
    print()'''

'''for i in range(1,6):
    for j in range(i):
        print('*',end="")
    print()'''

'''for i in range(1,5):
    for j in range(5-i):
        print(i,end="")
    print()'''

'''for i in range(1,5):
    for j in range(5-i):
        print(j+1,end="")
    print()'''

'''for i in range(1,5):
    for j in range(5-i):
        print(i+j,end="")
    print()'''

'''k = 4
for i in range(5):
    for j in range(k):
        print(end=" ")
    k-=1
    for j in range(i+1):
        print('*',end="")
    print("\r")'''

'''k = 4
for i in range(5):
    for j in range(k):
        print(end=" ")
    k-=1
    for j in range(i+1):
        print('* ',end="")
    print("\r")'''

s1 = 'ABCD'

s2 = 'PQR'
for i in range(4):
       # s1[:i+1] called string slicing
     print(s1[:i+1]+s2[i:],end="")
     print("\r")

