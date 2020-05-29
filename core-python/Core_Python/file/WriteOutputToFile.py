from os import path
import subprocess
# change your parent dir accordingly
parent_dir,fn = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFiles/","WriteOutputToFile.txt"
with open(path.join(parent_dir,fn),'ab+') as f:
    subprocess.check_call(["python","E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/file/CelsiusToFahrenheit.py"],stdout=f)
