import os
# change your parent dir accordingly
try:
    dir_path,file_name1 = 'E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/exfiles/','WriteFileMode_w.txt'
    f1 = open(os.path.join(dir_path,file_name1),'w')
    f1.write("Today")
    f1.write(" is")
    f1.write(" awesome day")
    f1.writelines(["Have a good day ahead"," Bye"])
    ''' After run first time comment above write statements and now run second time 
        it will override whole content'''
    #f1.writelines(["Hey,How are you?","\nHow's your day?"])
    print("Path : ",f1.name)
    base_name = os.path.basename(dir_path+file_name1)
    print("File name with extension : ",base_name)
    print("File name with out extension (tuple) : ",os.path.splitext(base_name))
    print("File name with out extension (file name) : ",os.path.splitext(base_name)[0],"\nExtension name : ",os.path.splitext(base_name)[1])
    f1.close()
    file_name2 = "WirteFileMode_w+.txt"
    f2 = open(os.path.join(dir_path,file_name2),'w+')
    f2.write("Today")
    f2.write(" is")
    f2.write(" awesome day")
    f2.writelines(["Have a good day ahead", " Bye"])
    ''' After run first time comment above write statements and now run second time 
        and remove below comment. it will override whole content'''
    #f2.writelines([" Hey,How are you?", "\nHow's your day?"])
    print("<<Readable Mode w+ >> : ",f2.readable())
    ''' Setting a pointer at beginning '''
    f2.seek(0)
    print("<< Reading a file with mode w+ >>","\n",f2.read())
    f2.close()
    file_name3 = "WriteFileMode_a.txt"
    f3 = open(os.path.join(dir_path, file_name3), 'a')
    '''f3.write("Today")
    f3.write(" is")
    f3.write(" awesome day")
    f3.writelines(["Have a good day ahead", " Bye"])'''
    ''' After run first time comment above write statements and now run second time 
        rather than a override content it will append. also remove below comment'''
    #f3.writelines([" Hey,How are you?", "\nHow's your day?"])
    file_name4 = "WriteFileMode_a+.txt"
    f4 = open(os.path.join(dir_path, file_name4), 'a+')
    f4.write("Today")
    f4.write(" is")
    f4.write(" awesome day")
    f4.writelines(["Have a good day ahead", " Bye"])
    ''' After run first time comment above write statements and now run second time 
        rather than a override content it will append. also remove below comment'''
    #f4.writelines([" Hey,How are you?", "\nHow's your day?"])
    print("<<Readable Mode a+ >> : ", f4.readable())
    ''' Setting a pointer at beginning '''
    f4.seek(0)
    print("<< Reading a file with mode a+ >>", "\n", f4.read())
    f4.close()
    file_name5 = "WriteFileMode_wb.txt"
    f5 = open(os.path.join(dir_path, file_name5), 'wb')
    f5.write(bytearray([1,2,3,4]))
    ''' After run first time comment above write statements and now run second time 
        it will override. also remove below comment'''
    #f5.write(bytearray([5,6,7,8]))
    f5.close()
    ''' same wb+ read and write both '''
except (IOError,FileNotFoundError) as e:
    print(e)