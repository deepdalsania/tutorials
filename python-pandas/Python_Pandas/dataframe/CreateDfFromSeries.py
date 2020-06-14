import pandas as pd

print("DataFrame from a Series : ")
# The result will be a DataFrame with the same index as the input Series, and with one
# column whose name is the original name of the Series (only if no other column name provided).
print(pd.DataFrame(data=pd.Series(data=[1,2,3,4],index=['a','b','c','d'])))