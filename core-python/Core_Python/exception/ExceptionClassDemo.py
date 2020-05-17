''' A class in an except clause is compatible with an exception if it is the same class or a
    base class thereof (but not the other way around — an except clause listing a derived class
    is not compatible with a base class). For example, the following code will print B, C, D
    in that order: '''

class B(Exception):
    pass

class C(B):
    pass

class D(C):
    pass

for cls in [B, C, D]:
    try:
        raise cls()
    except D:
        print("D")
    except C:
        print("C")
    except B:
        print("B")