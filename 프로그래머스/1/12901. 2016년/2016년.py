import datetime as dt

def solution(a, b):
    date = dt.datetime(2016, a, b)
    
    if date.weekday() == 0:
        answer = "MON"
    elif date.weekday() == 1:
        answer = "TUE"
    elif date.weekday() == 2:
        answer = "WED"
    elif date.weekday() == 3:
        answer = "THU"
    elif date.weekday() == 4:
        answer = "FRI"
    elif date.weekday() == 5:
        answer = "SAT"
    else:
        answer = "SUN"
    
    return answer