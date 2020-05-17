def fibo(n):
    if n <= 1:
        return n
    else:
        return (fibo(n-1)+fibo(n-2))

n = int(input("Enter positive number for fibonacci series : "))
print("Fibonacci series is up to entered number : ")
for i in range(0,n+1):
    print(fibo(i),end=",")