from abc import ABC, abstractmethod


# ABC stands for abstract base classes
''' An Abstract class have abstract and non abstract method both but abstract method must be 
    declare with @abstractmethod decorator and without body.'''

class Abstract(ABC):

    @abstractmethod
    def get_ab(self):
        pass

    @abstractmethod
    def mul_ab(self):
        pass

    def display(self):
        print("This is a non-abstract method of abstract class ")


class NonAbstract(Abstract):

    def get_ab(self):
        self.a = int(input("Enter value of a : "))
        self.b = int(input("Enter value of b : "))

    def mul_ab(self):
        print("Multiplication is : ", self.a * self.b)

    def show(self):
        print("This is a non-abstract method of non-abstract class")


n1 = NonAbstract()
n1.display()
n1.get_ab()
n1.mul_ab()
n1.show()
