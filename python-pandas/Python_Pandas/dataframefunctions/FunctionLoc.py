import pandas as pd

df = pd.DataFrame(data=[[15, '2 lacs', 60], [17, '3 lacs', 70], [19, '4 lacs', 80], [18, '7 lacs', 90]],
                  index=['alto 800', 'wagon r', 'swift dzire', 'skoda rapid'],
                  columns=['average', 'price', 'speed'])
print("<---- DataFrame ---->")
print(df)

# Single label. Note this returns the row as a Series.
print("<---- Single label ---->")
print(df.loc['alto 800'])

# List of labels. Note using [[]] returns a DataFrame.
print("<---- List of labels ---->")
print(df.loc[['alto 800', 'wagon r']])

print("<---- Single label for row and column ---->")
print("Price of alto 800 : ", df.loc['alto 800', 'price'])

# Slice with labels for row and single label for column.
# note that both the start and stop of the slice are included.
print("<---- Slicing ---->")
print(df.loc['alto 800':'swift dzire', 'average'])

print("<---- Boolean list with the same length as the row axis ---->")
print(df.loc[[False, False, True, True]])

print("<---- Conditional that returns a boolean Series ---->")
print(df.loc[df['average'] > 15])

print("<---- Conditional that returns a boolean Series with column labels specified ---->")
print(df.loc[df['average'] > 15, 'price'])

print("<---- Callable that returns a boolean Series ---->")
print(df.loc[lambda df: df['average'] == 15])

print("<---- Setting values ---->")
print("<---- Set value for all items matching the list of labels ---->")
df.loc[['alto 800','wagon r'], ['speed']] = 40
print(df)
print("<---- Set value for an entire row ---->")
df.loc['alto 800'] = 40
print(df)
print("<---- Set value for an entire column ---->")
df.loc[:,'speed'] = 80
print(df)
print("<---- Set value for rows matching callable condition ---->")
df.loc[df['average'] > 15] = 0
print(df)

print("<---- Getting values on a DataFrame with an index that has integer labels ---->")
df = pd.DataFrame(data=[])
