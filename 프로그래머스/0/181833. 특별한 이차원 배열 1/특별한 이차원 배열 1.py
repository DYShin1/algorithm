def solution(n):
    answer = [[0 for _ in range(n)]for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if j == i:
                answer[i][j] = 1
    return answer