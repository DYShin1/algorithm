for i in range(int(input())):
    result = []
    M, N = input().split()
    for i in N:
        for j in range(int(M)):
            result.append(i)
    for k in range(len(result)):
        print(result[k], end='')
    print()