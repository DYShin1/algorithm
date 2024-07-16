def solution(arr):
    answer = []
    for i in range(len(arr)):
        if answer != []:
            if answer[-1] == arr[i]:
                answer.pop()
            else:
                answer += [arr[i]]
        else:
            answer += [arr[i]]
    if answer == []:
        answer += [-1]
    return answer