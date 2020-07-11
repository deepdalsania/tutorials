import pandas as pd
import numpy as np

df = pd.DataFrame(data=np.arange(1, 17).reshape(4, 4),
                  index=list('1234'), columns=list('ABCD'))
print("<---- DataFrame ---->")
print(df)
print("<---- Drop columns by specifying axis ---->")
print(df.drop(columns=['A','D'],axis=1))
print("<---- Drop columns without specifying axis ---->")
print(df.drop(columns=['A','D']))
print("<---- Drop a row by index ---->")
print(df.drop(['1','4']))
# after multiindex check documentation