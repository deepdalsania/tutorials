import csv
import os
# change your parent dir accordingly
parent_dir = "E:/160350116002/Workspaces/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExCsvFiles"

file = open(os.path.join(parent_dir,"ReadCsvFile.csv"))
f_csv = csv.reader(file)
for row in f_csv:
    if row != []:
        en_no, name, branch = row
        print("Enrollment No : {}, Name : {}, Branch : {}".format(en_no,name,branch))
file.close()