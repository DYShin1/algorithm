def solution(arr):
    answer = []
    tmp = min(arr)
    arr.remove(tmp)
    answer = arr
    if answer == []:
        answer += [-1]
    return answer