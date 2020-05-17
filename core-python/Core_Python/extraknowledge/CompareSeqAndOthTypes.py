# compare tuples
print("Tuple 1 : ", (1, 2, 2) < (1, 2, 1))
print("Tuple 2 : ", (1, 2, 2) < (1, 2, 3))
print("Tuple 3 : ", (1, 2, 2) < (2, 1, 1))
print("Tuple 4 : ", (1, 2, 3, 4) < (1, 2, 3))
print("Tuple 5 : ", (1, 2, 2) < (1, 2, -1))
print("Tuple 6 : ", (1, 2) < (1, 2, -1))
print("Tuple 7 : ", (1, 2, -2) < (1, 2, -1))
print("Tuple 8 : ", (1, 2, 3) == (1.0, 2.0, 3.0))
print("Tuple 9 : ", (1, 2, ("aa", "ab"))< (1, 2, ("abc","a"),4))
print("Tuple 10: ", (1, 2, ("aa", "ab"),5) < (1, 2, ("abc","a"),4))
print("Tuple 11: ", (1, 2, ("abc", "ab")) < (1, 2, ("abc","a"),4))
print("\n")
# compare list
print("List 1 : ",[1,2,3] < [1,2,4])
print("\n")

# compare str
print("str 1 : ","abc" < "c" < "pascal" < "python")
print("str 1 : ","q" < "c" < "pascal" < "rython")