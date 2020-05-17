from builtins import print

'''a, b, c = True, True, True
print("precedence -> not , and ,or (t & !t = f,now f | t = t so o/p is t): ", a and not b or c)'''

a, b, c = True, True, False
print("precedence -> not , and ,or (t & !t = f,now f | f = f so o/p is f): ", a and not b or c)

a, b, c = True, False, False
print("precedence -> not , and ,or (t & !f = t,now t | f = t so o/p is t): ", a and not b or c)