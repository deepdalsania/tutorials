import re

def rearrange_names(name):
    username = re.search(r"^([\w \.-]*), ([\w \.-]*)$", name)
    if username is None:
        return name
    return "{} {}".format(username[2],username[1])
