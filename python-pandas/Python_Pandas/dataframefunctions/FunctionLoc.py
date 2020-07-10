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
df.loc[['alto 800', 'wagon r'], ['speed']] = 40
print(df)
print("<---- Set value for an entire row ---->")
df.loc['alto 800'] = 40
print(df)
print("<---- Set value for an entire column ---->")
df.loc[:, 'speed'] = 80
print(df)
print("<---- Set value for rows matching callable condition ---->")
df.loc[df['average'] > 15] = 0
print(df)

print("<---- Getting values on a DataFrame with an index that has integer labels ---->")
df = pd.DataFrame(data=[[12345, 'foo', 17], [12346, 'bar', 18], [12347, 'buz', 17], [12348, 'qux', 17]],
                  index=[1, 2, 3, 4],
                  columns=['en_no', 'name', 'age'])
#  note that both the start and stop of the slice are included.
print(df.loc[2:4])

print("<---- Getting values with a MultiIndex ---->")
tuple_index = [
    ('skoda', 'octavia'), ('skoda', 'karoq'), ('skoda', 'superb'),
    ('hyundai', 'kona'), ('hyundai', 'elantra'), ('hyundai', 'verna'),
    ('toyota', 'yaris'), ('toyota', 'carmy'), ('toyota', 'fortuner')
]

index = pd.MultiIndex.from_tuples(tuple_index)
data = [[15, '6 lacs', 60], [17, '7 lacs', 70], [19, '8 lacs', 80],
        [18, '8.5 lacs', 90], [19, '9.5 lacs', 80], [18, '7 lacs', 90],
        [17, '7.5 lacs', 80], [19, '9.5 lacs', 90], [18, '10 lacs', 80]]
df = pd.DataFrame(data=data, columns=['average', 'price', 'speed'], index=index)
print("<---- DataFrame ---->")
print(df)
print("<---- Single label. this returns a DataFrame with a single index ---->")
print(df.loc['hyundai'])
print("<---- Single index tuple. Note this returns a Series ---->")
print(df.loc[('toyota','fortuner')])
print("<---- Single label for row and column. Similar to passing in a tuple, this returns a Series ---->")
print(df.loc['skoda','octavia'])
print("<---- Single tuple. using [[]] returns a DataFrame ---->")
print(df.loc[[('hyundai','kona')]])
# Single tuple for the index with a single label for the column
print("<---- Price of toyota fortuner (get column) ---->")
print(df.loc[('toyota','fortuner'),'price'])