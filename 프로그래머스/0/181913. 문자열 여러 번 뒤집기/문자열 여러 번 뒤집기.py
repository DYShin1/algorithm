def solution(my_string, queries):
    answer = ''
    change = my_string
    for i in queries:
        change = change[:i[0]] + change[i[0]:i[1] + 1][::-1] + change[i[1] + 1:]
    answer = change
    return answer