from builtins import print


class Student:
    def __init__(self):
        self.name = 'deep'
        self.sem = 8
        self.stream = 'IT'

    def update(self):
        self.stream = 'CE'

    def compare(self, s2):
        print("Compare stream : ","Same Stream" if self.stream == s2.stream else "Different Stream")


s1 = Student()  # <- this is a constructor and it will assign a meomry to object
s2 = Student()
# whenever we are creating a new object it will take different memory
'''print("Id of s1 : ",id(s1))
print("Id of s2 : ",id(s2))'''
s1.name = 'dhaval'
s1.compare(s2) # self = s1
s1.update()  # it is passing s1 as params as self
print("name for s1 : ", s1.name, "\nsem for s1 : ", s1.sem, "\nstream for s1 : ", s1.stream)
print("name for s2 : ", s2.name, "\nsem for s2 : ", s2.sem, "\nstream for s2 : ", s2.stream)
s2.compare(s1) # self = s2

