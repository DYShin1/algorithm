def solution(my_string):
    answer = []
    for i in my_string.split(' '):
        if i == '':
            continue
        else:
            answer.append(i)
    return answer