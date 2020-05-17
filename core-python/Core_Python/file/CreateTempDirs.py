import os

try:
    directory = "tempdir"
    parent_dir = "E:/PythonWorkspace/Core_Python/"
    path = os.path.join(parent_dir, directory)
    if not os.path.isdir(path):
        os.mkdir(path, mode=0o666)
    f = open(os.path.join(path + "/", "TempFile.txt"), 'w')
    f.write("This is temporary file")
    td1 , td2 = "tempa" , "tempb"
    print("seperator : ",os.sep ,"\nos path seperator : ", os.pathsep)
    temp_mul_dirs = os.path.join(path+os.sep+os.sep,td1+os.sep+os.sep+td2)
    ''' exist_ok (optional) : A default value False is used for this parameter. 
        If the target directory already exists an OSError is raised if its value is 
        False otherwise not.'''
    os.makedirs(temp_mul_dirs, mode=0o666,exist_ok=True)
    f1 = open(os.path.join(path+os.sep+os.sep+td1+os.sep+os.sep, "TempFilea.txt"), 'w')
    f2 = open(os.path.join(temp_mul_dirs+os.sep+os.sep, "TempFileb.txt"), 'w')
    f.close()
    f1.close()
    f2.close()
except (IOError,FileNotFoundError) as e:
    print(e)
