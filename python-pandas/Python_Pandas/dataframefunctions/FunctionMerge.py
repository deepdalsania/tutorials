import pandas as pd

# Merge DataFrame or named Series objects with a database-style join.
# The join is done on columns or indexes. If joining columns on columns, the DataFrame
# indexes will be ignored. Otherwise if joining indexes on indexes or indexes on a
# column or columns, the index will be passed on.

df1 = pd.DataFrame(data={'lkey': ['foo','bar','buz','bar'],
                         'value': [1,2,3,5]})
df2 = pd.DataFrame(data={'rkey': ['foo','bar','buz','bar'],
                         'value': [5,6,7,8]})
print("<---- First DataFrame ---->")
print(df1)
print("<---- Second DataFrame ---->")
print(df2)
# Merge df1 and df2 on the lkey and rkey columns. The value columns have the default
# suffixes, _x and _y, appended.
print("<---- Merge DataFrame using left_on and right_on ---->")
df3 = df1.merge(right=df2,left_on='lkey',right_on='rkey')
print(df3)

# Merge DataFrames df1 and df2 with specified left and right suffixes appended to
# any overlapping columns.
print("<---- Merge DataFrame by specifying suffix ---->")
df4 = df1.merge(right=df2,left_on='lkey',right_on='rkey',suffixes=('_left','_right'))
print(df4)


