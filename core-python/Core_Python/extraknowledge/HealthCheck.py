import shutil as s
import psutil as p


# disk usage must be greater than 20% and cpu usage must be less than 75% than our system is healthy with this program
def checkDiskUsage(disk):
    du = s.disk_usage(disk)
    return (du.free / du.total) * 100 > 20


def checkCpuUsage():
    return p.cpu_percent(1) < 75


print("ERROR!" if not checkDiskUsage("/") or not checkCpuUsage() else "Everything is OK!")
