import  math as m

# list mutable
# a = ['deep',410,'dalsania',10.4]
# string
# a = 'Deep Dalsania'
# set it doesn't follow a sequence
#a = {'deep',410,'dalsania',10.4}
# tuple immutable
#a = ('deep',410,'dalsania',10.4)

# default increment is 1
'''for i in a :
    print(i)'''

'''for i in ['deep',410,'dalsania',10.4] :
    print(i)'''

'''for i in range(10) :
    print(i)'''
'''for i in range(11,20,2) :
    print(i)'''
# reverse
'''for i in range(20,10,-2) :
    print(i)'''

'''for i in range(1,51) :
    if (i % 5 != 0) :
        print(i)'''
# code for finding perfect root
'''for i in range(1,501) :
     a = int (m.sqrt(i))
     if(i == a*a):
        print(i,' is a perfect square number because %d * %d = %d'%(a,a,i))
     else:
        print(i,' is not perfect square number')'''

a = ['abc','def','g','hi']
for i in range(4):
	print(i,a[i])