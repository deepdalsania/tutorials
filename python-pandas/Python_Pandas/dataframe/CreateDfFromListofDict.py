import pandas as pd

# The dictionary keys are by default taken as column names.
d = [{'a': 1, 'b': 2}, {'a': 4.10, 'b': 2.25, 'c':6}]
df = pd.DataFrame(data=d)
print("DataFrame from LList of Dict : ")
print(df)
df = pd.DataFrame(data=d,index=['first','second'])
print("DataFrame from LList of Dict with index : ")
print(df)
df = pd.DataFrame(data=d,index=['first','second'],columns=['a','c'])
print("DataFrame from LList of Dict with index and columns : ")
print(df)