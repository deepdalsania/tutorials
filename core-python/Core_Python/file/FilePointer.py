import os
# change your parent dir accordingly
try:
    parent_dir = "E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/"
    fptr = open(os.path.join(parent_dir,"FilePointer.txt"),'w+')
    print("Initial File Pointer : ",fptr.tell())
    fptr.writelines(["<----This file is for file pointer example---->","\n<----After Writing the pointer change their position---->"])
    print("After Writing content, File Pointer is at  : ",fptr.tell())
    ''' So now we have to set pointer to zero by using seek'''
    ''' seek(offset,whence) : offset-> position to read/write
        whence -> default 0 means absolute file positioning
                  1 means seek relative to current position
                  2 means seek relative to the file's end '''
    fptr.seek(0,0)
    print("Read file from beginning : ",fptr.read())
    print("After Reading content, File Pointer is at  : ",fptr.tell())
    ''' set position to first line '''
    fptr.seek(47)
    print("After Setting pointer to 47, File Pointer is at  : ",fptr.tell())
    fptr.seek(0,1)
    print("After Setting offset to 0 and whence to 1, File Pointer is at  : ",fptr.tell())
    print("Read file from 47th to current position of file : ",fptr.read())
    print("After Reading content, File Pointer is at  : ",fptr.tell())
    fptr.seek(47)
    print("After Setting pointer to 47, File Pointer is at  : ", fptr.tell())
    fptr.seek(0, 2)
    print("After Setting offset to 0 and whence to 2, File Pointer is at  : ", fptr.tell())
    ''' Here we don't get data becasue whence = 2 set pointer to end of file '''
    print("Read file from 106th to end position of file : ", fptr.read())
    print("After Reading content, File Pointer is at  : ", fptr.tell())
except (IOError,FileNotFoundError,Exception) as e:
    print(e)