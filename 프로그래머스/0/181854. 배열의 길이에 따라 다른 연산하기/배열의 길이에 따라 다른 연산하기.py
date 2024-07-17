def solution(arr, n):
    answer = []
    if len(arr) % 2 != 0:
        for i in range(len(arr)):
            if i % 2 == 0:
                answer += [arr[i] + n]
            else:
                answer += [arr[i]]
    else:
         for i in range(len(arr)):
            if i % 2 != 0:
                answer += [arr[i] + n]
            else:
                answer += [arr[i]]
        
    return answer