import java.util.*;
import java.io.*;

class Main {

    static class Node {
        int x, y, count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static int N;
    static int[][] map;
    static int[] xn1 = {0, 0, 1, -1};
    static int[] yn1 = {1, -1, 0, 0};
    static boolean[][] visited;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        visited = new boolean[N][N];
    }

    static int bfs(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(x, y, 1));
        visited[x][y] = true;

        int count = 1; // 시작하는 집도 포함

        while (!que.isEmpty()) {
            Node qNode = que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = qNode.x + xn1[i];
                int ny = qNode.y + yn1[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny] || map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                que.add(new Node(nx, ny, qNode.count + 1));
                count++;  // 새로운 집을 발견할 때마다 증가
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        input();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    list.add(bfs(i, j));
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (int i : list) {
            System.out.println(i);
        }
    }
}
