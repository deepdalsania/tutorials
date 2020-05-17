import os
parent_dir = "E:/PythonWorkspace/Core_Python/exfiles/"

with open(os.path.join(parent_dir,"ByteReadAndWrite.txt"),'wb+') as f:
    f.writelines([b'<----This file is for file pointer example---->',b'\n<----After Writing the pointer change their position---->'])
    f.seek(0,0)
    print("Read binary files : ",f.read())