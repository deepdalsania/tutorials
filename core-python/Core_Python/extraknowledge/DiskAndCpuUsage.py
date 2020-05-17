import shutil as s
import psutil as p
# It return tuple (total,used,free) we can unpack that
du = s.disk_usage("/")
print("Disk Usage : ",du)
print("Free Disk (%) : ",(du.free/du.total)*100)

# function receives an interval of seconds and returns an average percentage of usage in that interva;
print("CPU percentage with 0.1 sec (1) : ",p.cpu_percent(0.1))
print("CPU percentage with 0.1 sec (2) : ",p.cpu_percent(0.1))
print("CPU percentage with 0.1 sec (3) : ",p.cpu_percent(0.1))
print("CPU percentage with 0.5 sec (1) : ",p.cpu_percent(0.5))
print("CPU percentage with 0.5 sec (2) : ",p.cpu_percent(0.5))
print("CPU percentage with 0.5 sec (3) : ",p.cpu_percent(0.5))