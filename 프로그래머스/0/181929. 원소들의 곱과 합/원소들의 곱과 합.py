def solution(num_list):
    result1 = 1
    result2 = 0
    
    answer = 0
    for i in num_list:
        result1 *= i
        result2 += i
    if result1 < (result2 * result2):
        answer = 1
    else:
        answer = 0
        
    return answer