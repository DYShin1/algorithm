M = input()
K = [-1 for _ in range(26)]
result = []

count = 0

for i in M:
    if i not in result:
        result.append(i)
        K[ord(i) - 97] = count
        count += 1
    else:
        count += 1

for i in range(len(K)):
    print(K[i], end=' ')