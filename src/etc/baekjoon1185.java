package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1185 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int temp;
		Queue<Integer> Q = new LinkedList<>();
		for(int i = 1; i<=n; i++)
			Q.add(i);
		
		sb.append("<");
		 while(Q.size() != 1) {
	     // K - 1번째까지는 처음에 있던 값을 맨 뒤로 보낸다.
		for (int i = 0; i < k - 1; i++) {
	          Q.offer(Q.poll());
	        }
	            // K번째 값은 poll한 후 출력한다.
	       sb.append(Q.poll() + ", ");
	    }
		sb.append(Q.poll() + ">");;
		System.out.println(sb);
		bf.close();
	}
}
