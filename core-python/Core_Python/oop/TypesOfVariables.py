class Computer:
    hd = '500GB' # this is calss variable and it also called as static variables

    def __init__(self):
        # these are instance variables
        self.company = 'Dell'
        self.ram = '8GB'


c1 = Computer()
c2 = Computer()
c1.ram = '16GB'
print('Company for c1 : ', c1.company, '\nRam for c1 : ', c1.ram, '\nHardDisk for c1 : ', c1.hd)
print('Company for c2 : ', c2.company, '\nRam for c2 : ', c2.ram, '\nHardDisk for c2 : ', c2.hd)
Computer.hd = '1TB'
print('Company for c1 : ', c1.company, '\nRam for c1 : ', c1.ram, '\nHardDisk for c1 : ', c1.hd)
print('Company for c2 : ', c2.company, '\nRam for c2 : ', c2.ram, '\nHardDisk for c2 : ', c2.hd)

