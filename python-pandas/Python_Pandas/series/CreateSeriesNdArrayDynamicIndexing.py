import pandas as pd
import numpy as np

data = np.array(['Python','Java','Ruby','Julia','Scala','Go'])
s = pd.Series(data=data,index=[1,2,3,4,5,6])
print("<---- Create Series from ndarray by using dynamic indexing with static list data ---->")
print(s)
# index must be same as length of data
s = pd.Series(data=np.random.random(4),index=['a','b','c','d'])
print("<---- Create Series from numpy array and dynamic indexing with static list data ---->")
print(s)
#  If no index is passed, one will be created having values [0, ..., len(data) - 1].
s = pd.Series(data=np.random.random(4))
print("<---- Create Series from numpy array without specifyinh index ---->")
print(s)
s = pd.Series(data=data,index=[i for i in range(1,data.size+1)])
print("<---- Create Series from ndarray by using dynamic indexing with list comprehension ---->")
print(s)