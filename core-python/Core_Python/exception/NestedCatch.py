print("Enter your HOME ADDRESS: ")
s1 = None
s2 = input()
s3 = input()
s4 = input()

try:
    print(s2[50])
except IndexError as e:
    print("Inside Catch Block")
    print("Index out of range : ",e)
    try:
        print("Inside try block of except block")
        print(s1[10])
    except TypeError as e:
        print("Inside except block of except block")
        print("TypeError : ",e)