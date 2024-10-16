import java.util.*;
import java.io.*;

class Main{

    static class Node{

        int x, y, count;
        boolean sword;

        public Node(int x, int y, int count, boolean sword){
            this.x = x;
            this.y = y;
            this.count = count;
            this.sword = sword;
        }
    }

    static StringBuilder sb = new StringBuilder();

    static int N, M, T;
    static int[][] map;
    static int[] xn1 = {0, 0, 1, -1};
    static int [] yn1 = {1, -1, 0, 0};
    static boolean [][][] visited;

    static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        visited = new boolean[N][M][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(String.valueOf(st.nextToken()));
            }
        }
    }

    static int bfs(){
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(0, 0, 0, false));
        visited[0][0][0] = true;
        while(!que.isEmpty()){
            Node cur = que.poll();
            if(cur.count > T) break;
            if(cur.x == N - 1 && cur.y == M - 1){return cur.count;}

            for(int i = 0; i < 4; i++){
                int nx = cur.x + xn1[i];
                int ny = cur.y + yn1[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M){continue;}
                if(!cur.sword){
                    if(!visited[nx][ny][0] && map[nx][ny] == 0){
                        que.add(new Node(nx, ny, cur.count+1, cur.sword));
                        visited[nx][ny][0] = true;
                    } else if(!visited[nx][ny][0] && map[nx][ny] == 2){
                        que.add(new Node(nx, ny, cur.count+1, true));
                        visited[nx][ny][0] = true;
                    }
                }
                else{
                    if(!visited[nx][ny][1]){
                        que.add(new Node(nx, ny, cur.count+1, cur.sword));
                        visited[nx][ny][1] = true;
                    }
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {

        input();
        int result = bfs();

        if(result == -1){
            System.out.println("Fail");
        }
        else{
            System.out.println(result);
        }

    }
}