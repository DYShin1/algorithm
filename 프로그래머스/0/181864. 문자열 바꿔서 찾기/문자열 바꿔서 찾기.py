def solution(myString, pat):
    answer = 0
    tmp = ''
    for i in pat:
        if i == 'A':
            tmp += 'B'
        else:
            tmp += 'A'
    if tmp in myString:
        answer = 1
    else:
        answer = 0
    return answer