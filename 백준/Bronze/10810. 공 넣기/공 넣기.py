N, M = map(int, input().split())
list1 = [0 for _ in range(N)]

for i in range(M):
    num1, num2, num3 = map(int, input().split())
    for k in range(num1 - 1, num2):
        list1[k] = num3
for i in range(len(list1)):
    print(list1[i], end=' ')