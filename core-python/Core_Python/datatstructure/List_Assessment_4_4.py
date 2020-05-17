''' The group_list function accepts a group name and a list of members, and
    returns a string with the format: group_name: member1, member2, … For
    example, group_list("g", ["a","b","c"]) returns "g: a, b, c". Fill in the
    gaps in this function to do that.'''

def group_list(group, users):
    members = group+": "
    for user in users:
        ''' it will not add , for last entry '''
        members += user + ", " if user != users[-1] else user
    return members


print(group_list("Marketing", ["Mike", "Karen", "Jake", "Tasha"]))  # Should be "Marketing: Mike, Karen, Jake, Tasha"
print(group_list("Engineering", ["Kim", "Jay", "Tom"]))  # Should be "Engineering: Kim, Jay, Tom"
print(group_list("Users", ""))  # Should be "Users:"
