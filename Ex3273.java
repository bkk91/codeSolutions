package solution;

import java.io.*;

public class Ex3273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] singleNumber = new int[n];
		
		String str1 = br.readLine(); 
		String[] str2 = str1.split(" ");		
		
		for(int i = 0; i < n; i++) {
			singleNumber[i] = Integer.parseInt(str2[i]);
		}
		
		int x = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < n; i ++) {
			for(int j = i; j < n; j ++) {
				if(singleNumber[i] + singleNumber[j] == x) {
					count ++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}
