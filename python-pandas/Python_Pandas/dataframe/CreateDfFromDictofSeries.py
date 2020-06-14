import pandas as pd

# The resulting index will be the union of the indexes of the various Series.
# If there are any nested dicts, these will first be converted to Series.
# If no columns are passed, the columns will be the ordered list of dict keys.
d = {'one': pd.Series(data=[1, 2, 3], index=['a', 'b', 'c']),
     'two': pd.Series(data=[1, 2, 3, 4], index=['a', 'b', 'c', 'd'])
     }
df = pd.DataFrame(data=d)
print("DataFrame from Dict of Series without passing index and columns attribute : ")
# label d is not present in first column or series one so result will be NaN
print(df)
df = pd.DataFrame(data=d,index=['d','b','a'])
print("DataFrame from Dict of Series with selected index : ")
print(df)
df = pd.DataFrame(data=d,index=['d','b','a'],columns=['one','two','three'])
print(df)

# When a particular set of columns is passed along with a dict of data, the passed columns
# override the keys in the dict.
print("Index : ",df.index)
print("Columns : ",df.columns)