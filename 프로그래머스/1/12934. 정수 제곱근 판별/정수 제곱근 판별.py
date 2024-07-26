def solution(n):
    answer = -1
    count = 0
    while count <= n **(1/2):
        if n == count * count:
            return (count + 1) * (count + 1)
        elif n ** (1/2) < 0:
            return -1
        else:
            count += 1
            continue
    return answer