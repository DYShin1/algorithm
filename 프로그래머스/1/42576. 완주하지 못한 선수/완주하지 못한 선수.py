def solution(participant, completion):
    answer = ''
    participant = sorted(participant)
    completion = sorted(completion)
    for i in range(len(completion)):
        if participant[i] == completion[i]:
            continue
        else:
            return participant[i]
    answer = participant[-1]
    return answer