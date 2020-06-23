import pandas as pd

# Concatenate pandas objects along a particular axis with optional set logic along the
# other axes.
# Can also add a layer of hierarchical indexing on the concatenation axis, which may be
# useful if the labels are the same (or overlapping) on the passed axis number.

# Combine two series
s1 = pd.Series(data=['a', 'b'])
s2 = pd.Series(data=['c', 'd'])
print("<---- Concatenated Series ---->")
print(pd.concat(objs=[s1, s2]))
# Clear the existing index and reset it in the result by setting the ignore_index
# option to True.
print("<---- Concatenated Series with ignore_index = True ---->")
print(pd.concat(objs=[s1, s2], ignore_index=True))
# Add a hierarchical index at the outermost level of the data with the keys option.
print("<---- Concatenated Series with keys option ---->")
print(pd.concat(objs=[s1, s2], keys=['series1', 'series2']))
# Label the index keys you create with the names option.
print("<---- Concatenated Series with keys and name option ---->")
print(pd.concat(objs=[s1, s2], keys=['series1', 'series2'],
                names=['Series Name', 'Row ID']))

# Combine two DataFrame objects with identical columns
df1 = pd.DataFrame(data=[['foo', 'foo@123'], ['bar', 'bar@123']],
                   columns=['username', 'password'])
print("<---- First DataFrame ---->")
print(df1)
df2 = pd.DataFrame(data=[['buz', 'buz@123'], ['qux', 'qux@123']],
                   columns=['username', 'password'])
print("<---- Second DataFrame ---->")
print(df2)
print("<---- Concatenated DataFrame ---->")
print(pd.concat(objs=[df1, df2]))

# Combine DataFrame objects with overlapping columns and return everything. Columns
# outside the intersection will be filled with NaN values.
df3 = pd.DataFrame(data=[['buz', 'buz@123', 'developer'], ['qux', 'qux@123', 'tester']],
                   columns=['username', 'password', 'designation'])
print("<---- Concatenated DataFrame with NaN Value ---->")
# value of sort is default False
print(pd.concat(objs=[df1, df3], sort=True, ignore_index=True))

# Combine DataFrame objects with overlapping columns and return only those that are
# shared by passing inner to the join keyword argument.
print("<---- Concatenated DataFrame join option ---->")
# value of join is default "outer"
print(pd.concat(objs=[df1, df3], join="inner", ignore_index=True))

# Combine DataFrame objects horizontally along the x axis by passing in axis=1
# value of axis is default 0
print("<---- Concatenated DataFrame axis option ---->")
df4 = pd.DataFrame(data= [['foo@mail.com',True],['bar@mail.com',False]],
                   columns=['email','login'])
print(pd.concat(objs=[df1,df4],axis=1))

# Prevent the result from including duplicate index values with the
# verify_integrity option.
'''print("<---- Concatenated DataFrame verify_integrity option ---->")
df5 = pd.DataFrame(data=[1],columns=['A'])
print("<---- First DataFrame ----->")
print(df5)
df6 = pd.DataFrame(data=[1],columns=['A'])
print("<---- Second DataFrame ----->")
print(df6)
print(pd.concat(objs=[df5,df6],verify_integrity=True))'''
