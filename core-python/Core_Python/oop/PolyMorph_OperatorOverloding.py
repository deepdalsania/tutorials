'''a = 10
b = 4
print("Value of a : ",a)
print("Background str method will invoke so that we are getting a value not address  : ",a.__str__())
print("Addition : ", a + b)
print("Background Method addition using int class : ", int.__add__(a, b)) '''


class Student:

    def __init__(self,m1,m2):
        self.m1 = m1
        self.m2 = m2

    def __add__(self, other):
        ''' self = first operand and other is second operand '''
        m1 = self.m1 + self.m2 # you can also add self.m1 + other.m1 or anything
        m2 = other.m1 + other.m2
        s3 = Student(m1,m2)
        return  s3

    def __str__(self):
        return '{} {}'.format(self.m1,self.m2)


m1 = int(input("Enter marks of subject 1 for student 1 : "))
m2 = int(input("Enter marks of subject 2 for student 1 : "))
s1 = Student(m1,m2)
m3 = int(input("Enter marks of subject 1 for student 2 : "))
m4 = int(input("Enter marks of subject 2 for student 2 : "))
s2 = Student(m3,m4)
s3 = s1 + s2  # you will get an error if you will not override + operator with __add__ method because our Student class dosen't have this method inbuilt
#print("Address of s1 is : ",s1) # it is printing address of s3 not addition
#print("Address of s1 is : ",s1.__str__()) # we are calling __str__() but then also it is printing address because till we are not overloading it in int it is builtin in student it isn't.
print("Student 1 -> Mark of first subject is {} and Mark of second subject is {}".format(s1.m1,s1.m2))
print("Student 2 -> Mark of first subject is {} and Mark of second subject is {}".format(s2.m1,s2.m2))
print("Addition of marks for student 1 is : ",s3.m1)
print("Addition of marks for student 2 is : ",s3.m2)
print("Average of student 1 is : ",'{:.2f}'.format(s3.m1/2))
print("Average of student 2 is : ",'{:.2f}'.format(s3.m2/2))
