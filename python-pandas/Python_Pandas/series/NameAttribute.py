import pandas as pd
import numpy as np

s = pd.Series(data=np.random.random(4),index=['a','b','c','d'],name="alphabet_index_data")
print("<---- Series with name attribute ---->")
# The Series name will be assigned automatically in many cases, in particular when taking
# 1D slices of DataFrame
print(s)
print("name of series : ",s.name)
# renaming using rename()
s_renamed = s.rename("alphabet_data")
# Note that s and s_renamed refer to different objects
print("name of series after renaming : ",s_renamed.name)
print("s_renamed : ")
print(s_renamed)