import pandas as pd

# Perform merge with optional filling/interpolation
# Designed for ordered data like time series data. Optionally perform group-wise merge

df1 = pd.DataFrame(data={'lkey': ['foo','bar','buz','bar'],
                         'value': [1,2,3,5],
                         'group': list('abab')})
df2 = pd.DataFrame(data={'rkey': ['foo','bar','buz','bar'],
                         'value': [5,6,7,8]})
print("<---- First DataFrame ---->")
print(df1)
print("<---- Second DataFrame ---->")
print(df2)
print("<---- Merge Ordered ---->")
print(pd.merge_ordered(left=df1,right=df2,fill_method='ffill',left_by='group'))