import pandas as pd
import numpy as np

# This case is handled identically to a dict of arrays.
data = np.zeros(shape=(2,), dtype=[('A', 'i4'), ('B', 'f4'), ('C', 'a10')])
data[:] = [(1, 2, 'Hello'), (3., 4., "World")]
df = pd.DataFrame(data=data)
print("DataFrame from Structured array : ")
# we get third column output as byte
print(df)
df = pd.DataFrame(data=data, index=['first', 'second'])
print("DataFrame from Structured array with index : ")
print(df)
pd.DataFrame(data, index=['first', 'second'], columns=['C', 'A', 'B'])
print("DataFrame from Structured array with index and columns : ")
# DataFrame is not intended to work exactly like a 2-dimensional NumPy ndarray.
print(df)