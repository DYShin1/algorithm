def solution(n):
    answer = 0
    num = [i for i in range(1, n + 1)]
    if n % 2 != 0:
        for i in num[::2]:
            answer += i
    else:
        for i in num[1::2]:
            answer += (i * i)
    
    return answer