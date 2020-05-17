'''a,b = 0,1
n = int (input('Enter number for fibonacci series:'))
print(a,b,end=" ")
for i in range(1,n+1):
    a,b = b,a+b
    print(b,end=" ")'''

# using while loop
a, b = 0, 1
n = int(input('Enter number for fibonacci series:'))
while a < n:
    print(a, end=" ,")
    a, b = b, a + b
