def solution(myString):
    answer = []
    tmp = myString.split('x')
    for i in range(len(tmp)):
        answer.append(len(tmp[i]))
    
    return answer