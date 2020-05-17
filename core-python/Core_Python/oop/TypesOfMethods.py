class Student:
    college = 'NGI'

    def __init__(self, m1, m2, m3):
        self.m1 = m1
        self.m2 = m2
        self.m3 = m3

    # this is an instance method it has 2 types accessor and mutator
    def findAvg(self):
        return (self.m1 + self.m2 + self.m3) / 3

    '''# this is an accessor : it dosen't change value just fetch the values
    def get_m1(self):
        return self.m1
    
    # this is a mutator : it used for changing the value
    def set_m1(self ,m1):
        self.m1 = m1 '''

    '''this is a class method if we are not annotating then it will give an error so we have to use decorators
    for the class method we can't use self because it is for instance method so we have to pass cls for class methods'''

    @classmethod
    def getCollege(cls):
        return cls.college

    ''' this is a static method which is not concerning with class or instance variables and we have to use @staticmethod decorators
    for this and we can use this for finding a factorial because it isn't concern with any variables'''

    @staticmethod
    def info():
        return "This is Static Method"


s1 = Student(89, 85, 87)
s2 = Student(74, 75, 79)

print("Average for first student using instance method : ", s1.findAvg())
print("Average for second student using instance method : ", s2.findAvg())
print("Student Information using class method : ", Student.getCollege())
print("Static Method calling : ", Student.info())
