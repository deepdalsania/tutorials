def insertionSort(lst, i, n):
    currentValue = lst[i]
    currentPosition = i
    # find currentPosition within the sorted subset A[0..i-1] where element lst[i] belongs

    # Move elements of lst[0..i-1], that are greater than key, to one position ahead
    # of their current position
    while currentPosition > 0 and lst[currentPosition - 1] > currentValue:
        lst[currentPosition] = lst[currentPosition - 1]
        currentPosition -= 1
    lst[currentPosition] = currentValue

    if i + 1 <= n:
        insertionSort(lst, i + 1, n)


if __name__ == "__main__":
    lst = [23, 45, 12, 5, 6, 32, 54, 20]
    print("Before Sorting : ", lst)
    # start from second element because we compare second element to first.
    insertionSort(lst, 1, len(lst) - 1)
    print("After Sorting (ASC Order) : ", lst)
    print("After Sorting (DEC Order) : ", lst[::-1])
