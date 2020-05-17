print("<< Custom Exception for checking subtraction of number is negative or not. >>")

class NegativeAnswerError(Exception):
    pass


def checkSubtract():
    print("Enter two numbers for subtraction : ")
    a = int(input())
    b = int(input())
    if a<b:
        try:
            raise NegativeAnswerError("Negative Answer Found")
        except NegativeAnswerError as e:
            print("Subtraction is not possible : ",e)
    else:
        print("Subtraction is : ",a-b)

checkSubtract()