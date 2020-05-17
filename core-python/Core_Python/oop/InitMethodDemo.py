class Student:
    # basically it is used to initialize the variables like constructor and it also called as constructor
    def __init__(self,name,sem,stream):
        #print("It will call automatically")
        self.name = name
        self.sem = sem
        self.stream = stream

    def profile(self):
        print('name : ', self.name, '\nsemester : ', self.sem, '\nstream : ', self.stream)

stu1 = Student('deep',8,'IT')
stu1.profile()