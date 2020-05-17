a = 1
def var_scope():
    a = 2
    print("in fun local var (a) : ",a)


var_scope()
print("outside function global var (a) :",a)

b = 3
def var_scope():
    global b
    b = 4
    print("in fun global var (b): ", b)
    # b = 5 then it affect to global b

var_scope()
print("outside function changed global var (b) :", b)

c = 5
def var_scope():

    c = 6
    print("in fun local (c) : ",c+1)
    print("in fun global var (c): ", globals()['c'])
    # if you want to change value of global var without affecting to local variable we can use globals
    globals()['c'] = c + 1 # here var c is local


var_scope()
print("outside function changed global var (c) :", c)