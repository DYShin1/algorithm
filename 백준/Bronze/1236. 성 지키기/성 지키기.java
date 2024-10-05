import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 행
        int M = sc.nextInt(); // 열
        char[][] map = new char[N][M];
        
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }
        
        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }
        
        int needRowCount = N;
        int needColCount = M;
        
        // 필요한 행과 열의 개수를 계산
        for (int i = 0; i < N; i++) {
            if (existRow[i]) {
                needRowCount--;  // 오타 수정: needRowCoun -> needRowCount
            }
        }
        
        for (int i = 0; i < M; i++) {
            if (existCol[i]) {
                needColCount--;
            }
        }
        
        // 필요한 행과 열 중 더 큰 값을 출력
        System.out.println(Math.max(needRowCount, needColCount));
    }
}
