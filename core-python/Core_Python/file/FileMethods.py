''' r : It opens the file to read-only. The file pointer exists at the beginning. The file
        is by default open in this mode if no access mode is passed. '''
''' w : It opens the file to write only. It overwrites the file if previously exists 
        or creates a new one if no file exists with the same name. The file pointer 
        exists at the beginning of the file.'''
# change your parent dir accordingly
f = open("E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/FileMethod.txt",'w')
print("File Name : ",f.name)
print("File Modes : ",f.mode)
print("Return an integer number (file descriptor) of the file : ",f.fileno())
print("Readable : ",f.readable())
print("Writable : ",f.writable())
print("Returns the current position of file : ",f.tell())
print("Truncate : ",f.truncate())
f.close()
