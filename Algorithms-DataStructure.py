array = [(6, 3, 8), (7, 2, 3), (5, 1, 3)]


def swap(j, n):
    n[j], n[j+1] = n[j+1], n[j]


def boxSorting(n):
    hauteur = 0
    swapped = False
    for i in range(len(n) - 1, 0, -1):
        hauteur += n[i][1]
        for j in range(i):
            if (n[j][0] * n[j][2] > n[j+1][0] * n[j+1][2]):
                swap(j, n)
                swapped = True

        if not swapped:
            return n
    return n


print(array)
print(boxSorting(array))
