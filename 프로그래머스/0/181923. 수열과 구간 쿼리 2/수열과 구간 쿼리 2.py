def solution(arr, queries):
    answer = []
    result = []
    arr2 = []
    
    for i in queries:
        tmp = arr[i[0]:i[1]+1]
        for j in tmp:
            if i[2] < j:
                arr2.append(j)
        if len(arr2) == 0:
            answer.append(-1)
        else:
            answer.append(min(arr2))
        arr2=[]

        
    return answer