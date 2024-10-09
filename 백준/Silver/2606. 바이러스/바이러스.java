import java.util.*;
import java.io.*;

class Main {
	static int N;
	static int M;
	static List<Integer>[] list;
	static boolean check[];
	
	static void input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		list = new LinkedList[N + 1];
		for(int i = 0; i < N+1; i++) {
			list[i] = new LinkedList<>();
		}
		
		for(int i = 0; i < M; i++) {
			String[] st = br.readLine().split(" ");
			int num1 = Integer.parseInt(st[0]);
			int num2 = Integer.parseInt(st[1]);
			
			list[num1].add(num2);
			list[num2].add(num1);
		}
		
		check = new boolean[N + 1];
	}
	
	static int bfs(int x) {
		Queue<Integer> que = new LinkedList<>();
		int count = 0;
		
		que.add(x);
		check[x] = true;
		
		while(!que.isEmpty()) {
			int node = que.poll();
			for(int i = 0; i < list[node].size(); i++) {
				int nextNode = list[node].get(i);
				if(check[nextNode]) continue;
				check[nextNode] = true;
				que.add(nextNode);
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		input();
		System.out.println(bfs(1));
	}
}
