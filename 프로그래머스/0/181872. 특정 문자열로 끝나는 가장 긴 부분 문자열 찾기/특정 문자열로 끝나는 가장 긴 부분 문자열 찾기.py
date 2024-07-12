def solution(myString, pat):
    answer = ''
    for i in range(len(myString) - len(pat) + 1):
        if myString[i:i + len(pat)].lower() == pat.lower():
            answer = myString[:i+len(pat)]
    return answer