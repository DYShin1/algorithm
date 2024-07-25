# def solution(s, n):
#     answer = ''
#     for i in s:
#         if i >= 'a' and i <= 'z':
#             if i == 'z':
#                 answer += chr(96 + n)
#             else:
#                 answer += chr(ord(i) + n)
#         elif i >= 'A' and i <= 'Z':
#             if i == 'Z':
#                 answer += chr(65 + n)
#             else:
#                 answer += chr(ord(i) + n)
#         else:
#             answer += ' '                
#     return answer

def solution(s, n):
    answer = ''
    for i in s:
        if 'a' <= i <= 'z':
            answer += chr((ord(i) - ord('a') + n) % 26 + ord('a'))
        elif 'A' <= i <= 'Z':
            answer += chr((ord(i) - ord('A') + n) % 26 + ord('A'))
        else:
            answer += i  # 공백은 그대로 둡니다.
    return answer
