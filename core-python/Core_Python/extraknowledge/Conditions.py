a, b, c = 2, 3, 4
print("a<b is t but b == c false so whole false : ", a < b == c)

a, b, c = 2, 3, 3
print("a<b is t but b == c true so whole true : ", a < b == c)

a, b, c = 4, 3, 3
print("a<b is false but b == c true so whole false : ", a < b == c)

a, b, c, d = 3, True, 5, 5
print("a<b is t but b == c false so whole false : ",d == c or a < c and not b)

print(not b)
