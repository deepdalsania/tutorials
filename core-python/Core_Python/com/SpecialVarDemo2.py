# when you run this you will get __main__ because when any module run it start with main
print("In Special Var Demo2 : ",__name__)

def greet():
    print("Hello\nWelcome")

# This will call if this class will run otherwise only print statement will print
if __name__ == "__main__":
    greet()

