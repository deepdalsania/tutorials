import pandas as pd
import numpy as np

s = pd.Series(data=np.floor(10*np.random.random(10)),index=['a','b','c','d','e','f','g','h','i','j'])
print("<---- Series Indexing ---->")
print("First Element : ",s[0])
print("Last Element : ",s[-1])
print("<---- Series Slicing ---->")
print("First 3 elements : ")
print(s[0:3])
print("Last 3 elements : ")
print(s[-3:])
print("Conditional slicing : ")
print(s[s > s.median()])
print("Index wise slicing : ")
print(s[[4,8,1]])
# if label not contained exception will raise
print("<---- Series is dict-like ---->")
print("Retrieve with label(index) : ",s['d'])
print("in operator : ",'f' in s )
# Using the get method, a missing label will return None or specified default
print("get method without default : ",s.get('k'))
print("get method with default : ",s.get('k',np.nan))


