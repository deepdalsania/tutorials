from math import pow
''' When we have to work with fetching one value and processing it at that time we can use
    generator. Also generator gives us an iterator and yield keyword same as return but return
    break the loop yield don't '''
''' The difference is that while a return statement terminates a function entirely, yield 
    statement pauses the function saving all its states and later continues from there on
    successive calls.'''

def getnum():

    yield 1
    yield 2
    yield 3
    yield 4
    yield 5

vals = getnum();
print("First element : ",vals.__next__())
print("Second element : ",next(vals))
print("Print remaining values using loop : ")
for i in vals:
    print(i)


def powOfTwo():
    ''' We are not using for loop here becasue it has iterator inbuilt'''
    n = 1
    while n <=10:
        yield pow(2,n)
        n+=1

values = powOfTwo()
print("<----- Generator for Power of Two ------>","\nFirst element : ",values.__next__())
print("Second element : ",next(values))
print("Remaining values using for loop : ")
''' If we use powOfTwo() instead of values for iteration then it will print all valuse because
    it will call again so print from first '''
for i in values:
    print(i)