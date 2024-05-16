num = [int(input()) % 42 for i in range(10)]

count = 0
for i in range(10):
    if num[i] not in num[i + 1:]:
        count += 1

print(count)