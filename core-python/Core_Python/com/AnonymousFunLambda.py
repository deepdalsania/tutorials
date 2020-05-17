''' when we have only one line of code or one expression in function we can use anonymous
 function also we can pass one function into another function because function is an
 object in python. You can pass any number of args but must be one expression '''
a = int(input("Enter number for finding square :  "))
fun = lambda a: a * a
print("Square usign lamda function : ", fun(a))

x = int(input("Enter number for finding addtion :  "))
y = int(input("Enter number for finding addtion :  "))
f = lambda x, y: x + y
print("Addtion of two variables using lambda function : ", f(x, y))
