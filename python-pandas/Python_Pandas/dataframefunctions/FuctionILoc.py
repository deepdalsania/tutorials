import pandas as pd

# Purely integer-location based indexing for selection by position.

# .iloc[] is primarily integer position based (from 0 to length-1 of the axis), but
# may also be used with a boolean array.

data_dict = [
    {'a': 10, 'b': 20, 'c': 30},
    {'a': 100, 'b': 200, 'c': 300},
    {'a': 1000, 'b': 2000, 'c': 3000},
    {'a': 10000, 'b': 20000, 'c': 30000},
    {'a': 100000, 'b': 200000, 'c': 300000}
]
df = pd.DataFrame(data=data_dict)
print("<---- Indexing just the rows ---->")
print("<---- With a scalar integer ---->")
print("type : ",type(df.iloc[0]))
print(df.iloc[0])
print("<---- With a list of integers ---->")
print("type : ",type(df.iloc[[0]]))
print(df.iloc[[0]])
print(df.iloc[[0,1]])
print("<---- With a slice object ---->")
# not that not include upper bound
print(df.iloc[:2])
print("<---- With a boolean mask the same length as the index ---->")
print(df.iloc[[False,True,True,False,True]])
# With a callable, useful in method chains. The x passed to the lambda is the DataFrame
# being sliced. This selects the rows whose index label even
print("<---- With a lambda function ---->")
print(df.iloc[lambda i: i.index % 2 == 0])

print("<---- Indexing both axes ----->")
# You can mix the indexer types for the index and columns. Use : to select the
# entire axis.
print("<---- With scalar integers ---->")
print(df.iloc[1,2])
print("<---- With lists of integers ---->")
# first list for index and second list for labels
print(df.iloc[[0,1],[1,2]])
print("<---- With slice objects ---->")
# first slice for index and second slice for labels
print(df.iloc[:2,1:3])
print("<---- With a boolean array whose length matches the columns ---->")
# df.iloc[index,label]
print(df.iloc[:,[False,True,False]])
print("<---- With a callable function that expects the Series or DataFrame ---->")
# df.iloc[index,label]
print(df.iloc[:,lambda df:[1,2]])