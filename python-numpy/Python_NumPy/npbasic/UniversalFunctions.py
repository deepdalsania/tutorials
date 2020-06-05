import numpy as np
from math import pow,exp
# NumPy provides familiar mathematical functions such as sin, cos, and exp. In NumPy, these are
# called “universal functions”(ufunc). Within NumPy, these functions operate elementwise on an
# array, producing an array as output.

# exp Return e raised to the power of x. where e = 2.71828183
# both are almost same there is minor difference between both
print("<---- exp function explanation ---->")
print("Power : ",pow(2.71828183,2))
print("Exponential : ",exp(2))

print("<---- Universal functions ---->")
a = np.arange(3)
print("a Array : ",a)
print("exp of a : ",np.exp(a))
print("sqrt of a : ",np.sqrt(a))
b = np.array([4,5,-6])
print("add : ",np.add(a,b))