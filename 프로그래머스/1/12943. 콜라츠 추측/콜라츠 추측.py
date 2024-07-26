def solution(num):
    answer = 0
    count = 0
    while num != 1:
        if count == 500:
            return -1
        else:
            if num % 2 == 0:
                num = num // 2
                count += 1
                continue
            else:
                num = (num * 3) + 1
                count += 1
                continue
                
    answer = count
    return answer