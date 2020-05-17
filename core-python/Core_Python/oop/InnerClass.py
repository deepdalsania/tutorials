class Student:
    def __init__(self, name, sem, com, ram):
        self.name = name
        self.sem = sem
        # we can define inner class object into outer class like this
        # self.com = self.Computer()
        self.com = self.Computer(com, ram)

    def show(self):
        return self.name, self.sem, self.com.show()

    # this is an inner class and it is used in only student class we declare inside it
    class Computer:
        ''' it is for example one when we are creating object in init method of outer class
        def __init__(self):
            self.company = 'Dell'
            self.ram = '8GB' '''

        def __init__(self, com, ram):
            self.company = com
            self.ram = ram

        def show(self):
            return self.company, self.ram


s1 = Student('deep', 6, 'Dell', '8GB')
s2 = Student('dhaval', 8, 'Hp', '16GB')

print("Show Student 1 : ", s1.show())
print("Show Student 2 : ", s2.show())
''' If we are defining an object in __init__ of outer class then we can access like this
print("Computer company for student 1 : ",s1.com.company)
print("Computer ram for student 2 : ",s2.com.ram) '''

'''We can make object like this also of inner class
com1 = Student.Computer('Dell','8GB')
com2 = Student.Computer('Hp','16GB')
print("Computer Details for student 1 : ",com1.show())
print("Computer Details for student 2 : ",com2.show()) '''
