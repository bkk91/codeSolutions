package solution;

import java.io.*;
import java.util.*;

public class Ex3273_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] singleNumber = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			singleNumber[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		int count = 0;
		br.close();

		Arrays.sort(singleNumber);

		int start = 0;
		int end = n - 1;

		while (start < end) {
			if (singleNumber[start] + singleNumber[end] >= x) {
				if (singleNumber[start] + singleNumber[end] == x) {
					count++;
				}
				end--;
			} else {
				start++;
			}
		}
		System.out.println(count);
	}
}
