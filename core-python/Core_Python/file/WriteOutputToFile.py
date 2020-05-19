from os import path
import subprocess
# change your parent dir accordingly
parent_dir,fn = "E:/PythonWorkspace/Core_Python/ExFiles/","WriteOutputToFile.txt"
with open(path.join(parent_dir,fn),'ab+') as f:
    subprocess.check_call(["python","E:/PythonWorkspace/Core_Python/file/CelsiusToFahrenheit.py"],stdout=f)
