import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] set = new String[N];
        
        for (int i = 0; i < N; i++) {
            set[i] = br.readLine();  // br.readLine()으로 수정
        }
        Arrays.sort(set);  // Arrays.sort()로 수정
        
        int count = 0;
        
        for(int i = 0; i < M; i++){
            if(isExist(set, br.readLine()))  // br.readLine()으로 수정
                count++;
        }
        System.out.println(count);
    }
    
    // isExist 메소드를 static으로 변경
    public static boolean isExist(String[] arr, String check){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            int compareResult = arr[m].compareTo(check);
            if(compareResult < 0) l = m + 1;
            else if(compareResult > 0) r = m - 1;
            else return true;
        }   
        return false;
    }
}
