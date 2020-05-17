lst1 = [1,2,3,4]
lst2 = [5,6,7,8]
my_iter1 = iter(lst1)
my_iter2 = iter(lst2)
print("first element : ",my_iter1.__next__())
print("second element : ",my_iter1.__next__())
print("third element : ",next(my_iter1))
print("fourth element : ",next(my_iter1))
''' here it will raise an exception because we don't have fifth element so iterator will works on value
    rather than index '''
# print("fifth element : ",next(my_iter1))

print("Values from iterator using for loop : ")
for i in my_iter2:
    print(i)

''' Build your own iterator then we just have to methods iter and next '''

class OwnIter:

    def __init__(self):
        self.num = 1

    def __iter__(self):
        return self

    def __next__(self):
        if self.num < 20:
            val = self.num
            self.num +=2
            return val
        else:
            raise StopIteration

o1 = OwnIter()
print("<----------- OWN ITERATOR FOR INCREAMENT BY 2 ----------------> ","\nFirst value : ",next(o1))
print("Second value : ",o1.__next__())
'''  first 2 values will not print because it printed alread above and iterator works on values not on index so it stores the previous value when it will call next'''
print("Values from own iterator using for loop : ")
for i in o1:
    print(i)


