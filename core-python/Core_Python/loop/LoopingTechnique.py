from math import isnan

# looping through dictionaries
'''tel = {"abc":9877,"def":9563}
for k,v in tel.items():
    print(k,v)'''

# looping with two or more sequences
from builtins import print

'''que = ["name","nick name","favourite person"]
ans = ["deep","DD","My MoM"]
sign = [".","!","!"]
for q,a,s in zip(que,ans,sign):
    print("what is your {0}? It is {1}{2}".format(q,a,s))'''

# loop over a sequence in reverse
'''for i in reversed(range(1,11)):
    print(i)'''

# loop over a sequence in sorted order
'''fruits = ['apple', 'orange', 'apple', 'pear', 'orange', 'banana']
# if we are sorting list we will have a duplicate value
for i in sorted(set(fruits)) :
    print(i)'''

# manipulating a list while iterating
raw_data = [56.2, float('NaN'), 51.7, 55.3, 52.5, float('NaN'), 47.8]
data = []
for i in raw_data:
    if not isnan(i):
        data.append(i)
print("filtered data : ",data)