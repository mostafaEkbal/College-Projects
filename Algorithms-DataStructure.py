""" def insertionSort(alist):
    for index in range(1, len(alist)):

        currentvalue = alist[index]
        position = index

        while position > 0 and alist[position-1] > currentvalue:
            alist[position] = alist[position-1]
            position = position-1

        alist[position] = currentvalue

"""
alist = [54, 26, 93, 17, 77, 31, 44, 55, 20]


def binarySearch(alist, item):
    if len(alist) == 0:
        return False

    midpoint = len(alist) // 2
    if alist[midpoint] == item:
        return True

    if alist[midpoint] > item:
        return binarySearch(alist[:midpoint], item)

    if alist[midpoint] < item:
        return binarySearch(alist[midpoint + 1:], item)


sorted(alist)

found = binarySearch(alist, 93)

print(found)
