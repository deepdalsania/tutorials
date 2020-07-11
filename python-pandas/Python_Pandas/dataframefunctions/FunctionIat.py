import pandas as pd

# Access a single value for a row/column pair by integer position.
# Similar to iloc, in that both provide integer-based lookups. Use iat if you only
# need to get or set a single value in a DataFrame or Series.
# iAt based indexing can only have integer indexers

df = pd.DataFrame(data = [[10,20,30],[40,50,60],[70,80,90]], columns=list('ABC'))
print("<---- Get value at specified row/column pair ---->")
print(df.iat[2,2])
print("<---- Set value at specified row/column pair ---->")
df.iat[2,2] = 100
print(df.iat[2,2])
print("<---- Get value within a series ---->")
print(df.loc[1].iat[2])