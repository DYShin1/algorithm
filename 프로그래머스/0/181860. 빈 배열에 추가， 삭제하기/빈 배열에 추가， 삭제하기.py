def solution(arr, flag):
    answer = []
    count = 0
    for i in flag:
        if i == True:
            answer += [arr[count]] * arr[count] * 2
            count += 1
        else:
            for i in range(arr[count]):
                answer.pop()
            count += 1
            continue
    return answer