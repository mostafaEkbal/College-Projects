a = [5, 7, 8, 11]
b = [8, 5, 11, 7]
c = [11, 7, 5, 8]

for i in range(len(a) // 2 - 1):
    for j in range(len(b) // 2 - 1):
        for w in range(len(c) // 2):
            if 2*w+2 >= len(c):
                if a[w] == b[2*w+1] == c[j]:
                    print('A[', w + 1, '] with B[', 2*w+2, '] with C[', j+1, ']')
                continue

            if a[w] == b[2*w+1] == c[2*w+2]:
                print('A[', w + 1, '] with B[', 2*w+2, '] with C[', 2*w+3, ']')
