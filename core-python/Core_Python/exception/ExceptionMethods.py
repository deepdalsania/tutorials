''' e. and use all methods '''
''' also try different exception like java file,array,string,numberformat '''
''' user define exception '''

try:
    raise Exception('spam,','eggs')
except Exception as inst:
    print("Type of instance : ",type(inst)) # the exception instance
    print("Arguments of instance : ",inst.args) # arguments stored in .args
    print("Instance print : ",inst) # __str__ allows args to be printed directly,but may be overridden in exception subclasses
    a,b = inst.args # unpack args
    print("a : ",a)
    print("b : ",b)