import os

try:
    directory = "dirfiles"
    parent_dir = "E:/PythonWorkspace/Core_Python/"
    path = os.path.join(parent_dir,directory)
    '''  mode is set to '0o666' which allowed both read and write functionality for the 
         newly created file. We can create directory with mode or with out mode'''
    ''' we can also use os.path.exists(path)'''
    if not os.path.isdir(path):
        ''' IF we have to create nested dirs like E:/PythonWorkspace/Core_Python/a/b
            then we have to use makedirs'''
        os.mkdir(path,mode=0o666)
    f = open(os.path.join(path+"/","DirMethods.txt"),'a')
    print("seperator : ", os.sep, "\nos path seperator : ", os.pathsep)
    print("Operating system name Name : ",os.name)
    print("Current Working Directory : ",os.getcwd())
    print("Change Directory : ",os.chdir(path))
    print("Current Working Directory after change directory : ",os.getcwd())
    print("Access (test the existence of path) : ",os.access(path,mode=os.F_OK))
    print("Access (test the readability of path) : ",os.access(path,os.R_OK))
    print("Access (test the writbaility of path) : ",os.access(path,os.W_OK))
    print("Access (determine if path can be executed.) : ",os.access(path,os.X_OK))
    print("Path : ", f.name)
    base_name = os.path.basename(path +"/"+ "DirMethods.txt")
    print("File name with extension : ", base_name)
    print("File name with out extension (tuple) : ", os.path.splitext(base_name))
    print("File name with out extension (file name) : ", os.path.splitext(base_name)[0], "\nExtension name : ",
          os.path.splitext(base_name)[1])
    print("Before Rename : ",os.listdir(path))
    os.rename(os.path.join(path+"/","OldFoo.txt"),os.path.join(path+"/","NewFoo.txt"))
    print("After Rename : ",os.listdir(path))
    f.close()
except (IOError,FileNotFoundError,OSError,Exception) as e:
    print(e)
