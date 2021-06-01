package solution;

import java.util.*;
import java.io.*;

public class Ex2309_2 {
	static boolean[] selected;
	static int sum = 0;
	static int cnt = 0;
	static int[] arr;
	static int[] result = new int[7];	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[9];
		selected = new boolean[arr.length];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		find(0);
	}
	
	static void find(int idx) {
		if(idx == arr.length) {
			if(cnt == 7 && sum == 100) {
				int num = 0;
				for(int i = 0; i < 9; i++) {
					if(selected[i]) {
						result[num] = arr[i];
						num++;
					}
				}
				Arrays.sort(result);
				
				for(int i = 0; i < 7; i++) {
					System.out.println(result[i]);
					System.exit(0);
				}				
			}
			return;
		}
		selected[idx] = true;
		sum += arr[idx];
		cnt++;
		find(idx + 1);
		
		selected[idx] = false;
		sum-= arr[idx];
		cnt--;
		find(idx + 1);
	}
}
