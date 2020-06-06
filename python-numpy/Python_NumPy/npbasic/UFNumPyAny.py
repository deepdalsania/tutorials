import numpy as np

# Test whether any array element along a given axis evaluates to True.
# Returns single boolean unless axis is not None
# Not a Number (NaN), positive infinity and negative infinity evaluate to True because these are not equal to zero.
print("1) condition 1 : ",np.any([(True,False),(True,True)]))
print("axis 0 : ",np.any([(True,False),(True,True)],axis=0))
print("2) condition 2 : ",np.any([-1,2,4]))
print("3) condition 3 : ",np.any(np.nan))
a = np.array(False)
b = np.all([-1,2,5],out=a)
print("Array a : {} , Array b : {}".format(a,b))
print("Check now that b is a reference to a : ",b is a)
print("id of a : {}, id of b : {}".format(id(a), id(b)))