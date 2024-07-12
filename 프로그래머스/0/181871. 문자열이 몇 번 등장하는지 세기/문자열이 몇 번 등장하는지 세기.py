def solution(myString, pat):
    answer = 0
    for i in range(len(myString) - len(pat) + 1):
        if myString[i:i + len(pat)].lower() == pat.lower():
            answer += 1
    return answer