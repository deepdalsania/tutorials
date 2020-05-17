import sys
''' Before an except clause’s suite is executed, details about the exception are stored
    in the sys module and can be accessed via sys.exc_info(). sys.exc_info() returns a
    3-tuple consisting of the exception class, the exception instance and a traceback
    object identifying the point in the program where the exception occurred. sys.exc_info()
    values are restored to their previous values (before the call) when returning from
    a function that handled an exception.'''

''' If no exception is being handled anywhere on the stack, a tuple containing three None 
    values is returned. Otherwise, the values returned are (type, value, traceback). 
    Their meaning is: type gets the type of the exception being handled 
    (a subclass of BaseException); value gets the exception instance 
    (an instance of the exception type); traceback gets a traceback object which 
    encapsulates the call stack at the point where the exception originally occurred.'''

lst = ['a',0,5]

for i in lst:
    try:
        print("The entry is : ",i)
        rec = 1/int(i)
        break
    except:
        ''' It returns whole tuple '''
        print("An Error ", sys.exc_info()," Occured")
        ''' It returns type '''
        # print("First index sys.exc_info() : ",sys.exc_info()[0])
        ''' It returns value '''
        # print("Second index sys.exc_info() : ",sys.exc_info()[1])
        ''' It returns traceback '''
        # print("Third index sys.exc_info() : ",sys.exc_info()[2])
        print("Next entry")
        print()
print("The reciprocal of : ", i, "is", rec)