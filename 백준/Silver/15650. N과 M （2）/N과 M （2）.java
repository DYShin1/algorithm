import java.util.*;
import java.io.*;

class Main{
    
    public static int[] arr;
    public static boolean[] visited;  // 방문 여부를 확인할 배열
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        
        arr = new int[M + 1];
        visited = new boolean[N + 1];  // N 크기만큼 방문 여부 체크
        
        dfs(1, 1); 
        System.out.println(sb);
    }
    
    public static void dfs(int depth, int start){
        if(depth == M + 1){
            for(int i = 1; i <= M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }
        
        for(int i = start; i <= N; i++){
            if(visited[i]) continue;  // 이미 방문한 숫자는 건너뜀
            visited[i] = true;  // 숫자 사용 표시
            arr[depth] = i;
            dfs(depth + 1, i);
            visited[i] = false;  // 백트래킹: 탐색 후 방문 표시 해제
        }
    }
}