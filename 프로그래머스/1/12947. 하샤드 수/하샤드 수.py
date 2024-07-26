def solution(x):
    answer = True
    tmp = []
    tmp_2 = x
    while tmp_2 != 0:
        tmp += [tmp_2 % 10]
        tmp_2 = tmp_2 // 10
    if x % sum(tmp) != 0:
        answer = False
    return answer