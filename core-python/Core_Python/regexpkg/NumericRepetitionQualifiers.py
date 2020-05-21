import re

print("5 Letters : ",re.search(r"[a-zA-Z]{5}","a ghost"))
print("5 Letters from all words : ",re.findall(r"[a-zA-Z]{5}","a scary ghost appeared"))
print("Exact 5 Letters words : ",re.findall(r"\b[a-zA-Z]{5}\b","a scary ghost appeared"))
print("5-10 Letters or numbers : ",re.findall(r"\w{5,10}","I really like strawberries"))
print("5-any Letters or numbers : ",re.findall(r"\w{5,}","I really like strawberries"))
print("Start with s and 0-20 Letters or numbers : ",re.findall(r"s\w{,20}","I really like strawberries"))
