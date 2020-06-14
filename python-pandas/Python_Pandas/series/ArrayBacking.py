import pandas as pd
import numpy as np

s = pd.Series(data = np.random.random(5),index=['a','b','c','d','e'])
print("Array is : ")
# Accessing the array can be useful when you need to do some operation without the index
# (to disable automatic alignment(https://pandas.pydata.org/docs/getting_started/dsintro.html#dsintro-alignment), for example).

# Series.array will always be an ExtensionArray(https://pandas.pydata.org/docs/reference/api/pandas.api.extensions.ExtensionArray.html#pandas.api.extensions.ExtensionArray).
# Briefly, an ExtensionArray is a thi wrapper around one or more concrete arrays like a numpy.ndarray.
print(s.array)
# While Series is ndarray-like, if you need an actual ndarray, then use Series.to_numpy().
print("ndarray is : ")
print(s.to_numpy())
