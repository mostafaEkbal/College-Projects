array = [(6, 3, 8), (7, 2, 3), (5, 1, 3)]


def swap(j, n):
    n[j], n[j+1] = n[j+1], n[j]


def boxSorting(n):
    swapped = False
    print('From Bottom')
    for i in range(len(n) - 1, 0, -1):
        for j in range(i):
            if (n[j][0] * n[j][2] > n[j+1][0] * n[j+1][2]):
                swap(j, n)
                swapped = True
        print(n[i])

        if not swapped:
            return n

        if (i == 1):
            print(n[0])
            print('To Top')
    return n


boxSorting(array)
