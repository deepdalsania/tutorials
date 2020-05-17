from builtins import print
''' This is specify that wrong use of list as class variables
class Student:
    marks = []  # mistaken use of a class variable

    def __init__(self, name):
        self.name = name

    def add_marks(self, mark):
        self.marks.append(mark)


s1 = Student('deep')
s2 = Student('dhaval')

s1.add_marks(98)
s1.add_marks(89)
s2.add_marks(78)
s2.add_marks(87)
# unexpectedly shared by all students
print("Marks of {} are : ".format(s1.name), s1.marks)
print("Marks of {} are : ".format(s2.name), s2.marks)
'''

class Student:

    def __init__(self, name):
        self.name = name
        self.marks = []

    def add_marks(self, mark):
        self.marks.append(mark)


s1 = Student('deep')
s2 = Student('dhaval')

s1.add_marks(98)
s1.add_marks(89)
s2.add_marks(78)
s2.add_marks(87)
# unexpectedly shared by all students
print("Marks of {} are : ".format(s1.name), s1.marks)
print("Marks of {} are : ".format(s2.name), s2.marks)

