import pandas as pd

# You can treat a DataFrame semantically like a dict of like-indexed Series objects.
# Getting, setting, and deleting columns works with the same syntax as the analogous dict
# operations

d = {'one': pd.Series(data=[1, 2, 3], index=['a', 'b', 'c']),
     'two': pd.Series(data=[1, 2, 3, 4], index=['a', 'b', 'c', 'd'])
     }
df = pd.DataFrame(data=d)
print("<---- Column Selection ---->")
print("First Column : ")
print(df['one'])
print("<---- Column Addition ---->")
df['three'] = df['one'] * df['two']
print("Multiply first and second column and add third column as a result : ")
print(df)
df['flag'] = df['one']+df['two']+df['three'] > 4
print("Conditional column addition : ")
print(df)

print("<---- Column Deletion ---->")
# Columns can be deleted or popped like with a dict.
# So we can't pass index value because it is not a key of dictionary and deletion is
# performed w.r.t keys
if 'two' in df:
    del df['two']
print("After deleting column(two) using del : ")
print(df)
if 'three' in df:
    df.pop('three')
print("After deleting column(three) using pop : ")
print(df)

print("<---- Column Insertion ---->")
# When inserting a scalar value, it will naturally be propagated to fill the column
df['name'] = 'foo'
print("After inserting a scalar value : ")
print(df)

# When inserting a Series that does not have the same index as the DataFrame,
# it will be conformed to the DataFrame’s index
df['one_truncate'] = df['one'][1:3]
print("After inserting a series : ")
print(df)

# You can insert raw ndarrays but their length must match the length of the DataFrame’s
# index. Otherwise it will raise ValueError: Length of values does not match length of index
df['raw_ndarray'] = [5,6,7,8]
print("After inserting raw ndarrays : ")

# By default, columns get inserted at the end. The insert function is available to insert
# at a particular location in the columns
df.insert(loc=1,column='priority',value=['priority-'+str(i+1) for i in range(len(df.index))],allow_duplicates=False)
print("After inserting using insert() : ")
print(df)