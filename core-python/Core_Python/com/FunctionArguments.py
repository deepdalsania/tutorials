'''def subject(name, credit):  # this is called formal arguments
    print("Subject Name : ", name, "\nSubject Credit : ", credit)

name = input("Enter a subject name : ")
credit = int(input("Enter a subject credits : "))
print("This is positional argument")
subject(name, credit)  # this is called actual arguments and it has 4 types and  this is 1) positional
# 1) positional 2) keyword 2) Default 3) Variable Length
# you can use this reduced code
# subject(input("Enter a subject name : "), int(input("Enter a subject credits : ")))
# 2) keyword
print("This is keyword argument")
subject(credit=credit, name=name)
# 3) Default
def person(name, age=18):  # this is called formal arguments
    # gives the default value as 18
    print("Person Name : ", name, "\nPerson Age : ", age)

name = input("Enter a person name : ")
print("This is default argument")
person(name)
print("If we are passing the value of age then it wil override default argument")
person(name,20)'''

# 4) varible length
def add(a,*b): # b works as tuple
    for i in b:
        a+=i
    print("Addition is :",a)
print("Addition usin first parm as arg and second as varargs")
add(1,2,3,4)

# we can also pass mixed data type parameters as varargs
def add(*b): # b works as tuple
    a = 0
    for i in b:
        a+=i
    print("Addition is :",a)

print("Addition using only varargs")
add(1,2,3,4)

# Keyworded Variable Length Arguments

def user(name,**data):
    print("name :",name)
    for i,j in data.items():
        print(i," : ",j)

user('deep',age=21,city='Junagadh',mo_number=9876543210)


def concat(*args ,seperator="/"):
    return seperator.join(args)

print("concated output : ",concat("Coffee","Tea","Lemon Tea"))
print("concated output : ",concat("Coffee","Tea","Lemon Tea",seperator="."))