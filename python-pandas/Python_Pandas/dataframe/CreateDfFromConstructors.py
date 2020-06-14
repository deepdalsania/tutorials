import pandas as pd
import numpy as np

# DataFrame.from_dict takes a dict of dicts or a dict of array-like sequences and returns
# a DataFrame. It operates like the DataFrame constructor except for the orient parameter
# which is 'columns' by default, but which can be set to 'index' in order to use the dict
# keys as row labels.
data = dict([('a',[1,2,3]),('b',[4,5,6])])
df = pd.DataFrame.from_dict(data=data)
print("<---- DataFrame using from_dict() constructor ---->")
# keys will be the column label
print("DataFrame using from_dict() constructor with default orient='columns' : ")
print(df)
df = pd.DataFrame.from_dict(data=data,orient='index')
# if we don't specify columns then it will take default from 0
print("DataFrame using from_dict() constructor with orient='index : ")
# keys will be the row label
print(df)
# we cannot use columns parameter with orient='columns' otherwise it will raise ValueError
df = pd.DataFrame.from_dict(data=data,orient='index',columns=['one','two','three'])
print("DataFrame using from_dict() constructor with orient='index and columns : ")
# keys will be the row label
print(df)

# DataFrame.from_records takes a list of tuples or an ndarray with structured dtype. It
# works analogously to the normal DataFrame constructor, except that the resulting
# DataFrame index may be a specific field of the structured dtype.
print("<----  DataFrame using from_records constructor ---->")
data = np.zeros(shape=(2,), dtype=[('A', 'i4'), ('B', 'f4'), ('C', 'S10')])
data[:] = [(1, 2, 'Hello'), (3., 4., "World")]
df = pd.DataFrame.from_records(data=data)
print("DataFrame using from_records without passing index : ")
print(df)
df = pd.DataFrame.from_records(data=data,index='C')
print("DataFrame using from_records with index : ")
print(df)
