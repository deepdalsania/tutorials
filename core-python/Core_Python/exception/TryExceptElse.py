''' The optional else clause is executed if the control flow leaves the try suite,
    no exception was raised, and no return, continue, or break statement was executed '''

a = int(input("Enter a first number : "))
b = int(input("Enter a first number : "))

try:
    print("Division is : ", a / b)
except ZeroDivisionError as e:
    print("Division by zero is not possible : ", e)
else:
    ''' It will executed if exception occurs so we can do other code in else block which will
        execute even if exception occurs so we can reduce overhead in try block and when try
        generate exception after that line all code will not execute then we'll do code in 
        else block for further execution so it is different from finally because finally
        execute either exception generate or not. '''
    print("A is Greater than B" if a > b else "B is Greater than A")
