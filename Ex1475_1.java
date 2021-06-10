package solution;

import java.io.*;

public class Ex1475_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String set = br.readLine();
		String[] str = set.split("");
		int length = str.length;
		int[] digit = new int[length];

		for (int i = 0; i < length; i++) {
			digit[i] = Integer.parseInt(str[i]);
		}

		int[] count = new int[10];

		for (int i = 0; i < length; i++) {
			int temp = digit[i];
			count[temp] += 1;
		}
		int temp = count[6] + count[9];
		count[6] = checkSixNine(temp);
		count[9] = checkSixNine(temp);

		int largest = 0;
		for (int i = 0; i < 10; i++) {
			if (count[i] > largest) {
				largest = count[i];
			}
		}
		System.out.println(largest);

	}
	
	public static int checkSixNine(int N) {
		double count = 0;
		double temp = (double) N / 2;
		count = Math.ceil(temp);
				
		return (int) count;
	}
}
