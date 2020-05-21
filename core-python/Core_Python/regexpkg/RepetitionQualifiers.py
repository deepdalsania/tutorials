import re

# search method

# zero or more occurrences
print("Star Qualifier (1) : ",re.search(r"Py.*n","Pygmalion"))
# Start takes as many chars as possible. In programming terms, It called greedy behavior
print("Star Qualifier (2) : ",re.search(r"Py.*n","Python Programming"))
print("Star Qualifier (3) : ",re.search(r"Py[a-z]*n","Python Programming"))
print("Star Qualifier (4) : ",re.search(r"Py[a-z]*n","Pyn"))
# one or more occurrences
print("Plus Qualifier (1) : ",re.search(r"o+l+","goldfish"))
print("Plus Qualifier (2) : ",re.search(r"o+l+","woolly"))
print("Plus Qualifier (2) : ",re.search(r"o+l+","boil"))
# zero or one occurrence
print("Question mark Qualifier (1) : ",re.search(r"p?each","To each their own"))
print("Question mark Qualifier (2) : ",re.search(r"p?each","I like peaches"))

