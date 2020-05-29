import os
from pathlib import Path
from shutil import rmtree
# change your parent dir accordingly
try:
    directory = "TempDir"
    parent_dir = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/"
    td1, td2 = "TempA", "TempA"
    path = os.path.join(parent_dir, directory)
    temp_mul_dirs = os.path.join(path + os.sep + os.sep, td1 + os.sep + os.sep + td2)
    ''' This methods used to remove single file. all three methods used to delete symlink too'''
    os.remove(path +os.sep+os.sep+"TempFile.txt")
    os.unlink(path +os.sep+os.sep+td1+os.sep+os.sep+"TempFilea.txt")
    ''' we can also use this syntax pathlib.Path(path +os.sep+os.sep+"TempFile.txt").unlink() '''
    f_path = Path(temp_mul_dirs +os.sep+os.sep+"TempFileb.txt")
    f_path.unlink();
    ''' both methods for delete empty dir if single dir we can use rmdir if nested the
        removedirs'''
    # os.remove(path)
    # os.removedirs(path+os.sep+os.sep+td1)
    print("List of dirs before remove : ",os.listdir(path))
    ''' For remove non empty directory we have to use shutil.rmtree and pathlib.Path(path),rmdir()'''
    rmtree(path+os.sep+os.sep+td1)
    Path(path).rmdir()
    print("List of dirs after remove : ",os.listdir(parent_dir))
except Exception as e:
    print(e)