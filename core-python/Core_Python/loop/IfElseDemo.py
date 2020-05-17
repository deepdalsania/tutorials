# it follows indentation same indentation in if considered as in if block
from builtins import print

'''if True:
    print("right")
print("wrong")'''

# above statement print both and this print only outer statement
'''if False:
    print("right")
print("wrong")'''

a = int (input('Enter a number : '))
# using %
'''if a % 2 == 0:
    print('Even')
else:
    print('odd')
'''

# using bit wise
'''if a & 1 == 0:
    print('Even')
else:
    print('odd')'''

# using division operator
'''if (a // 2) * 2 == a:
    print('Even')
else:
    print('odd')'''

# using ternary operator
result ="Even" if a % 2 == 0 else "odd"
print(result)

# using only if
def find_even(a):
    if(a % 2 == 0):
        return "even"
    return "odd"

print(find_even(int (input('Enter a number : '))))

