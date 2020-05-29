import re, sys, os

# use commandline and my file name is LogSamples.log you can find in ExDataAndProcessFiles directory
parent_dir = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExDataAndProcessFiles"
logfile = sys.argv[1]
usernames = {}

with open(os.path.join(parent_dir,logfile),'r') as f:
    for line in f:
        if 'CRON' not in line:
            continue
        pattern = r"USER \((\w*)\)$"
        result = re.search(pattern, line)
        if result is None:
            continue
        name = result[1]
        usernames[name] = usernames.get(name, 0) + 1
print(usernames)