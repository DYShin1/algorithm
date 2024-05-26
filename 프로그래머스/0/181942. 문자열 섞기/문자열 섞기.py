def solution(str1, str2):
    answer = ''
    count1 = 0
    count2 = 0
    
    for i in range(len(str1) + len(str2)):
        if i % 2 == 0:
            answer = answer + str1[count1]
            count1 += 1
        else:
            answer = answer + str2[count2]
            count2 += 1
    
    return answer