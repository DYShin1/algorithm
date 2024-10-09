import java.util.*;
import java.io.*;

class Main {
    
    static int N, M;
    static int[] dx = {0, 0, 1, -1}; // 상하좌우 방향 배열
    static int[] dy = {1, -1, 0, 0};
    static int[][] map;
    static boolean[][] check;
    
    static class Node {
        int x, y, day;
        
        Node(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] k = br.readLine().split(" ");
        
        N = Integer.parseInt(k[0]); // 가로 길이
        M = Integer.parseInt(k[1]); // 세로 길이
        
        map = new int[M][N]; // 행렬 크기 설정
        check = new boolean[M][N];
        
        for (int i = 0; i < M; i++) {
            String[] st = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st[j]);
            }
        }
    }
    
    static int bfs() {
        Queue<Node> queue = new LinkedList<>();
        int count = 0;  // 익은 토마토가 확산되는데 걸리는 일 수
        
        // 익은 토마토를 큐에 추가
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    queue.add(new Node(i, j, 0));
                }
            }
        }
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            boolean flag = false;  // 현재 토마토에서 확산이 발생했는지 여부
            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                // 범위를 벗어나거나 이미 방문했거나, 벽(-1)이면 스킵
                if (nx < 0 || nx >= M || ny < 0 || ny >= N || map[nx][ny] != 0) {
                    continue;
                }
                
                // 익지 않은 토마토가 익게 되는 경우
                map[nx][ny] = 1;
                queue.add(new Node(nx, ny, current.day + 1));
                flag = true;  // 새로운 토마토가 익었음을 표시
                count = Math.max(count, current.day + 1);  // 현재까지 걸린 최대 일 수 갱신
            }

            // 이번에 새로운 토마토가 익었다면, 최종 일 수를 갱신
            if (flag) {
                count = current.day + 1;
            }
        }

        // 익지 않은 토마토가 남아있는지 확인
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    return -1;  // 익지 않은 토마토가 남아있으면 -1 반환
                }
            }
        }
        
        return count;  // 모든 토마토가 익는데 걸린 일 수 반환
    }
    
    public static void main(String[] args) throws IOException {
        input();
        int result = bfs();
        System.out.println(result);
    }
}
