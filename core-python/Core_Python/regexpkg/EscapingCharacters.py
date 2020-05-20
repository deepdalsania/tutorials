import re

print("Dot Character [wrong use] (1) : ",re.search(r".com","welcome"))
# we can do by append prefix as \(back slash)
print("Dot Character [right use] (2) : ",re.search(r"\.com","welcome"))
print("Dot Character (3) : ",re.search(r"\.com","mydomain.com"))

print("\w Sequence : ",re.search(r"\w*","This is a 1st Example of sequence w"))
print("\w Sequence : ",re.search(r"\w*","This_is_a_2nd_Example_of_sequence_w"))

