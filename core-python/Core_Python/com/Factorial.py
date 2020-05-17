from math import factorial

# Factorial using in built function in math
# print("Factorial is : ",factorial(int(input("Enter number for finding factorial : "))))


def fact(n):
    f = 1
    for i in range(1,n+1):
        f = f * i
    return f

n = int(input("Enter number for finding factorial : "))
print("Factorial is : ", fact(n))