import re

# search method
result = re.search(r'aza', 'plaza')
print("Search Method (1) : ", result)
result = re.search(r'aza', 'bazaar')
print("Search Method (2) : ", result)
result = re.search(r'aza', 'maze')
print("Search Method with no matching (3) : ", result)
print("Circumflex(^) Character : ", re.search(r'^x', 'xenon'))
print("Dot(Wildcard) Character (1) : ", re.search(r'p.ng', 'penguin'))
print("Dot(Wildcard) Character (2) : ", re.search(r'p.ng', 'clapping'))
print("Dot(Wildcard) Character (3) : ", re.search(r'p.ng', 'sponge'))
print("Dot(Wildcard) Character (4) : ", re.search(r'p.ng', 'Pangea', re.IGNORECASE))
