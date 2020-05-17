def username_len(lst):
    gtfive, ltfive = 0, 0
    for i in lst:
        if len(i) > 5:
            gtfive += 1
        else:
            ltfive += 1
    return gtfive, ltfive

n = int(input("How many user you want to pass ? : "))
lst = []
for i in range(n):
    user = input("Enter username : ")
    lst.append(user)

gt, lt = username_len(lst)
print("Username gt five letters : {} and Username lt five letters : {}".format(gt, lt))
