import csv
import os

parent_dir = "E:/GitHub/1) Git_Tutorials_Repo_Projects/core-python/Core_Python/ExCsvFiles"

hosts = [["workstation.local", "192.168.45.67"], ["webserver.cloud", "10.1.1.2"]]
with open(os.path.join(parent_dir,"WriteCsvFile.csv"),'w') as csv_file:
    w_csv = csv.writer(csv_file)
    # we can also write using writerow but here we have all rows so we use writerows
    w_csv.writerows(hosts)
print("CSV generated")