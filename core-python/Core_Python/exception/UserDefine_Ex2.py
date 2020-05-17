print("<< Custom Exception for checking number is negligible or not. >>")
''' Here NumberIsNegligibleException is allow as name but this is not java and in python
    every exception has prefix as Error '''
class NumberIsNegligibleError(Exception):
    pass


def checkNumber():
    print("Enter the value of A and B : ")
    a = int(input())
    b = int(input())
    c = a + b
    t = float(c) / 50000000000
    if(t < 0.00001):
        try:
            raise NumberIsNegligibleError("Number is Negligible")
        except NumberIsNegligibleError as e:
            print("NumberIsNegligibleException : ",e)
    else:
        print("Number is not Negligible")

checkNumber()
