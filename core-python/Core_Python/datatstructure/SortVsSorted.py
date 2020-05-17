numbers = [4, 8, 2, 5, 1, 9]
numbers.sort()
''' sort modifies the existing list '''
print("Sort using sort() : ", numbers)
names = ["foo", "qux", "bar", "buz", "quux"]
''' sorted created a new list for sorted entries '''
print("Sort using sorted() : ", sorted(names))
print("Print names list : after sorting : ", names)
print("Sort names using specific with sorted() : ", sorted(names, key=len(names)))

