def divide(a, b):
    try:
        div = a / b
        ''' If we are use Exception here then it will not raise any because Exception 
            is a super class but whe we use specific error and while divide call 3rd 
            time it raise the TypeError and we don't have except block for that so 
            clean up will call in finally but error will print'''
    except ZeroDivisionError as e:
        print("Division by zero is not possible : ",e)
    else:
        print("Division is :", div)
    finally:
        print("In Finally clause")

divide(2,1)
divide(2,0)
divide('2','2')