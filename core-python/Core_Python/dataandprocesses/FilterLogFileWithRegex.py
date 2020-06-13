import re, sys, os

# use commandline and my file name is LogSamples.log you can find in ExDataAndProcessFiles directory
parent_dir = "E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExDataAndProcessFiles"
logfile = sys.argv[1]

with open(os.path.join(parent_dir,logfile),'r') as f:
    for line in f:
        if 'CRON' not in line:
            continue
        pattern = r"USER \((\w*)\)$"
        result = re.search(pattern, line)
        print(result[1])