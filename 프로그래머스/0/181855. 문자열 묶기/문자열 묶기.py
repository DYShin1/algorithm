def solution(strArr):
    answer = 0
    tmp = []
    tmp += [0] * 31
    for i in strArr:
        tmp[len(i)] += 1
    answer = max(tmp)
    print(tmp)
    return answer