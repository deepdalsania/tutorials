a = int(input("Enter a first number : "))
b = int(input("Enter a first number : "))

try:
    print("Division is : ", a / b)
    n = int(input("Enter a number : "))
    print(n)
    ''' If we are doing below things then it will override all other exception because Exception
        is superior than all'''
    ''' except Exception as e:
        print("Something went wrong : ", e) '''
    ''' also we can use below syntax for multi except by using tuple but we have to put Exception at last '''
    '''except (ZeroDivisionError,ValueError,Exception) as e:
        print(e)'''
except ZeroDivisionError as e:
    print("Division by zero is not possible : ", e)
except ValueError as e:
    print("Invalid Input : ", e)
except Exception as e:
    print("Something went wrong : ", e)
