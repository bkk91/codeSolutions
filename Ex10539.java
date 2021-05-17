package solution;

import java.io.*;
import java.util.*;

public class Ex10539 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> sequenceB = new ArrayList<>();
		ArrayList<Integer> sequenceA = new ArrayList<>();

		String str1 = br.readLine();
		String[] str2 = str1.split(" ");

		for (int i = 0; i < n; i++) {
			sequenceB.add(Integer.parseInt(str2[i]));
			int number = (i + 1) * sequenceB.get(i) - sum(sequenceA, i);
			sequenceA.add(number);
		}
		for(int i = 0; i < n; i++) {
			System.out.print(sequenceA.get(i)+" ");
		}
		
	}

	// 로직
	// b[n] = sum(a[n]) / n
	// b[1] = a[1]/1
	// b[2] = a[1] + a[2] / 2
	// b[3] = a[1] + a[2] + a[3] / 3
	// n * b[n] = sum(a[n])
	// n * b[n] - sum(a[n-1]) = a[n]
	
	// sequence에서 입력하는 count까지의 sum을 구하는 method
	public static int sum(ArrayList<Integer> sequence, int count) {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += sequence.get(i);
		}
		return sum;
	}
}
