import pandas as pd

d = {('a', 'b'): {('A', 'B'): 1, ('A', 'C'): 2},
     ('a', 'a'): {('A', 'C'): 3, ('A', 'B'): 4},
     ('a', 'c'): {('A', 'B'): 5, ('A', 'C'): 6},
     ('b', 'a'): {('A', 'C'): 7, ('A', 'B'): 8},
     ('b', 'b'): {('A', 'D'): 9, ('A', 'B'): 10}
     }
df = pd.DataFrame(data=d)
# You can automatically create a MultiIndexed frame by passing a tuples dictionary.
print("DataFrame from Dict of Tuples : ")
print(df)