package etc;

import java.io.*;
import java.util.*;

public class baekjoon1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase(); //대문자로 바꿔주기
		int[] count = new int[26];
		
		int maxvalue = 0; 
		char maxchar = '?';
		
		for(int i=0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'A';
			++count[idx];
			
			if(maxvalue < count[idx]) {
				maxvalue = count[idx];
				maxchar = str.charAt(i);
			}
			else if(maxvalue == count[idx])
				maxchar = '?';
		}
		bw.write(maxchar);
		
		
		bw.close();
		br.close();
	}

}
