import pandas as pd

print("<---- Row selection ---->")
d = {'one': pd.Series([1, 2, 3, 4], index=['a', 'b', 'c', 'd']),
     'two': pd.Series([1, 2, 3, 4, 5], index=['a', 'b', 'c', 'd', 'e'])}
df = pd.DataFrame(data=d)
print("Row selection by row : ")
# The result is a series with labels as column names of the DataFrame. And, the Name of
# the series is the label with which it is retrieved
print(df.loc['e'])

print("Row selection by integer location : ")
print(df.iloc[1])

# pela append, concat, join, merge function for data frame and jetala function data frame
# ma joya aetala same badha series mate and pachhi tutorials point ma row addition start and
# pachhi pandas data structure vala document mathi indexing and slicing start
print("Row Addition")
