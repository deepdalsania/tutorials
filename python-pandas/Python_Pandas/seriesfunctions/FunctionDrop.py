import pandas as pd
import numpy as np

# Return Series with specified index labels removed
# Remove elements of a Series based on specifying the index labels. When using a
# multi-index, labels on different levels can be removed by specifying the level

s = pd.Series(data=np.arange(1, 4), index=list('ABC'))
print("<---- Series ---->")
print(s)
print("<---- Drop label C ---->")
# you can pass multiple labels here
print(s.drop(labels=['C']))
# after multiindex check documentation
