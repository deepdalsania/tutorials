import itertools

lst = ["Python" , "is" , "awesome" , "language"]
print("type : ",type(lst))
print("List items : ",lst)
print("item count : ",len(lst))
print("item present in list(1a) : ","python" in lst)
print("item present in list(1b) : ","Python" in lst)
print("access particular element at index : ",lst[0])
print("slice with list : ",lst[:2])
print("reverse list : ",lst[::-1])
print("last element of list : ",lst[-1])
lst[1],lst[2],lst[3] = "and" ,"Java", "are"
lst1 = ["awesome","languages"]
lst2 = lst+lst1
print("Concatenated list using + operator : ",lst2)
lst2.append("but")
print("Append single word to list at last : ",lst2)
''' Below one is replace the value at particular index '''
lst3 = [lst[0] , lst[1],"easier","than","Java"]
''' This will append whole list into lst2 If you want to add each element not
    list then use for loop '''
lst2.append(lst3)
#lst2.extend(lst3)
''' both append one by one element not whole list '''
#lst4 = [*lst2,*lst3]
#lst5 = list(itertools.chain(lst2,lst3))
print("Append one list to another using append method : ",lst2)
lst3.insert(1,"is")
print("Insert any element at specific position : ",lst2)
if "and" in lst3:
    ''' remove only first occurrence of an element'''
    lst3.remove("and")
    print("After removing element at specific position : ",lst3)
lst3.insert(10,".")
print("Insert at any index :",lst3)
lst3.pop(-1)
print("After remove element using pop(use index and remove use object) : ",lst3)
