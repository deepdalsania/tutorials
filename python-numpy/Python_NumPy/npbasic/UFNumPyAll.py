import numpy as np

# Test whether all array elements along a given axis evaluate to True.
# Not a Number (NaN), positive infinity and negative infinity evaluate to True because these are not equal to zero.
print("1) condition 1 : ",np.all([(True,False),(True,True)]))
print("axis 0 : ",np.all([(True,False),(True,True)],axis=0))
print("2) condition 2 : ",np.all([-1,2,4]))
print("3) condition 3 : ",np.all([1.0, np.nan]))
a = np.array(False)
b = np.all([-1,2,5],out=a)
print("id of a is {}, id of b is {}, b Array {}".format(id(a),id(b),b))

