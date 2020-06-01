import re, os, csv
from operator import itemgetter

error_logs = {}
per_user = {}

# change parent directory accordingly
parent_dir = "E:/GitHub/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExFinalAsInteractWithOs"
pattern = r"ticky: (ERROR|INFO) ([\w\s.,'?]*) (\[#\d{4}\] )?(\([\w\.]*\))"
with open(os.path.join(parent_dir, "Syslog.txt")) as file:
    for line in file:
        result = re.search(pattern, line)
        g1, g2, g4 = result.group(1).strip(), result.group(2).strip(), result.group(4).strip()
        username = g4.replace("(", "").replace(")", "")
        if username not in per_user:
            per_user[username] = {}
            per_user[username]["INFO"] = 0
            per_user[username]["ERROR"] = 0
        if g1 == "ERROR" and g2 not in error_logs:
            error_logs[g2] = 1
            per_user[username]["ERROR"] += 1
        elif g1 == "ERROR" and g2 in error_logs:
            error_logs[g2] += 1
            per_user[username]["ERROR"] += 1
        elif g1 == "INFO" and per_user[username]["INFO"] == 0:
            per_user[username]["INFO"] = 1
        elif g1 == "INFO" and per_user[username]["INFO"] > 0:
            per_user[username]["INFO"] += 1


err_keys = ["Error", "Count"]
user_keys = ["Username", "INFO", "ERROR"]
with open(os.path.join(parent_dir, "ErrorMessage.csv"), 'a', newline="") as err_csv:
    writer = csv.DictWriter(err_csv, fieldnames=err_keys)
    writer.writeheader()
    w = csv.writer(err_csv)
    for row in sorted(error_logs.items(),key=itemgetter(1),reverse=True):
        w.writerow(row)

def mergedict(a,b):
    a.update(b)
    return a

with open(os.path.join(parent_dir,"UserStatistics.csv"), 'a', newline="") as user_csv:
    writer = csv.DictWriter(user_csv, fieldnames=user_keys)
    writer.writeheader()
    '''for row in sorted(per_user,key=itemgetter(0)):
        print({user_key: per_user[row].get(user_key) or row for user_key in user_keys})
        writer.writerow({user_key: per_user[row].get(user_key) or row for user_key in user_keys})'''
    # default sorted by 0th index
    for k,d in sorted(per_user.items()):
        '''if k = "jackowens":
            break'''
        writer.writerow(mergedict({'Username':k},d))

print("CSV files generated")
