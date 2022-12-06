import time
a = [140, 120, 150, 100, 170, 200, 90, 180]
b = [170, 150, 140, 90, 100, 120, 180, 200]
c = [120, 90, 200, 150, 180, 140, 100, 170]


def bruteForce(a, b, c):
    for i in range(len(a)):
        for j in range(len(b)):
            for w in range(len(c)):
                if a[i] == b[j] == c[w]:
                    print('A[', i + 1, '] with B[', j +
                          1, '] with C[', w + 1, ']')


def dynamic(a, b, c):
    for i in range(len(a)):
        found = False
        for j in range(len(b)):
            if found:
                break
            for w in range(len(c)):
                if a[i] != b[j]:
                    break
                if a[i] == b[j] == c[w]:
                    print('A[', i + 1, '] with B[', j +
                          1, '] with C[', w + 1, ']')
                    found = True
                    break


start = time.time()

bruteForce(a, b, c)

end = time.time()
print(end - start)

start = time.time()

dynamic(a, b, c)

end = time.time()
print(end - start)
