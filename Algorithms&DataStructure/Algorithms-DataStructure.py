import random
alist = [54, 26, 93, 17, 77, 31, 44, 55, 20]


def hashKey(value, arraySize):
    return value % arraySize


def initHashTable(hashTableSize):
    hashTable = {}
    for i in range(hashTableSize):
        hashTable[i] = None
    return hashTable


table = initHashTable(10)


def insertInTable(item, hashTable):
    if hashTable[hashKey(item, len(hashTable))]:
        hashTable[hashKey(item, len(hashTable))].append(item)
        return
    hashTable[hashKey(item, len(hashTable))] = [item]


def insertArrayInTable(array, hashTable):
    for item in array:
        insertInTable(item, hashTable)


insertArrayInTable(alist, table)

print(table)
