def solution(array, commands):
    answer = []
    for i in commands:
        tmp = array[i[0] - 1:i[1]]
        tmp.sort()
        print(tmp)
        if len(tmp) < i[2]:
            answer.append(tmp[-1])
        else:
            answer.append(tmp[i[2] - 1])
    
    return answer