def solution(myStr):
    answer = []
    tmp = []
    myStr = myStr.replace('b', 'a').replace('c', 'a')
    tmp = myStr.split('a')
    for i in tmp:
        if i == "":
            continue
        else:
            answer.append(i)
    if answer == []:
        answer.append("EMPTY")
    return answer