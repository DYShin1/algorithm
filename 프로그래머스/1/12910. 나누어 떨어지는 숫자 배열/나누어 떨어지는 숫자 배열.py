def solution(arr, divisor):
    answer = []
    arr.sort(reverse = False)
    for i in arr:
        if i % divisor == 0:
            answer += [i]
    if answer == []:
        answer += [-1]
    return answer