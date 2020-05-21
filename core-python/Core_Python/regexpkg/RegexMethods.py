import re

print("Split (1) : ",re.split(r"[.?!]","One sentence. Another one? and the last one!"))
print("Split with notation mark (2) : ",re.split(r"([.?!])","One sentence. Another one? and the last one!"))

print("Sub (1) : ",re.sub(r"[\w.%+-]+@[\w.-]+", "[READACTED]", "Received an email for go_nuts95@my.example.com"))
print("Sub (2) : ",re.sub(r"^([\w .-]*), ([\w .-]*)$",r"\2 \1", "Lovelace Ada"))
