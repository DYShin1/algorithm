chess = [1, 1, 2, 2, 2, 8]

got = input().split()

for i in range(len(got)):
    got[i] = chess[i] - int(got[i])

for i in range(len(got)):
    print(got[i], end=' ')