n = int (input('Enter a number for prime number series : '))
for i in range(2,n):
    for j in range(2,i):
        if i % j == 0:
            print(i,"is not a prime number because",j,"*",i//j,"=",i)
            break
    else:
        print(i,"is a prime number")