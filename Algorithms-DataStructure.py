arr = [9, 5, 28, 24, 47, 55]


def sqaure(a):
    for i in range(len(a)):
        for j in range(i+1, len(a)):
            if a[i]**2 == a[j]:
                return True
    return False


print(sqaure(arr))
