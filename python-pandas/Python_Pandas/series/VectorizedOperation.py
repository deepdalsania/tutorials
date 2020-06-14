import pandas as pd
import numpy as np

s = pd.Series(data=[_ for _ in range(1, 6)], index=['a', 'b', 'c', 'd', 'e'])
print("<---- Vectorized Operation ---->")
print("Addition(add 5) is : ")
print(s+s)
print("Multiplication(multiply with 4) is : ")
print(s*4)
print("Square is : ")
print(s*s)
print("Exponential is : ")
print(np.exp(s))
print("<---- Label Alignment ---->")
# A key difference between Series and ndarray is that operations between Series
# automatically align the data based on label.

# index starts from 0 so s[1:] is missing a label and s[:-1] is missing e label so the result
# will be marked as missing NaN.
print(s[1:]+s[:-1])
