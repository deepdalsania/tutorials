from oop.AccessSpecifierDemo import *

class Encap():

    def __init__(self,a,b,c):
        self.a = a # default as public (inside and out side class)
        self.__b = b # __ specify that private (inside class)
        self._c = c # _ specify that protected (within a class and in subclass)

    def get(self):
        return  self.a,self.__b,self._c

e1 = Encap(1,2,3)
# this method is defining inside the class so it can access all the variables and we get all values
print("Values of variables : ",e1.get())
# here we can't access b because it is private
# print("Value of a is {0}\nValue of b is {1}\nValue of c is {2}".format(e1.a,e1.__b,e1._c))
print("Value of a is {0}\nValue of c is {1}".format(e1.a,e1._c))
print("Value of i from AccessSpecifier class is : ",i)
''' These are protected and private so that it can not accessible
print("Value of j from AccessSpecifier class is : ",_j)
print("Value of k from AccessSpecifier class is : ",__k) '''

