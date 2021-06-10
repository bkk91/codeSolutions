package solution;

import java.io.*;

public class Ex2577 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] count = new int[10];
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C= Integer.parseInt(br.readLine());
		
		int result = A * B * C;
		String[] temp = Integer.toString(result).split("");
		int length = temp.length;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < 10; j++) {
				if(Integer.parseInt(temp[i]) == digits[j]) {
					count[j] ++;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
		
	}
}
