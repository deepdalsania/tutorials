from os import path
import subprocess

parent_dir,fn = "E:/PythonWorkspace/Core_Python/exfiles/","WriteOutputToFile.txt"
with open(path.join(parent_dir,fn),'ab+') as f:
    subprocess.check_call(["python","E:/PythonWorkspace/Core_Python/file/CelsiusToFahrenheit.py"],stdout=f)
