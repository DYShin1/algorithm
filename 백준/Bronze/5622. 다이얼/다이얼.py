num = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]

alpha = input()
result = 0


for i in range(len(alpha)):
    if alpha[i] in num[0]:
        result += 3
    elif alpha[i] in num[1]:
        result += 4
    elif alpha[i] in num[2]:
        result += 5
    elif alpha[i] in num[3]:
        result += 6
    elif alpha[i] in num[4]:
        result += 7
    elif alpha[i] in num[5]:
        result += 8
    elif alpha[i] in num[6]:
        result += 9
    elif alpha[i] in num[7]:
        result += 10

print(result)