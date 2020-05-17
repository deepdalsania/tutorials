# WHen we want to manipulate Code in existing fuCtion we Can use DeCorators

def div(a, b):
    #print("Division is : ",(a/b))
    return a / b

def manipulate_div(fun):

    def inner_fun(a,b):
        if a < b:
            a,b=b,a
        return fun(a,b)
    return inner_fun

div = manipulate_div(div) # from manipulate_div it Call diV after tHat inner_fun is Call from again diV is Call
# div1(2,4)
print("Division is : ",div(2,4))
