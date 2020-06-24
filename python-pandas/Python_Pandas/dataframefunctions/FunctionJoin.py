import pandas as pd

# join columns of another DataFrame.
# Join columns with other DataFrame either on index or on a key column. Efficiently
# join multiple DataFrame objects by index at once by passing a list.

# Parameters on, lsuffix, and rsuffix are not supported when passing a list of DataFrame objects.

df1 = pd.DataFrame(data={ 'key': ['K1','K2','K3','K4','K5'],
                     'A': ['A1','A2','A3','A4','A5']},index=[_ for _ in range(1,6)])
print("<---- First DataFrame ---->")
print(df1)

df2 = pd.DataFrame(data={ 'key': ['K1','K2','K3'],
                     'B': ['B1','B2','B3']},index=[_ for _ in range(1,4)])
print("<---- Second DataFrame ---->")
print(df2)

print("<---- Join DataFrames using their indexes ---->")
df3 = df1.join(other=df2,lsuffix="_caller",rsuffix="_other")
print(df3)

# If we want to join using the key columns, we need to set key to be the index in both
# df1 and df2. The joined DataFrame will have key as its index.
df4 = df1.set_index(keys='key').join(other=df2.set_index(keys='key'))
print("<---- Join using key ---->")
print(df4)

# Another option to join using the key columns is to use the on parameter.
# DataFrame.join always uses other’s index but we can use any column in df. This method
# preserves the original DataFrame’s index in the result.

print("<---- Join using 'on' option ---->")
df5 = df1.join(other=df2.set_index(keys='key'),on='key')
print(df5)