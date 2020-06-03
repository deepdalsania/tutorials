from algorithms.SelectionSort import selectionSort
# list must be sorted

pos = -1
def binarySearch(lst,n):
    lb = 0
    ub = len(lst) - 1
    while lb <= ub:
        mid = (lb + ub) // 2
        if lst[mid] == n:
            globals()['pos'] = mid
            return True
        else:
            if lst[mid] < n:
                lb = mid + 1
            else:
                ub = mid - 1
    return False

lst = [23,45,12,5,6,32,54,20]
n = 32
if binarySearch(selectionSort(lst),n):
    print("Value found at index {}".format(pos + 1))
else:
    print("Value not Found")