list_stud = [int(input()) for i in range(28)]
k = []

for i in range(1, 31):
    if i not in list_stud:
        k.append(i)

print(min(k))
print(max(k))