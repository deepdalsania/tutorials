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

print("Row Addition : ")
df1 = pd.DataFrame(data=[[1, 2], [3, 4]], columns=list('AB'))
df2 = pd.DataFrame(data=[[5, 6], [7, 8]], columns=list('AB'))
df1 = df1.append(df2)
print(df1)

print("Row deletion : ")
df1 = df1.drop(index=0)
print(df1)
