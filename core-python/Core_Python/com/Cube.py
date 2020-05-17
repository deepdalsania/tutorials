import math as m
from builtins import eval

'''a = int(input("Enter a number for cube : "))
print(a**3)'''

'''a = eval(input('Enter an expression for cube : '))
print(a)'''

a = int(input("Enter a number for cube : "))
print(int(m.pow(a,3))) # if it is not converted into int then it will give an output as 8.0