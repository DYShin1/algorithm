def solution(n, arr1, arr2):
    a = []
    b = []
    tmp = []
    tmp2 = []
    tmp3 = []
    answer = []
    for i in arr1:
        tmp = str(bin(i))
        if len(tmp) != (len(arr1) + 2):
            a.append(('0' * (len(arr1) - len(tmp) + 2)) + tmp[2:])
        else:
            a.append(tmp[2:])
    for i in arr2:
        tmp = str(bin(i))
        if len(tmp) != (len(arr1) + 2):
            b.append(('0' * (len(arr1) - len(tmp) + 2)) + tmp[2:])
        else:
            b.append(tmp[2:])
    for i in range(len(a)):
        tmp2.append(str(int(a[i]) + int(b[i])))
        tmp3.append(('0' * (len(arr1) - len(tmp2[i]))) + tmp2[i])
    for i in range(len(tmp3)):
        tmp4 = ""
        for j in tmp3[i]:
            if int(j) == 0:
                tmp4 += " "
            else:
                tmp4 += "#"
        answer.append(tmp4)
    return answer