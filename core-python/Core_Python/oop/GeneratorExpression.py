''' The syntax for generator expression is similar to that of a list comprehension in Python.
    But the square brackets are replaced with round parentheses. '''
''' The major difference between a list comprehension and a generator expression is that a list
    comprehension produces the entire list while the generator expression produces one item at
    a time.'''

''' why we need a generator in python? '''
''' 1.Easy to Implement
    2.Memory Efficient
    3.Represent Infinite Stream
    4.Pipelining Generators 
    for more kindly visit : https://www.programiz.com/python-programming/generator '''

lst1 = [1,2,3,4]

# square each term using list comprehension
sqcompre = [a**2 for a in lst1]

# same thing can be done using generator expression
sqgenerator = (a**2 for a in lst1)

print("Square using list comprehension : ",sqcompre)
''' below one print an object '''
# print("Square using generator expression : ",sqgenerator)
print("Square using generator expression : ")
for i in sqgenerator:
    print(i)