def solution(myString):
    answer = []
    for i in myString.split("x"):
        if i == "":
            continue
        else:
            answer.append(i)
    answer.sort()
    return answer