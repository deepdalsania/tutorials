import os

# change your parent dir accordingly
try:
    dir_path, file_name1 = 'E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/', 'PythonLogo.jpg'
    ''' we can use rb then we don't have to use f1.seek(0) while copying and we can
        also use wb for copied file '''
    f1 = open(os.path.join(dir_path, file_name1), 'ab+')
    file_name2 = "Copypythonlogo.jpg"
    f2 = open(os.path.join(dir_path, file_name2), 'ab+')
    f1.seek(0)
    for data in f1:
        f2.write(data)
    print("Copied content read from Copypythonlogo : ")
    f2.seek(0)
    for data in f2:
        print(data,end="")
    f1.close()
    f2.close()
except (IOError,FileNotFoundError) as e:
    print(e)