a = int (input('enter a first number : '))
b = int (input('enter a second number : '))
c = int (input('enter a third number : '))

if a > b and a > c:
    print(a,'is a greater number among three')
else:
    if b > c and b > a:
        print(b, 'is a greater number among three')
    else:
        print(c, 'is a greater number among three')


