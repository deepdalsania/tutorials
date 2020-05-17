''' If finally is present, it specifies a ‘cleanup’ handler. The try clause is executed,
    including any except and else clauses. If an exception occurs in any of the clauses
    and is not handled, the exception is temporarily saved. The finally clause is executed.
    If there is a saved exception it is re-raised at the end of the finally clause.
    If the finally clause raises another exception, the saved exception is set as the
    context of the new exception. If the finally clause executes a return or break
    statement, the saved exception is discarded:'''

a = int(input("Enter a first number : "))
b = int(input("Enter a first number : "))

try:
    print("Division is : ",a/b)
finally:
    print("A is Greater than B" if a>b else "B is Greater than A")