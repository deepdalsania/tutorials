a = int (input('Enter a number for checking it is palindrome or not: '))

'''while ( a <= 10):
    print(a)
    a+=1'''

'''while ( a >= 1):
    print(a)
    a-=1'''
rev = 0
flag = a

while (a > 0) :

    n = a % 10
    rev = (rev*10) + n
    a = a // 10
if (flag==rev) :
    print(flag,'is a Palindrome Number')
else:
    print(flag,'is not a Palindrome Number')