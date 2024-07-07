def solution(arr):
    answer = []
    idx = []
    if 2 not in arr:
        answer.append(-1)
        return answer
    for i in range(len(arr)):
        if arr[i] == 2:
            idx.append(i)
    if len(idx) == 1:
        answer.append(arr[idx[0]])
    elif len(idx) == 2:
        answer += arr[idx[0]:idx[1]+1]
    else:
        answer += arr[idx[0]:idx[len(idx) - 1]+1]
    return answer