def solution(dartResult):
    answer = 0
    tmp2 = []
    tmp = dartResult.replace('*', 'K ').replace('#', '*(-1) ').replace('D', '**2 ').replace('T', '**3 ').replace('S', '**1 ').split(' ')[:-1]
    print(tmp)
    for i in tmp:
        tmp2 += [i]
        print(tmp2)
        if i == '*(-1)':
            tmp2[tmp2.index('*(-1)') - 1] = tmp2[tmp2.index('*(-1)') - 1] + '*(-1)'
            tmp2.remove('*(-1)')
        
        if i == 'K':
            if tmp2.index('K') == 1:
                tmp2[0] = tmp2[0] + '*2'
                tmp2.remove('K')
            elif tmp2.index('K') == 2:
                tmp2[0] = tmp2[0] + '*2'
                tmp2[1] = tmp2[1] + '*2'
                tmp2.remove('K')
            elif tmp2.index('K') == 3:
                tmp2[1] = tmp2[1] + '*2'
                tmp2[2] = tmp2[2] + '*2'
                tmp2.remove('K')
    print(tmp2)
    for i in tmp2:
        answer += eval(i)
    
    
    return answer