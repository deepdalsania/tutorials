languages = ["Python" , "Java" , "Ruby" , "Scala" , "Go"]
i = 0

''' if we are use range(len(languages)) then it will work on the basis of index
    instead of that we can use enumerate function'''
for lang in languages:
    # len for str
    print(lang)
    i+=len(lang)

# len for list
print("Total Characters in list {}, Average length : {}".format(i,i/len(languages)))