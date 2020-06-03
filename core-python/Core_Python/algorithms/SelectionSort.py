def selectionSort(lst):
    for i in range(len(lst)-1):
        minpos = i
        for j in range(i,len(lst)):
            if lst[j] < lst[minpos]:
                minpos = j
        temp = lst[i]
        lst[i] = lst[minpos]
        lst[minpos] = temp
    return lst

if __name__ == "__main__":
    lst = [23,45,12,5,6,32,54,20]
    print("Before Sorting : ",lst)
    print("After Sorting (ASC Order) : ",selectionSort(lst))
    print("After Sorting (DEC Order) : ",selectionSort(lst)[::-1])