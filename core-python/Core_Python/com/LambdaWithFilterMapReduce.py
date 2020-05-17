from functools import reduce
from math import fsum

n = int(input("How many number you want to enter for even and odd numbers ? : "))
lst = []
for i in range(n):
    j = int(input("Enter any positive number : "))
    lst.append(j)

evens = list(filter(lambda i: i % 2 == 0, lst))
print("Number of even numbers from list is : ", evens)
doubles = list(map(lambda i: i+i,evens))
print("Double even values : ",doubles)
print("Sum of all even numbers after doubling them : ",reduce(lambda a,b : a+b,doubles))

