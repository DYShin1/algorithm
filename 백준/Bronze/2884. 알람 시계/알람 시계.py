h, m = map(int, input().split())

if(m >= 45): 
    m = m - 45
    if(m == 45): 
        h = h - 1
        if(h == 0): h = 23
elif(h == 0):
    h = 23
    m = 60 - (45 - m)
else:
    h = h - 1
    m = 60 - (45 - m)
print(h, m)