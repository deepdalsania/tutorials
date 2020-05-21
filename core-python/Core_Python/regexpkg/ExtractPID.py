import re

log = "May 21 08:07:10 mycomputer bad_process[12345]: ERROR Performing package upgrade"
pattern = r'\[(\d+)\]'
print("PID : ", re.search(pattern, log)[1])
# checking regex on other strings
print("Different String (1) : ", re.search(pattern, "A completely different string that also has numbers [34567]")[1])
# it gives TypeError: 'NoneType' object is not subscriptable
#print("Different String (2) : ", re.search(pattern, "99 elements in a [cage]")[1])

print("Extract PID Method in Action")
def extract_pid(log):
    pattern = r'\[(\d+)\]'
    result = re.search(pattern,log)
    if result is None:
        return  ""
    return result[1]

print("Extract PID (1) : ",extract_pid("May 21 08:07:10 mycomputer bad_process[12345]: ERROR Performing package upgrade"))
print("Extract PID (2) : ",extract_pid("99 elements in a [cage]"))