def solution(my_strings, parts):
    answer = ''
    count = 0
    for x,y in parts:
        answer += my_strings[count][x:y+1]
        count += 1
    return answer