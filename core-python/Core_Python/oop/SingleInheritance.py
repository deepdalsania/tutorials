class SuperClass:
    def _get_ab(self): # this is protected method
        self.a = int(input("Enter the value of A : "))
        self._b = int(input("Enter the value of B : "))

    def _get_a(self):
        return self.a

    def _show_a(self):
        print("Value of A is : ", self.a)


class SubClass(SuperClass):

    def _mul(self):
        self._get_ab()
        self._c = self._get_a() * self._b

    def _disp_mul(self):
        self._show_a()
        print("Value of B is : ", self._b)
        print("Multiplication is : ", self._c)


sub1 = SubClass()
sub1._mul()
sub1._disp_mul()
