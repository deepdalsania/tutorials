''' The from clause is used for exception chaining '''

try:
    print(1/0)
except Exception as e:
     ''' Both methods give a 2 exception one zerodivision and second runtime because exception chaining 
        is not suppressed '''
     # raise RuntimeError("Something bad happened") from e
     # raise RuntimeError("Something bad happened")
     ''' Exception chaining is suppressed by specifying None in the from caluse'''
     raise RuntimeError("Something bad happened") from None

