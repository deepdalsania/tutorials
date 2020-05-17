
try:
    # trying to open a file in read mode
    fo = open("foobar.txt","rt")
except FileNotFoundError as e:
    print("File not found : ",e)