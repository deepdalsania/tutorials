class Computer:
    def __init__(self,hd,ram):
        self.hd = hd
        self.ram = ram

    def __str__(self):
        return "My Computer have {} GB ram and {} GB harddisk".format(str(self.ram),str(self.hd))

c1 = Computer(500,3)
''' printing an instance of class if you're printing without overloading 
    str method it wil print a memory address of instance '''
print(c1)