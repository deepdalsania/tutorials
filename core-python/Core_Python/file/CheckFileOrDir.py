import os
# change your parent dir accordingly
if __name__ == "__main__":
    dir = "E:/160350116002/Workspaces/Git_Projects/core-python/Core_Python/CheckDir";
    for name in os.listdir(dir):
        fullname = os.path.join(dir, name)
        print("{} is a directory,".format(fullname)) if os.path.isdir(fullname) else print(
            "{} is a file.".format(fullname))
