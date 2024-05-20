M, N = input().split()
X = M[::-1]
Y = N[::-1]

if int(X) > int(Y):
    print(X)
else:
    print(Y)