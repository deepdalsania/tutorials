import re

# search method
print("Character class([]) (1) : ",re.search(r'[Pp]ython','Python'))
print("Character class([]) (2) : ",re.search(r'[a-z]way','The end of the highway'))
print("Character class([]) (3) : ",re.search(r'[a-z]way','What a way to go'))
print("Character class([]) (4) : ",re.search(r'cloud[a-zA-z0-9]','cloud9'))
print("Character class([]) (5) : ",re.search(r'[^a-zA-z]','This is a sentence with spaces.'))
print("Character class([]) (6) : ",re.search(r'[^a-zA-z ]','This is a sentence with spaces.'))
print("Pipe (OR) (1) : ",re.search(r'cat|dog','I like cats.'))
print("Pipe (OR) (2) : ",re.search(r'cat|dog','I like dogs.'))
print("Pipe (OR) (3) : ",re.search(r'cat|dog','I like dogs and cats.'))

# findall method
print("Pipe (OR) (4) : ",re.findall(r'cat|dog','I like dogs and cats.'))