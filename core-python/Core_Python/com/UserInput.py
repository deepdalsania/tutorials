# give output as string because input function default takes string value
'''a = input("Enter 1st number : ")
b = input("Enter 2nd number : ")
print(a+b)'''

# type casting but its takes memory space for other   variable
'''a = input("Enter 1st number : ")
x = int(a)
b = input("Enter 2nd number : ")
y = int(b)
print(a+b)'''

# this is first way of type casting
'''a = input("Enter 1st number : ")
b = input("Enter 2nd number : ")
print(int(a)+int(b))'''

# its take int value conversion at inputting time
a = int(input("Enter 1st number : "))
b = int(input("Enter 2nd number : "))
print(a+b)

# take char
'''ch = input('Enter a character : ')
print(ch)
c = input('Enter a character : ')
print(c[0])
a = input('Enter a character : ')[0]
print(a)'''

# evaluate expression using eval function
'''res = eval(input('Enter an expression : '))
print(res)'''

''' The raw_input([prompt]) function reads one line from standard input and returns 
    it as a string (removing the trailing newline). but this function availabe in
    Python 2.x now it's renamed as input in python 3.x'''
