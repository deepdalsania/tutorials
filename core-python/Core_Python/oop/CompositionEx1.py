class Repository:
    ''' Always initialize mutable attributes in the constructor '''
    def __init__(self):
        self.packages = {}

    def add_package(self,package):
        self.packages[package.name] = package

    def remove_package(self,package):
        if package.name in self.packages:
            del self.packages[package.name]

    def total_size(self):
        res = 0
        for package in self.packages.values():
            res+=package.size
        return res

class Package:
    def __init__(self,name,size):
        self.name = name
        self.size = size

p1 = Package('src',1024)
p2 = Package('bin',512)
p3 = Package('resource',2044)
r = Repository()
r.add_package(p1)
r.add_package(p2)
r.add_package(p3)
print("Size of Repository After adding three packages in repository : ",r.total_size())
r.remove_package(p3)
print("Size of Repository After removing one packages in repository : ",r.total_size())
