import os

# change your parent dir accordingly
parent_dir = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/"

with open(os.path.join(parent_dir,"ByteReadAndWrite.txt"),'wb+') as f:
    f.writelines([b'<----This file is for file pointer example---->',b'\n<----After Writing the pointer change their position---->'])
    f.seek(0,0)
    print("Read binary files : ",f.read())