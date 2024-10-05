import java.util.*;
import java.io.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	static void input() {
		FastReader scan = new FastReader();
		
		N = scan.next();
		M = scan.next();
		
	}
	
	static String N, M;
	
	static void rec_func() {
		int result = 0;
		
		int[] countN = new int[26];	
		int[] countM = new int[26];
		
		
		for(int i = 0; i < N.length(); i++) {
			countN[N.charAt(i) - 'a']++;
		}
		for(int i = 0; i < M.length(); i++) {
			countM[M.charAt(i)- 'a']++;
		}
		
		for(int i = 0; i< 26; i++) {
			if(countN[i] < countM[i]) {
				result += countM[i] - countN[i];
			}
			else if(countN[i] > countM[i]) {
				result += countN[i] - countM[i];
			}
		}
		System.out.println(result);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		rec_func();

	}
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
