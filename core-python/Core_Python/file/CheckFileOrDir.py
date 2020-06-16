import os
# change your parent dir accordingly
if __name__ == "__main__":
    dir = "E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExCheckDir";
    for name in os.listdir(dir):
        fullname = os.path.join(dir, name)
        # if you want to check file then use isfile()
        print("{} is a directory,".format(fullname)) if os.path.isdir(fullname) else print(
            "{} is a file.".format(fullname))
