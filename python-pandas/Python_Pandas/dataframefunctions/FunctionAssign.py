import pandas as pd

# Assign new columns to a DataFrame.
# Returns a new object with all original columns in addition to new ones. Existing columns
# that are re-assigned will be overwritten.

df = pd.DataFrame(data={'temp_c': [42.8, 39.7]}, index=['Ahmedabad', 'Junagadh'])
print("DataFrame : ")
print(df)
df_lambda = df.assign(temp_f=lambda i: i.temp_c * 9 / 5 + 32)
# Alternatively, the same behavior can be achieved by directly referencing an existing
# Series or sequence
df_ref_series = df.assign(temp_f=df['temp_c'] * 9 / 5 + 32)
print("DataFrame after assign() with lambda function : ")
print(df_lambda)
print("DataFrame after assign() with referencing existing series or sequence function : ")
print(df_ref_series)

# You can create multiple columns within the same assign where one of the columns depends
# on another one defined within the same assign
df_multiple_col = df.assign(temp_f=df['temp_c'] * 9 / 5 + 32,
                            temp_k=lambda i: (i['temp_f'] + 459.67) * 5 / 9)
print("DataFrame after assign() with multiple columns : ")
print(df_multiple_col)
