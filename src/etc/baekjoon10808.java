package etc;

import java.io.*;

public class baekjoon10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		String str = br.readLine();
		
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			arr[c - 97]++;
		}
		for (int i = 0; i<26; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
