M, N = map(int, input().split())

list_num = [i for i in range(1, M+1)]

for i in range(N):
    a, b = map(int, input().split())
    list_num[a-1:b] = list(reversed(list_num[a-1:b]))

for i in range(len(list_num)):
    print(list_num[i], end=' ')