def solution(n):
    answer = ''
    tmp = list(str(n))
    tmp = sorted(tmp, reverse=True)
    for i in tmp:
        answer += i
    answer = int(answer)
    print(tmp)
    
    return answer