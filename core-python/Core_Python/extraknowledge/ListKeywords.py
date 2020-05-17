import keyword

print("List keyword : ",keyword.kwlist)
keywords = ["true", "True", "false", "False", "foo",
"elif", "assert", "async", "lambda", "bar", "buz"]
j = 1
for i in keywords:
    print(j,")",i + " is python keyword") if keyword.iskeyword(i) else print(j,")",i + " is not a python keyword")
    j+=1


