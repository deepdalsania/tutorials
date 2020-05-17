'''a = 1
count = 0
while (a <= 100) :
    if (a % 3 == 0 or a % 5 == 0) :
        a+=1
    else:
        print(a)
        a+=1
        count+=1
print("count : ",count)'''

count = 0

for i in range(1, 101):
    if (i % 3 == 0 or i % 5 == 0):
        continue
    count += 1
    print(i)
print("count : ", count)

''' another example of continue'''
''' for i in range(1, 11):
    if i % 5 == 0:
        continue
    print(i, "is not divisable by 5") '''
