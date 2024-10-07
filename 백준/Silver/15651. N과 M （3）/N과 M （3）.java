import java.util.*;
import java.io.*;

class Main{
    
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        
        arr = new int[M + 1];
        
        dfs(1); 
        System.out.println(sb);
    }
    
    public static void dfs(int depth){
        if(depth == M + 1){
            for(int i = 1; i <= M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }
        
        for(int i = 1; i <= N; i++){
            arr[depth] = i;
            dfs(depth + 1);
            arr[depth] = 0;
        }
    }

}