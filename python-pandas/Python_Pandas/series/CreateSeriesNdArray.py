import pandas as pd
import numpy as np

data = np.array(['Python','Java','Ruby','Julia','Scala','Go'])
s = pd.Series(data=data)
print("<---- Create Series from ndarray ---->")
# We did not pass any index, so by default, it assigned the indexes ranging from 0 to
# len(data)-1 i.e 0 to 5.
print(s)