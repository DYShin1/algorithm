def solution(participant, completion):
    answer = ''
    for i in participant:
        if i not in completion:
            return i
    return answer