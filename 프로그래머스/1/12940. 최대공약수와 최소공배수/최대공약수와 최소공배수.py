def solution(n, m):
    answer = []
    tmp = max(n, m)
    for i in range(1, max(n, m) + 1):
        if n % i == 0 and m % i == 0:
            answer = [i]
    for i in range(max(n, m), (n * m) + 1):
        if i % n == 0 and i % m == 0:
            answer += [i]
            break
            
    
    return answer