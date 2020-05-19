import os
import datetime
# change your parent dir accordingly
parent_dir = "E:/160350116002/Workspaces/Git_Projects/core-python/Core_Python/ExFiles/"
if __name__ == "__main__":
    '''with open(os.path.join(parent_dir,"IteratingThroughFile.txt")) as file:
        for line in file:
            print(line.strip().upper())'''

    file = open(os.path.join(parent_dir, "IteratingThroughFile.txt"))
    lines = file.readlines()
    file.close()
    lines.sort()
    print(lines)
