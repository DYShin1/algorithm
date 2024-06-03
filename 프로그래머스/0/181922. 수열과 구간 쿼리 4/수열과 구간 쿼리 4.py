def solution(arr, queries):
    answer = []
    
    for query in queries:
        print(query)
        for num in range(query[0], query[1]+1) :
            if num % query[2] == 0:
                arr[num] = arr[num] + 1
    return arr