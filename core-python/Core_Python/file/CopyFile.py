import os
# change your parent dir accordingly
try:
    dir_path, file_name1 = 'E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/', 'CopyFile_1.txt'
    f1 = open(os.path.join(dir_path, file_name1), 'a+')
    ''' we can use this list comprehension str([i for i in range(1,11)]) for storing 10 string
        numbers but it will store array like this [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] but we
        want to write one element in one line'''
    for data in range(1,11):
        f1.write(str(data)+"\n")
    file_name2 = "CopyFile_2.txt"
    f2 = open(os.path.join(dir_path, file_name2), 'a+')
    #f2.write("<< This is file for copying content of CopyFile_1>>")
    f1.seek(0)
    for data in f1:
        f2.write(data)
    f2.seek(0)
    print("Copied content read from CopyFile_2 : ")
    for data in f2:
        print(data,end="")
    f1.close()
    f2.close()
except (IOError,FileNotFoundError) as e:
    print(e)