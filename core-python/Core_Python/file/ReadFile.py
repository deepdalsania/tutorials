import os
# change your parent dir accordingly
try:
    dir_path, file_name1 = 'E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/', 'WriteFileMode_w.txt'
    ''' IF we don't pass mode as r then it is default '''
    f1 = open(os.path.join(dir_path, file_name1), 'r')
    ''' It will read 4 characters '''
    print("Read one line : ",f1.readline(4))
    ''' it will start reading after 4 characters '''
    print("Read one line : ",f1.readline())
    #print("Readlines (give array) : ",f1.readlines())
    ''' Readline read first line so now read start with the second line for reading '''
    print("<< Reading file with mode r >>","\n","read line one by one : ","\n",f1.read())
    file_name2 = "ReadFileMode_r+.txt"
    ''' r or r+ or rb or rb= will not create file if not exists '''
    f2 = open(os.path.join(dir_path, file_name2), 'r+')
    print("<< Writable with mode r+ >> : ",f2.writable())
    f2.write("Today")
    f2.write("\nis")
    f2.write("\nawesome day")
    f2.writelines(["\nHave a good day ahead", "\nBye"])
    ''' After run first time comment above write statements and now run second time 
        rather than a override content it will append. also remove below comment and you
        will see in out put that day ahed and bye are there in file other content'''
    f2.writelines(["\nHey,How are you?", "\nHow's your day?"])
    f2.seek(0)
    print("<< Reading data using loop >> ")
    for data in f2:
        print(data,end="")
except (IOError,FileNotFoundError) as e:
    print(e)