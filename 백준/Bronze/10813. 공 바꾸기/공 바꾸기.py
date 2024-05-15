N, M = map(int, input().split())

list_buckets = list()
for i in range(N):
    list_buckets.append(i + 1)

for i in range(M):
    num1, num2 = map(int, input().split())
    list_buckets[num1 - 1], list_buckets[num2 - 1] = list_buckets[num2 - 1], list_buckets[num1 - 1]

for i in range(len(list_buckets)):
    print(list_buckets[i], end=' ')