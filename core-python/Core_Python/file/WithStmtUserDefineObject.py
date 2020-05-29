import os

# change your parent dir accordingly
class ContentWriter:

    def __init__(self,f_name):
        self.f_name = f_name
    ''' __enter()__ initialize the resource you wish to use in the object. 
        This __enter__() method should always return a descriptor of the acquired 
        resource.'''
    ''' resource descriptor : f = open(foo")-> f is a descriptor of the file stream resource.'''
    def __enter__(self):
        self.file = open(self.f_name,'w+')
        return self.file;
    '''  As soon as the code inside the with block is executed, the __exit__() method
         is called. All the acquired resources are released in the __exit__() method.
         This is how we use the with statement with user defined objects.'''
    ''' Exit the runtime context related to this object. The parameters describe the 
        exception that caused the context to be exited. If the context was exited 
        without an exception, all three arguments will be None.'''
    def __exit__(self, exc_type, exc_val, exc_tb):
        self.file.close();

''' This interface of __enter__() and __exit__() methods which provides the support 
    of with statement in user defined objects is called Context Manager.'''

parent_dir,fn1 = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/","WithStmtUDObject.txt"
with ContentWriter(os.path.join(parent_dir,fn1)) as f:
    f.writelines(["<----This file is for with statement user defined object example---->","\n<----By usin with statement we don't have to close any resource"])
    f.seek(0,0)
    print("Read file line : ",f.readline())