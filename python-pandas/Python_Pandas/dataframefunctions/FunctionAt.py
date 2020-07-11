import pandas as pd

# Access a single value for a row/column label pair
# Similar to loc, in that both provide label-based lookups. Use at if you only need
# to get or set a single value in a DataFrame or Series

df = pd.DataFrame(data = [[10,20,30],[40,50,60],[70,80,90]], columns=list('ABC'))
print("<---- Get value at specified row/column pair ---->")
print(df.at[2,'C'])
print("<---- Set value at specified row/column pair ---->")
df.at[2,'A'] = 100
print(df.at[2,'A'])
print("<---- Get value within a series ---->")
print(df.loc[1].at['C'])