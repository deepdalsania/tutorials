import pandas as pd

# The ndarrays must all be the same length. If an index is passed, it must clearly also be
# the same length as the arrays. If no index is passed, the result will be range(n), where
# n is the array length.

data = {'Username': ['foo', 'bar', 'buz'],
        'Email': ['foo@mail.com', 'bar@mail.com', 'buz@mail.com']
        }
df = pd.DataFrame(data=data)
print("DataFrame from Dict of ndarrays / list without passing index : ")
print(df)
df = pd.DataFrame(data=data,index=['priority1','priority2','priority3'])
print("DataFrame from Dict of ndarrays / list with passing index : ")
print(df)