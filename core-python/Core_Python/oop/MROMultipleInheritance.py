class A:  
    def __init__(self):  
        self.name = 'deep'
        self.age = 18
  
    def getName(self):  
        return self.name  
  
  
class B:  
    def __init__(self):  
        self.name = 'hardik'
        self.age = 20
  
    def getName(self):  
        return self.name  
  
  
class C(A, B):  
    def __init__(self):  
        A.__init__(self)  
        B.__init__(self)  
  
    def getName(self):  
        return self.name  
  
c1 = C()
print("MRO : ",C.mro())
# here name is printing hardik because you can see this in MRO
print("Name : ",c1.getName())
# here is two methods for inheritance
print("isinstance : ",isinstance(c1,C))
print("issubclass : ",issubclass(C,B))

# the problem of name conflicting will be solve by using super()
class D:
    def __init__(self):
        super().__init__()
        self.name = 'John'
        self.age = 23

    def getName(self):
        return self.name


class E:
    def __init__(self):
        super().__init__()
        self.name = 'Richard'
        self.id = '32'

    def getName(self):
        return self.name


class F(D, E):
    def __init__(self):
        super().__init__() # it will call D because as per MRO it search from right to left

    def getName(self):
        return self.name


f1 = F()
print("MRO : ",F.mro())
# here name is printing deep because you can see this in MRO
print("Name : ",f1.getName())
