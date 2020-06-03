# sorted list is not necessary

pos = -1

def linearSearch(lst,n):
    '''i = 0
    while i < len(lst):
        if lst[i] == n:
            globals()['pos'] = i
            return True
        i+=1
    return False'''
    for pos,val in enumerate(lst):
        if val == n:
            globals()['pos'] = pos
            return True
    return False



lst = [2,4,6,7,5,9,8]
n = 7
if linearSearch(lst,n):
    print("Value found at index {}".format(pos+1))
else:
    print("Value not Found")