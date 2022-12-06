from timeit import default_timer as timer


def differenceBetweenAge(a):
    newArr = []
    nextLargest = 0
    nextSmallest = 0
    n = len(a)
    for i in range(n):
        j = i+1
        if i > 0:
            if a[i] - a[i-1] > 0 and a[nextLargest] - a[i] > 0:
                newArr.append(a[nextLargest] - a[i])
                continue
            if a[nextSmallest] - a[i] > 0:
                newArr.append(a[nextSmallest] - a[i])
                continue
        while True:
            if j > n - 1:
                j = 0

            if j == i:
                newArr.append(-1)
                nextLargest = 0
                nextSmallest = 0
                break

            if a[i] < a[j]:
                newArr.append(a[j] - a[i])
                nextLargest = j
                break

            if a[i] > a[j]:
                nextSmallest = j
            j += 1
    return newArr


arr = [11, 12, 9, 11, 13, 7, 12, 9, 10, 15, 8]

print(differenceBetweenAge(arr))


def differenceBetweenAgeBrute(a):
    newArr = []
    n = len(a)
    for i in range(n):
        j = i+1

        while True:
            if j > n - 1:
                j = 0

            if j == i:
                newArr.append(-1)
                break

            if a[i] < a[j]:
                newArr.append(a[j] - a[i])
                break
            j += 1
    return newArr


arr = [11, 12, 9, 11, 13, 7, 12, 9, 10, 15, 8]

start = timer()

print(differenceBetweenAgeBrute(arr))

end = timer()
print(end - start)

start = timer()

print(differenceBetweenAge(arr))

end = timer()
print(end - start)
