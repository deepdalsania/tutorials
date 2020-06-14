import pandas as pd

df = pd.DataFrame(data=[_ for _ in range(1,6)])
print("DataFrame using list : ")
print(df)
df = pd.DataFrame(data=[['foo','foo@mail.com',],['bar','bar@mail.com'],['buz','buz@mail.com']],columns=['Username','Email'])
print("DataFrame using list with columns attribute : ")
print(df)