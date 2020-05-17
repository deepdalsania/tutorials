def fibo(n):
    a, b = 0, 1
    res = []
    while a <= n:
        res.append(a)
        a, b = b, a + b
    return res

n = int(input("Enter number for fibonacci series : "))
print("Fibonacci series is up to entered number : ", fibo(n))
