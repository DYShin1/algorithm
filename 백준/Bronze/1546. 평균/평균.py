M = int(input())

list_scores = list(map(int, input().split()))
max_scores = max(list_scores)
for i in range(len(list_scores)):
    list_scores[i] = list_scores[i]/max_scores*100

print(sum(list_scores)/len(list_scores))