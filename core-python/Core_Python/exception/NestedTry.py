a = int(input("Enter a first number : "))
b = int(input("Enter a first number : "))
string = "foo"
try:
    print("Inside try block")
    ''' If exception occurs here then it will skipp inside try caluse '''
    print("Division is : ",a/b)
    try:
        print("Inside try block of try block ")
        print("Value of string is : ",int(string))
    except ValueError as e:
        print("Invalid Input : ",e)
except ZeroDivisionError as e:
    print("Division by zero is not possible : ",e)