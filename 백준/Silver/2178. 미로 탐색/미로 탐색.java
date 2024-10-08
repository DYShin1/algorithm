import java.util.*;
import java.io.*;

class Main {

    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] getNum = br.readLine().split(" ");
        N = Integer.parseInt(getNum[0]);
        M = Integer.parseInt(getNum[1]);

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';  // 공백 없는 입력 처리
            }
        }
    }

    static void bfs(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(x, y));
        visited[x][y] = true;

        while (!que.isEmpty()) {
            Node current = que.poll();
            int count = map[current.x][current.y];

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny] || map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                map[nx][ny] = count + 1;  // 방문할 때 거리 계산
                que.add(new Node(nx, ny));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);  // 목표 지점 값 출력
    }
}
