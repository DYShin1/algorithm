def solution(arr, queries):
    answer = []
    for x, y in queries:
        for i in range(len(arr[x:y+1])):
            arr[x+i] += 1
    answer = arr
    return answer