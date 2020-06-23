import pandas as pd

df = pd.DataFrame(data=[['foo','foo@mail.com',],['bar','bar@mail.com'],['buz','buz@mail.com']],columns=['Username','Email'])
print("DataFrame : ")
print(df)

# loc: integer
# Insertion index. Must verify 0 <= loc <= len(columns).
# This will shift the existing column at that position to the right.
# column: str, number, hashtab object
# Label of the inserted column.
# value: value is simply the value to be inserted. It can be int, string, float or anything
# or even series / List of values. Providing only one value will set the same value for
# all rows.
# allow_duplicates : allow_duplicates is a boolean value which checks if column with same name already exists or not.
df.insert(loc=0,column='priority',value=['priority-'+str(i+1) for i in range(len(df.index))],allow_duplicates=False)
print("After inserting using insert() : ")
print(df)