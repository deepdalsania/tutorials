import pandas as pd, numpy as np

df1 = pd.DataFrame(data=np.random.randn(10,5),columns=list('ABCDE'))
df2 = pd.DataFrame(data=np.random.randn(6,3),columns=list('ABC'))
print("<---- DataFrame-1 ---->")
print(df1)
print("<---- DataFrame-2 ---->")
print(df2)
print("<---- Addition ---->")
print(df1+df2)
# subtraction between datafram-1 and first row of dataframe-1
print(df1-df1.iloc[0])

