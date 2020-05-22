import os

def get_env_var(name):
    print(name+" : ",os.environ.get(name,name+" is not defined as environment variable"))

count = "y"
while(count.lower() == 'y'):
    get_env_var(input("Enter environment variable name : "))
    count = input("Do you want to enter another environment variable? [y to continue] ")

print("Good bye!")
