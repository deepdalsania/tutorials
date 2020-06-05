import numpy as np

# Arithmetic operators on arrays apply element wise. A new array is created and filled with the result.
print("<---- Arithmatic Operation --->")
a = np.array([12,45,85,96])
b = np.arange(5,9)
print("Subtraction : ",a-b)
print("Power of 2 of b array : ",b**2)
print("Sin of a : ",10*np.sin(a))
print("Less than operator : ",a<79)

# Unlike in many matrix languages, the product operator * operates element wise in NumPy arrays.
# The matrix product can be performed using the @ operator (in python >=3.5) or the dot function
# or method
print("<---- Product of array ---->")
a = np.array([(1,2),(3,4)])
b = np.array([[5,6],[7,8]])
print("Element wise product : ",a*b)
print("Matrix product : ",a@b)
print("Another matrix product : ",a.dot(b))

# Some operations, such as += and *=, act in place to modify an existing array rather than
# create a new one.
print("<---- Assignment operator --->")
a = np.ones(shape=(2,3),dtype=int)
b = np.random.rand(2,3)
a *= 3
print("Multiply by 3 to each element of Array a : ",a)
# a += b this is not possible here because a in type of int and b is float because randome gives
# float default
b += a
print("Adding each element of a with b : ",b)

# When operating with arrays of different types, the type of the resulting array corresponds to
# the more general or precise one (a behavior known as upcasting).
print("<---- Upcasting of array ---->")
a = np.ones(3,dtype=np.int32)
b = np.linspace(0,np.pi,3)
print("dtype of b : ",b.dtype)
c = a + b
print("Addition of a and b : ",c)
print("dtype of c : ",c.dtype)
d = np.exp(c*1j)
print("exp of c : ",d)
print("dtype of d : ",d.dtype)

# Many unary operations, such as computing the sum of all the elements in the array, are
# implemented as methods of the ndarray class.
print("<---- Common ndarray operations ---->")
a = np.random.random((3,2))
print("Sum : ",a.sum())
print("Min : ",a.min())
print("Max : ",a.max())

# By default, these operations apply to the array as though it were a list of numbers,
# regardless of its shape. However, by specifying the axis parameter you can apply an operation
# along the specified axis of an array:
print("<---- Common ndarray operations using axis ---->")
b = np.arange(12).reshape(3,4)
print("b Array : ",b)
print("Sum of each column : ",b.sum(axis=0))
print("Sum of each row : ",b.sum(axis=1))
print("Cumulative sum along each row : ",b.cumsum(axis=1))
