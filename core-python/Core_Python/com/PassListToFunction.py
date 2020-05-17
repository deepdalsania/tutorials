def count(lst):
    even, odd = 0, 0
    for i in lst:
        if i % 2 == 0:
            even += 1
        else:
            odd += 1
    return even, odd


n = int(input("How many number you want to enter for even and odd numbers ? : "))
lst = []
for i in range(n):
    j = int(input("Enter any positive number : "))
    lst.append(j)

even, odd = count(lst)
print("Even : {} and Odd : {}".format(even,odd))
