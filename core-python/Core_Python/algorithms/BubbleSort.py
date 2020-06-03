def bubbleSort(lst):
    for i in range(0,len(lst)):
        for j in range(i):
            if lst[j] > lst[j+1]:
                temp = lst[j]
                lst[j] = lst[j+1]
                lst[j+1] = temp
    return lst

if __name__ == "__main__":
    lst = [23,45,12,5,6,32,54,20]
    print("Before Sorting : ",lst)
    print("After Sorting (ASC Order) : ",bubbleSort(lst))
    print("After Sorting (DEC Order) : ",bubbleSort(lst)[::-1])