''' this will raise a type erro we can't iterate int object'''
'''for i in 25:
    print(i)'''

''' first way it will give 1 to 25'''
print("First way")
for i in range(1,26):
    print(i)

''' second way ForLoop Iterate Over List of One Element and it will print only 25'''
print("Second way")
for i in [25]:
    print(i)