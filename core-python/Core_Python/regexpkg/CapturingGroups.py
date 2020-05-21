import re

username = re.search(r"^(\w*), (\w*)$","Bar, Foo")
print("Username : ",username)
print("Username Groups : ",username.groups())
print("0th Index : ",username[0])
print("1st Index : ",username[1])
print("2nd Index : ",username[2])
print("Name is {} {}".format(username[2],username[1]))

print("Rearrange name Method in Action")
def rearrange_name(name):
    username = re.search(r"^(\w*), (\w*)$", name)
    if username is None:
        return name
    return "{} {}".format(username[2],username[1])
print("Username (1) : ",rearrange_name("Lovelace, Ada"))
print("Username (2) : ",rearrange_name("Carter, John"))
print("Username (3) : ",rearrange_name("Hopper, Grace M."))

print("Rearrange names Method in Action")
def rearrange_names(name):
    username = re.search(r"^([\w \.-]*), ([\w \.-]*)$", name)
    if username is None:
        return name
    return "{} {}".format(username[2],username[1])
print("Username (1) : ",rearrange_names("Hopper, Grace M."))
print("Username (2) : ",rearrange_names("Carter, John D."))
print("Username (3) : ",rearrange_names("Silva, Joy D."))
