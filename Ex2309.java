package solution;

import java.io.*;
import java.util.*;

public class Ex2309 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ppl = new int[9];
		int count = 0;
		int sum = 0;
		boolean check = false;
		
		for(int i = 0; i < 9; i++) {
			ppl[i] = Integer.parseInt(br.readLine());
			sum += ppl[i];
		}
		
		for(int i = 0; i < 9; i++) {
			if(check)break;
			for(int j = 0; j < 9; j++) {
				if(i==j)continue;
				if(sum-ppl[j]-ppl[i]==100) {
					ppl[i]=0;
					ppl[j]=0;
					check=true;
					break;
				}
			}
		}
		
		Arrays.sort(ppl);;
		for(int i = 0; i < 9; i++) {
			if(ppl[i] != 0)
				System.out.println(ppl[i]);
		}
	}

}
