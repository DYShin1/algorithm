def solution(s):
    answer = ''
    tmp = list(s)
    print(len(tmp) // 2)
    if len(tmp) % 2 != 0:
        answer = tmp[len(tmp) // 2]
    else:
        answer = tmp[len(tmp) // 2 - 1] + tmp[len(tmp) // 2]
    
    return answer