a = [5, 7, 8, 11]
b = [8, 5, 11, 7]
c = [11, 7, 5, 8]

for i in range(len(a)):
    for j in range(len(b)):
        for w in range(len(c)):
            if a[i] == b[j] == c[w]:
                print('A[', i+1, '] with B[', j+1, '] with C[', w+1, ']')
