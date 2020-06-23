import pandas as pd

# Concatenate two or more Series.

s1 = pd.Series(data=['a', 'b', 'c'])
s2 = pd.Series(data=['d', 'e', 'f'])
s3 = pd.Series(data=['g', 'h', 'i'], index=[_ for _ in range(3, 6)])
print("<---- Append second series to first series ---->")
print(s1.append(to_append=s2))
print("<---- Append third series to first series ---->")
print(s1.append(to_append=s3))
# With ignore_index set to True:
print("<---- Appended series with ignore_index = True ---->")
print(s1.append(to_append=s2, ignore_index=True))
# With verify_integrity set to True
# print("<---- Appended series with verify_integrity = True ---->")
# print(s1.append(to_append=s2, verify_integrity=True))
