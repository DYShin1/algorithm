def solution(arr):
    row_count = len(arr)
    col_count = max(len(row) for row in arr)
    max_size = max(row_count, col_count)

    # answer 배열을 모두 0으로 초기화
    answer = [[0] * max_size for _ in range(max_size)]
    for i in range(len(arr)):
        for j in range(len(arr[i])):
                answer[i][j] = arr[i][j]
    return answer