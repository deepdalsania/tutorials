''' Method overloading is not achive by technically in python but we can achive by using varargs
    or passing default args. Also for constructor overloading we can use this same concept but
    we can also use varargs '''
from builtins import print


class Overload:
    sum = 0

    def addition(self, a=None, b=None, c=None):
        if a != None and b != None and c != None:
            sum = a + b + c
        elif a != None and b != None:
            sum = a + b
        else:
            sum = a
        return sum

o1 = Overload()
print("1) all three parameters addition is : ", o1.addition(1, 2, 3))
print("2) two parameters addition is : ", o1.addition(4, 5))
print("3) one parameter addition is : ", o1.addition(6))
