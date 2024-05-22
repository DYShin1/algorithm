num = [1 for i in range(97, 123)]

alph = input().lower()

for i in alph:
    num[ord(i) - 97] += 1

max_num = max(num)
count = 0
for i in range(len(num)):
    if num[i] == max_num:
        count += 1

if count > 1:
    print('?')
else:
    print( chr(num.index(max(num)) + 97).upper())