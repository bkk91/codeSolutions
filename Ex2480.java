package solution;

import java.io.*;

public class Ex2480 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String test = br.readLine();
		int[] eachNumber = new int[3];

		for (int i = 0; i < 3; i++) {
			String[] str = test.split(" ");
			eachNumber[i] = Integer.parseInt(str[i]);
		}
		prize(eachNumber[0], eachNumber[1], eachNumber[2]);

	}

	public static void prize(int a, int b, int c) {

		int sum = 0;

		if (a == b & b == c) {
			sum = 10000 + a * 1000;
		} else if (a == b) {
			sum = 1000 + a * 100;
		} else if (b == c) {
			sum = 1000 + b * 100;
		} else if (a == c) {
			sum = 1000 + a * 100;
		} else {
			int max;
			max = (a > b && a > c) ? a : (b > c) ? b : c;
			sum = max * 100;
		}

		System.out.println(sum);
	}

}
