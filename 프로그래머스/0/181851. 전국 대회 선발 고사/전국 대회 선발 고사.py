def solution(rank, attendance):
    answer = 0
    tmp = []
    for i in range(len(attendance)):
        if attendance[i]:
            tmp += [rank[i]]
        else:
            tmp += [10000]
    tmp2 = sorted(tmp)
    print(tmp.index(tmp2[0]))
    print(tmp.index(tmp2[1]))
    print(tmp.index(tmp2[2]))
    answer = (10000 * tmp.index(tmp2[0])) + (100 * tmp.index(tmp2[1])) + tmp.index(tmp2[2])
    
    return answer