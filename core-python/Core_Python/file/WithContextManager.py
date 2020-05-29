from os import path
from contextlib import contextmanager
# change your parent dir accordingly
''' sometimes you are writing a class and you don't want or need to inherit from 
    another class. In this case, you fill in object, which is referring to a very 
    basic, generic class that makes plain old "object'''
class ContentWriter(object):

    def __init__(self,f_name):
        self.f_name = f_name

    @contextmanager
    def open_file(self):
        try:
            file = open(self.f_name,'w+')
            yield file
        finally:
            file.close()

parent_dir,fn1 = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/","WithStmtContextMngr.txt"
cw = ContentWriter(path.join(parent_dir,fn1))
with cw.open_file() as cm_file:
    cm_file.writelines(["<----This file is for with statement using contextmanager decorator example---->","\n<----By usin with statement we don't have to close any resource"])
    cm_file.seek(0,0)
    print("Read file line : ",cm_file.readline())

''' The function open_file() is a generator function. When this open_file() function 
    is called, it creates a resource descriptor named file. This resource descriptor 
    is then passed to the caller and is represented here by the variable cm_file. 
    After the code inside the with block is executed the program control returns back
    to the open_file() function. The open_file() function resumes its execution and 
    executes the code following the yield statement. This part of code which appears 
    after the yield statement releases the acquired resources. '''