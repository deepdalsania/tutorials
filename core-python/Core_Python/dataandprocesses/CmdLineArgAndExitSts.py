import sys
import os
# with no params it will print program name with pull path
# print("No parameter : ",sys.argv)
# with parameter it will print previous output with passed argv in list
# print("With parameter : ",sys.argv)

# use commandline
file_name = sys.argv[1]
parent_dir = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExDataAndProcessFiles"
if not os.path.exists(os.path.join(parent_dir,file_name)):
    with open(os.path.join(parent_dir,file_name),'w') as f:
        f.write("New file created\n")
else:
    print("Error, the file {} already exists!".format(file_name))
    sys.exit(1)