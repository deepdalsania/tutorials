a = input()
lis = a.split()
print(lis)
# If the list values are all integer types, use the map() method to convert all the strings to integers.
newlis = list(map(int, lis))
print("New List : ",newlis)

# Sets are an unordered bag of unique values. A single set contains values of any immutable data type.
# CREATING SET
myset = {1, 2} # Directly assigning values to a set
myset = set()  # Initializing a set
myset = set(['a', 'b']) # Creating a set from a list
print("My set : ",myset)

# MODIFYING SET
myset.add('c')
print("Modifying set after add 'c' : ",myset)
myset.add('a') # As 'a' already exists in the set, nothing happens
myset.add((5, 4))
print("Modifying set after add '(5,4)' as tuple : ",myset)

# Using the update() function:
myset.update([1, 2, 3, 4]) # update() only works for iterable objects
print("Modifying set after update() with list : ",myset)
myset.update({1, 7, 8})
print("Modifying set after update() with dict : ",myset)
myset.update({1, 6}, [5, 13])
print("Modifying set after update() with list and dict : ",myset)

# removing item
# Both the discard() and remove() functions take a single value as an argument and removes that
# value from the set. If that value is not present, discard() does nothing, but remove() will
# raise a KeyError exception.
myset.discard(10)
print("Delete element using discard() but not present in set : ",myset)
if 13 in myset:
    myset.remove(13)
    print("Delete element using remove() : ",myset)

# COMMON SET OPERATIONS Using union(), intersection() and difference() functions.
a = {2, 4, 5, 9}
b = {2, 4, 11, 12}
# Values which exist in a or b
print("Union : ",a.union(b))
# Values which exist in a and b
print("InterSection : ",a.intersection(b))
# Values which exist in a but not in b
print("Difference : ",a.difference(b))

# The union() and intersection() functions are symmetric methods:
print("Condition 1 : ",a.union(b) == b.union(a))
print("Condition 2 : ",a.intersection(b) == b.intersection(a))
print("Condition 3 : ",a.difference(b) == b.difference(a))










