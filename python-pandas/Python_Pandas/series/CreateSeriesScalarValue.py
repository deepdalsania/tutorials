import pandas as pd

# If data is a scalar value, an index must be provided. The value will be repeated to
# match the length of index.
print("<---- Create Series from scalar value ---->")
print("Create Series without specifying index")
print(pd.Series(data=4.10))
print("Create Series with specifying index")
print(pd.Series(data=4.10,index=['a','b','c','d']))