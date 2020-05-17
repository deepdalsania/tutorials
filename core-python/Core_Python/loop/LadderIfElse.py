m1 = int (input('Enter marks of first subject: '))
m2 = int (input('Enter marks of second subject: '))
m3 = int (input('Enter marks of third subject: '))



print('Total is : ',(m1+m2+m3))
#print(m1+m2+m3)
avg = float (m1+m2+m3) / 3
print('AVG is : ',avg)

if (avg <= 90 and avg > 80) :
    print('A')
elif(avg <= 80  and avg > 70) :
    print('B')
elif(avg <= 70  and avg > 60) :
    print('C')
elif(avg <= 60  and avg >= 40) :
    print('D')
else :
    print('Fail')