def recBubbleSort(lst):
    for i, num in enumerate(lst):
        try:
            if lst[i+1] < num:
                lst[i] = lst[i+1]
                lst[i+1] = num
                recBubbleSort(lst)
        except IndexError:
            pass
    return lst

if __name__ == "__main__":
    lst = [23,45,12,5,6,32,54,20]
    print("Before Sorting : ",lst)
    print("After Sorting (ASC Order) : ",recBubbleSort(lst))
    print("After Sorting (DEC Order) : ",recBubbleSort(lst)[::-1])