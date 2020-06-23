import pandas as pd

# Append rows of other to the end of caller, returning a new object.
# Columns in other that are not in the caller are added as new columns.

df1 = pd.DataFrame(data=[[1, 2], [3, 4]], columns=list('AB'))
print("<---- First DataFrame ---->")
print(df1)
df2 = pd.DataFrame(data=[[5, 6], [7, 8]], columns=list('AB'))
# append df2 to df1 and it gives new dataframe so we have to store in another variable
df3 = df1.append(df2)
print("<---- After appending second DataFrame to first DataFrame ---->")
print(df3)
# with ignore_index = True
df3 = df1.append(df2, ignore_index=True)
print("<---- After appending with ignore_index = True ---->")
print(df3)

