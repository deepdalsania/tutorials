class Student:

    def __init__(self):
        self.name = input("Enter Student name : ")
        self.en_no = int(input("Enter enrollment number : "))

    ''' We can also use method instead of constructor
    def student_details(self):
        self.name = input("Enter Student name : ")
        self.en_no = int(input("Enter enrollment number : ")) '''

    def show_stu_detail(self):
        print("Student name is : ",self.name)
        print("Student enrollment number is : ",self.en_no)

class Marks:

    def __init__(self):
        self.m1 = int(input("Enter marks of subject 1 : "))
        self.m2 = int(input("Enter marks of subject 2 : "))
        self.m3 = int(input("Enter marks of subject 3 : "))

    ''' We can also use method instead of constructor
    def student_marks(self):
        self.m1 = int(input("Enter marks of subject 1 : "))
        self.m2 = int(input("Enter marks of subject 2 : "))
        self.m3 = int(input("Enter marks of subject 3 : ")) '''

    def show_marks(self):
        print("Marks of subject 1 : ",self.m1)
        print("Marks of subject 2 : ",self.m2)
        print("Marks of subject 3 : ",self.m3)

class Result(Student,Marks):

    def __init__(self):
        Student.__init__(self)
        Marks.__init__(self)

    def findAvg(self):
        print("Average is : ",'{:.2f}'.format((self.m1+self.m2+self.m3)/3))

r1 = Result()
r1.show_stu_detail()
r1.show_marks()
r1.findAvg()


