from datetime import date

import pandas as pd
import numpy as np

data = {'System Logs': 210, 'User Logs': 416, 'Debug Logs': 520}
print("<---- Create Series from dictionary ---->")
# When the data is a dict, and an index is not passed, the Series index will be ordered by
# the dict’s insertion order, if you’re using Python version >= 3.6 and Pandas version >= 0.23.
# If you’re using Python < 3.6 or Pandas < 0.23, and an index is not passed, the Series index
# will be the lexically ordered list of dict keys.
print(pd.Series(data=data))
# If an index is passed, the values in data corresponding to the labels in the index will
# be pulled out.
dict_data = {'a': 1.1, 'b': 2.2, 'c': 3.3, 'd': 4.4}
print("<---- Create Series using dictionary with specifying index ---->")
print("Series without specifying index")
print(pd.Series(data=dict_data))
print("Series with specifying index")
# NaN (not a number) is the standard missing data marker used in pandas.
print(pd.Series(data=dict_data,index=['c','b','e','a','d']))