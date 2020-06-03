def insertionSort(lst):
    for i in range(1,len(lst)):
        currentValue = lst[i]
        currentPosition = i
        while currentPosition > 0 and lst[currentPosition - 1] > currentValue:
            lst[currentPosition] = lst[currentPosition - 1]
            currentPosition -= 1
        lst[currentPosition] = currentValue
    return lst


if __name__ == "__main__":
    lst = [23,45,12,5,6,32,54,20]
    print("Before Sorting : ",lst)
    print("After Sorting (ASC Order) : ",insertionSort(lst))
    print("After Sorting (DEC Order) : ",insertionSort(lst)[::-1])