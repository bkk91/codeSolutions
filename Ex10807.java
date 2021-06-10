package solution;

import java.io.*;

public class Ex10807 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] singleN = new int[n];
		
		String numbers = br.readLine();
		
		for(int i = 0; i < n; i++) {
			String[] temp = numbers.split(" ");
			singleN[i] = Integer.parseInt(temp[i]);
		}
		
		int findN = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(singleN[i] == findN) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
