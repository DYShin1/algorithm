def solution(arr):
    answer = arr
    count = 1
    while True:
        if len(answer) > count:
            count *= 2
        elif len(answer) == count:
            break
        else:
            answer += [0]
    return answer