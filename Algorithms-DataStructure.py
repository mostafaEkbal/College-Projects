array = [(6, 3, 8), (7, 2, 3), (5, 1, 3)]


def swap(a, i, j):
    a[i], a[j] = a[j], a[i]


def isHeap(a):
    n = 0
    m = 0
    while True:
        for i in [0, 1]:
            m += 1
            if m >= len(a):
                return True
            if a[m] > a[n]:
                return False
        n += 1


def shiftDown(a, n, max):
    while True:
        biggest = n
        c1 = 2*n + 1
        c2 = c1 + 1
        for c in [c1, c2]:
            if c < max and a[c] > a[biggest]:
                biggest = c
            if biggest == c:
                return a

            swap(a, n, biggest)
            n = biggest


def heapify(a):
    i = int(len(a) / 2 - 1)
    max = len(a)
    while i >= 0:
        shiftDown(a, i, max)
        i -= 1


def heapSort(a):
    heapify(a)
    for j in range(len(a) - 1, 0, -1):
        swap(a, 0, j)
        shiftDown(a, 0, j)


a = [12, 11, 15, 8, 9, 20, 77, 5, 2]

print(a)

heapSort(a)
print(a)
