# python neither uses pass by value nor pass by refrence

def manipulate(a):
    print("id before manipulating : ", id(a))
    a = 10  # it is immutable so after assigning a value id will change
    print("a : ", a)
    print("id after manipulating : ", id(a))


a = 4
print("id before calling : ", id(a))
manipulate(a)
print("a :", a)
print("id after calling : ", id(a))


def update_lst(lst):
    print("id before manipulating : ", id(lst))
    lst[2] = 10  # it is mutable so after updating a list we re geeting updated list but with same id because list is mutable
    print("lst : ", lst)
    print("id after manipulating : ", id(lst))


lst = [4, 104, 410]
print("id before calling : ", id(lst))
update_lst(lst)
print("lst :", lst)
print("id after calling : ", id(lst))
