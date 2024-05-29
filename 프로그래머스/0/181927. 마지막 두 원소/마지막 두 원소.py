def solution(code):
    
    if code[len(code) - 1] > code[len(code) - 2]:
        code.append(code[len(code) - 1] - code[len(code) - 2])
    else:
        code.append(code[len(code) - 1] * 2)

    return code