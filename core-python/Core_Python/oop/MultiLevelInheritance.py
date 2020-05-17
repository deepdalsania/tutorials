from math import  pow
class Mul1:

    def _get_a(self): # this is a protected method
        self.a = int(input("Enter the value of A : ")) # a is public

    def _show_a(self):
        print("Value of A is: ",self.a)

class Mul2(Mul1):

    def _get_b(self):
        self._b = int(input("Enter the value of B : ")) # b is protected

    def _show_b(self):
        print("Value of B is: ", self._b)

class Square(Mul2):

    def disp(self):
        print("Multiplication of "+" "+str(self.a)+" "+"and"+" "+str(self._b)+" "+"is : ",(self.a*self._b))
        print("Sqaure of A is : ",int(pow(self.a,2)))
        print("Sqaure of B is : ",int(pow(self._b,2)))

s1 = Square()
s1._get_a()
s1._show_a()
s1._get_b()
s1._show_b()
s1.disp()