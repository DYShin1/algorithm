def solution(arr, k):
    answer = []
    for i in arr:
        if i not in answer:
            answer += [i]
    if len(answer) > k:
        for i in range(len(answer) - k):
            answer.pop()
    elif len(answer) == k:
        return answer
    else:
        answer += [-1] * (k - len(answer))
        
    return answer