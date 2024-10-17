import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 100x100 크기의 2차원 배열 선언 (문제에서 좌표가 100을 넘지 않음)
        boolean[][] map = new boolean[100][100];
        int area = 0;

        // 4개의 직사각형 좌표 입력받기
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 주어진 좌표의 직사각형을 2차원 배열에 1로 채움
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (!map[x][y]) {  // 이미 채워진 부분은 다시 카운트하지 않음
                        map[x][y] = true;
                        area++;
                    }
                }
            }
        }

        // 총 면적 출력
        System.out.println(area);
    }
}
