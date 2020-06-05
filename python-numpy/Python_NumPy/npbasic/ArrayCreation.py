from builtins import complex
import numpy as np

# by using array function
# a = np.array(1, 2, 3, 4)  # WRONG
a = np.array([1,2,3])
print("Array A : ",a)
print("Dtype of array a : ",a.dtype)
b = np.array([1.1,2.2,3.3])
print("Array B : ",b)
print("Dtype of array b : ",b.dtype)

# array transforms sequences of sequences into two-dimensional arrays, sequences of sequences
# of sequences into three-dimensional arrays, and so on.
ta = np.array([(1.1,2.2),(3,4)])
print("2-D Array from Sequences : ",ta)
print("Dimension : ",ta.ndim)

# The type of the array can also be explicitly specified at creation time:
c = np.array([[1,2],[3,4]],dtype=complex)
print("Array with type specified at creation time : ",c)

# The function zeros creates an array full of zeros
print("Zeros : ",np.zeros(shape=(3,4),dtype=np.int16))

# The function ones creates an array full of ones
print("Ones : ",np.ones(shape=(2,3,4),dtype=np.int16))

# The function empty creates an array whose initial content is random and depends on the state
# of the memory. By default, the dtype of the created array is float64.
print("Array using Empty : ",np.empty(shape=(2,3)))

# To create sequences of numbers we can use arange function
# by using arange we can not predict the number of elements because the third parameter is steps
# that specifies that these much steps you have to add after one increment or decrement
# here arange is same as range it includes lower bond, not include upper bound and third is steps
print("Array creation using arange function : ",np.arange(5,55,5))
print("arange using float : ",np.arange(0.1,1.1,0.2))

# For predicting the number of elements we can use linspace function to create an array
# it gives 4 numbers from 0.1 to 2
print("Array creation using linspace : ",np.linspace(0.1,2,4))
print("Num attribute",np.linspace(2.0, 3.0, num=5))
# default true means upper bound is the last element
print("Endpoint attribute : ",np.linspace(2.0, 3.0, num=5, endpoint=False))
# if Ture, return (samples, step), where step is the spacing between samples.
print("Retstep attribute : ",np.linspace(2.0, 3.0, num=5, retstep=True))
# useful to evaluate function at lots of points
x = np.linspace(0,2*np.pi,10)
print("Sin() using linspace : ",np.sin(x))

# Array creation using log space where start = base ** start(pow(base,start)) same as stop
print("Array creation using logspace : ",np.logspace(2.0, 3.0,base=10.0))
print("Num Attribute : ",np.logspace(2.0, 3.0, num=4))
# default true means upper bound is the last element
print("Endpoint attribute : ",np.logspace(2.0, 3.0, num=4, endpoint=False))
# default bse is 10.0 (float)
print("Base attribute : ",np.logspace(2.0, 3.0, num=4, base=2.0))

# array creation using geomspace(), Return numbers spaced evenly on a log scale
# (a geometric progression).
# This is similar to logspace, but with endpoints specified directly. Each output sample is a
# constant multiple of the previous.
# num attribute default 50
print("Array creation using geomspace : ",np.geomspace(1, 100))
# num and endpoint
print("1) num and endpoint attributes : ",np.geomspace(1, 100, num=3, endpoint=False))
print("2) num and endpoint attributes : ",np.geomspace(1, 100, num=4, endpoint=False))
print("num attribute : ",np.geomspace(1, 512, num=9))
print("dtype attribute : ",np.geomspace(1, 512, num=9, dtype=int))
print("around() : ",np.around(np.geomspace(1, 512, num=9)).astype(int))

# array creation using random.rand()
print("Array creation using random.rand() : ",np.random.rand(3,2))




