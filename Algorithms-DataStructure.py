import random
alist = [54, 26, 93, 17, 77, 31, 44, 55, 20]


def quickSelect(items, itemIndex):

    def select(list, l, r, index):
        # base case
        if (r == 1):
            return list[l]

        # choose random pivot number
        pivotIndex = random.randint(l, r)

        # move the pivot to the begining of the list
        list[pivotIndex], list[l] = list[l], list[pivotIndex]

        # partition
        i = l
        for j in range(l + 1, r + 1):
            if (list[j] < list[l]):
                i += 1
                list[i], list[j] = list[j], list[i]

        # move pivot to the correct location
        list[l], list[i] = list[i], list[l]

        # recursively partition one side
        if (index == i):
            return list[i]
        if (i > index):
            return select(list, l, i - 1, index)
        if (index > i):
            return select(list, i + 1, r, index)

    return select(items, 0, len(items) - 1, itemIndex)


value = quickSelect(alist, 8)

print(value)
