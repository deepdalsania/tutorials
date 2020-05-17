import os

try:
    parent_dir = "E:/PythonWorkspace/Core_Python/exfiles/"
    fptr = open(os.path.join(parent_dir,"EofManually.txt"),'w+')
    fptr.writelines(["<----This file is for manual EOF example---->",
                     "\n<----We can do tha by using any loop---->"])
    ''' Python dosen't have a built in EOF so this is manually EOF'''
    fptr.seek(0)
    while True:
        line = fptr.readline()
        print(line,end="")
        if ("" == line):
            print("\nfile finished")
            break;
except Exception as e:
    print(e)