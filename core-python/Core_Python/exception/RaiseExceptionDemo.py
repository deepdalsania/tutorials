''' Kindly check raisestatement for another methods '''
''' Another method to raise an exception '''
''' The raise statement allows the programmer to force a specified exception to occur. '''

try:
    raise NameError('HelloPythonians')
except Exception:
    print('An exception flew by!')
    ''' If you need to determine whether an exception was raised but don’t intend to handle
        it, a simpler form of the raise statement allows you to re-raise the exception:'''
    raise