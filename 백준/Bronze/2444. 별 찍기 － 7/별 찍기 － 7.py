num = int(input())

for i in range(num):
    print(' ' * (num - i - 1), end='')
    print('*' * (2 * i + 1), end='')
    print()
for i in range(num - 1):
    print(' ' * (i + 1), end='')
    print('*' * (2 * (num - i - 1) - 1), end='')
    print()