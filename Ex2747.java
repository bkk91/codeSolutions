package solution;

import java.io.*;

public class Ex2747 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(Fibonacci(n));

	}

	public static int Fibonacci(int n) {
		int result = 0;
		int Fibonacci[] = new int[46];
		// index 0 = 0;
		for (int i = 2; i <= 45; i++) {
			Fibonacci[1] = 1;
			Fibonacci[2] = 1;
			if (Fibonacci[i - 1] != 0) {
				Fibonacci[i] = Fibonacci[i-2] + Fibonacci[i - 1];
			}
			result = Fibonacci[n];
		}
		return result;
	}
}
