def solution(binomial):
    answer = 0
    tmp = binomial.split(" ")
    num1 = int(tmp[0])
    num2 = int(tmp[2])
    if tmp[1] == "+":
        answer = num1 + num2
    elif tmp[1] == "-":
        answer = num1 - num2
    elif tmp[1] == "*":
        answer = num1 * num2
    return answer