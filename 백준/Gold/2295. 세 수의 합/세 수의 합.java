import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] array = new int[Integer.parseInt(br.readLine())];
        
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);
        
        Set<Integer> map = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                map.add(array[i] + array[j]);
            }
        }
        int ans = -1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                int target = array[i] - array[j];
                if(map.contains(target)){
                    ans = Math.max(ans, array[i]);
                }
            }
        }
        System.out.println(ans);
    }
}