import pandas as pd

# Iteratively appending rows to a DataFrame can be more computationally intensive than
# a single concatenate. A better solution is to append those rows to a list and then
# concatenate the list with the original DataFrame all at once.


# less Efficient

df = pd.DataFrame(columns=['A'])
for i in range(6):
    df = df.append({'A': i}, ignore_index=True)
print("<---- DataFrame using append method(Less Efficient) ---->")
print(df)

# More Efficient
print("<---- DataFrame using concat method(More Efficient) ---->")
print(pd.concat(objs=[pd.DataFrame(data=[i], columns=['A']) for i in range(6)],
                ignore_index=True))
