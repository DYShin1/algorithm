num = int(input())
k = num

for i in range(num):
    for x in range(k, i + 1, -1):
        print(" ", end = '')
    for j in range(i + 1):
        print("*", end = '')
    print()