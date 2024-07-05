def solution(my_string, indices):
    answer = ''
    my_list = list(my_string)
    for i in indices:
        my_list[i] = 0
    for i in range(len(my_list)):
        if my_list[i] != 0:
            answer += my_list[i]
    return answer