def solution(N, stages):
    answer = []
    stage_counts = [0] * (N + 2)  # 각 스테이지에 도달한 사용자 수를 저장
    failure_rates = []

    # 각 스테이지에 도달한 사용자 수 계산
    for stage in stages:
        stage_counts[stage] += 1

    total_players = len(stages)  # 총 사용자 수

    # 실패율 계산
    for i in range(1, N + 1):
        if total_players > 0:
            failure_rate = stage_counts[i] / total_players
            total_players -= stage_counts[i]
            failure_rates.append((i, failure_rate))
        else:
            failure_rates.append((i, 0))

    # 실패율을 기준으로 내림차순 정렬 (실패율이 같으면 스테이지 번호가 작은 순서대로)
    failure_rates.sort(key=lambda x: (-x[1], x[0]))

    # 정렬된 스테이지 번호만 추출하여 answer에 추가
    for item in failure_rates:
        answer.append(item[0])

    return answer
