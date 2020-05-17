class Laptop:
    def company(self, com):
        com.specification()


class Dell:
    def specification(self):
        print("This is the specifications of dell laptop")
        print("Processor : ", "intel core i3")
        print("System OS : ", "Windows 7")
        print("Ram : ", "8GB")


class Lenovo:
    def specification(self):
        print("This is the specifications of lenovo laptop")
        print("Processor : ", "intel core i3")
        print("System OS : ", "Windows 8")
        print("Ram : ", "16GB")
        print("Graphics Card : ", "NVIDIA")


com1 = Dell()
com2 = Lenovo()
lap = Laptop()
''' Either object is of Dell or Lenovo dosen't matter only matter is The class must have specification
method'''
lap.company(com1)
lap.company(com2)
