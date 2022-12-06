def hashTable(a):
    newArr = [None] * len(a)
    for i in range(len(a)):
        if newArr[a[i] % len(a)] != None:
            newArr[a[i] % len(a) + 1] = a[i]
            continue
        newArr[a[i] % len(a)] = a[i]
