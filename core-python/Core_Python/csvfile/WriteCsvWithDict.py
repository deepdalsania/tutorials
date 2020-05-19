import csv
import os

parent_dir = "E:/160350116002/Workspaces/Git_Tutorials_Repo_Projects/core-python/Core_Python/ExCsvFiles"

users = [
    {"name": "Foo", "username": "foo", "department": "IT Infrastructure"},
    {"name": "Bar", "username": "bar", "department": "User Experience Research"},
    {"name": "Buz", "username": "buz", "department": "HR"},
    {"name": "Qux", "username": "qux", "department": "R&D"}
]

keys = ["name","username","department"]
with open(os.path.join(parent_dir,"WriteCsvWithDict.csv"),'w') as user_csv:
    writer = csv.DictWriter(user_csv,fieldnames=keys)
    writer.writeheader()
    writer.writerows(users)
print("Csv generaed using dictionary")