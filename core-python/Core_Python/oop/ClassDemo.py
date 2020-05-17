class Student:
    def profile(self):
        print('name : ', 'deep', '\nsemester : ', 8, '\nstream : ', 'IT')


stu1 = Student()
#stu2 = Student()
print('type : ', type(stu1))
print('<------Method calling using object------>')
stu1.profile()
print('<------Method calling using passing object as parameter------>')
# self is object
Student.profile(stu1)
#Student.profile(stu2)

