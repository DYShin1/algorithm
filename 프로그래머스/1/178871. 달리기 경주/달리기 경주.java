import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // HashMap을 사용해 각 플레이어의 현재 인덱스를 저장
        Map<String, Integer> playerMap = new HashMap<>();
        
        // 초기화: players 배열의 각 플레이어와 인덱스를 매핑
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        // 호출된 순서에 따라 위치 변경
        for (String call : callings) {
            int currentIndex = playerMap.get(call);
            if (currentIndex > 0) {
                // 앞선 플레이어와 위치를 교환
                String previousPlayer = players[currentIndex - 1];
                
                // 배열에서 위치를 바꾼다
                players[currentIndex - 1] = call;
                players[currentIndex] = previousPlayer;
                
                // HashMap에서 위치를 업데이트
                playerMap.put(call, currentIndex - 1);
                playerMap.put(previousPlayer, currentIndex);
            }
        }
        
        return players;
    }
}