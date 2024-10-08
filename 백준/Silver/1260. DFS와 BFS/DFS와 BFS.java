import java.util.*;
import java.io.*;

class Main{
    static int N, M, V;
    static boolean[] visit;
    static ArrayList<Integer>[] arr;
    static StringBuilder sb = new StringBuilder();
    
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        N = Integer.parseInt(st[0]);
        M = Integer.parseInt(st[1]);
        V = Integer.parseInt(st[2]);
        
        arr = new ArrayList[N+1];
        
        for(int i = 1; i <= N; i++){
            arr[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++){
            String[] k = br.readLine().split(" ");
            int u = Integer.parseInt(k[0]);
            int v = Integer.parseInt(k[1]);
            
            arr[u].add(v);
            arr[v].add(u);
        }
        
        for (int i = 1; i <= N; i++) {
            Collections.sort(arr[i]);  // 작은 번호부터 방문하기 위해 정렬
        }
        
        visit = new boolean[N + 1];
    }
    
    static void dfs(int x){
        visit[x] = true;
        sb.append(x).append(' ');
        for (int i: arr[x]){
            if(visit[i]) continue;
            dfs(i);
        }
    }
    
    static void bfs(int x){
        Queue<Integer> que = new LinkedList<>();
        
        que.add(x);
        visit[x] = true;
        
        while(!que.isEmpty()){
            x = que.poll();
            sb.append(x).append(' ');
            
            for(int i: arr[x]){
                if(visit[i]) continue;
                
                que.add(i);
                visit[i] = true;
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        input();
        dfs(V);
        sb.append('\n');
        Arrays.fill(visit, false);  // 방문 배열 초기화
        bfs(V);
        System.out.println(sb);  // 결과 출력
    }
}
