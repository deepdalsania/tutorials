a = int(input("Enter a first number : "))
b = int(input("Enter a first number : "))

try:
    print("Division is : ",a/b)
except ZeroDivisionError as e:
    print("Division by zero is not possible : ",e)
finally:
    print("A is Greater than B" if a>b else "B is Greater than A")