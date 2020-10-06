r_queue = []
def temp(queue,amtList):
    for i in range(0,len(amtList)):
        if amtList[0] <= x:
            r_queue.append(queue[i])
            amtList.pop(0)
            queue.pop(0)
        else:
            amtList.append(amtList[0] - x)
            amtList.pop(0)
            queue.append(queue[0])
            queue.pop(0)
        return temp(queue,amtList)
    return r_queue
t = int(input())
for i in range(1, t + 1):
    queue = []
    n, x = map(int, input().split())
    amtList = list(map(int, input().split()))
    for j in range(1, n + 1):
        queue.append(j)
    print('Case #' + str(i) + ': ',end=' ')
    for k in temp(queue, amtList):
        print(k,end=' ')
    r_queue.clear()
