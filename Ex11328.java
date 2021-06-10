package solution;

import java.io.*;

public class Ex11328 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String input = br.readLine();
			String[] isSplit = input.split(" ");

			String first = isSplit[0];
			String second = isSplit[1];

			int[] alphabet = new int[26];
			boolean isPossible = true;
			for (int j = 0; j < first.length(); j++) {
				alphabet[(int) first.charAt(j) - 97] += 1;
			}
			for (int j = 0; j < second.length(); j++) {
				alphabet[(int) second.charAt(j) - 97] -= 1;
			}

			for (int item : alphabet) {
				if (item != 0) {
					isPossible = false;
					break;
				}
			}

			System.out.println(isPossible ? "Possible" : "Impossible");			
		}
	}
}
