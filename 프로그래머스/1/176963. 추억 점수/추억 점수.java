import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];  // answer 배열의 크기를 photo 배열의 길이로 초기화
        HashMap<String, Integer> mapper = new HashMap<>();
        
        // 이름과 그리움 점수를 매핑
        for (int i = 0; i < name.length; i++) {
            mapper.put(name[i], yearning[i]);
        }
        
        // 각 사진별 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int count = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                if (mapper.containsKey(photo[i][j])) {  // 사진에 있는 이름이 매핑에 있는지 확인
                    count += mapper.get(photo[i][j]);   // 점수 더하기
                }
            }
            answer[i] = count;  // 결과 배열에 저장
        }
        
        return answer;
    }
}