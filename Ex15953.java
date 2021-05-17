package solution;

import java.io.*;

public class Ex15953 {
	public static int[] prizeA = { 500, 300, 200, 50, 30, 10 };
	public static int[] prizeB = { 512, 256, 128, 64, 32 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String str1 = br.readLine();
			String[] str2 = str1.split(" ");

			int A = Integer.parseInt(str2[0]);
			int B = Integer.parseInt(str2[1]);

			System.out.println(isPrize(A, B));
		}
	}

	public static int isPrize(int aRank, int bRank) {
		int rewardA = 0;
		int rewardB = 0;
		int sum = 0;
		if (aRank >= 1 && aRank <= 21) {
			for (int i = 1; i <= 6; i++) {
				aRank -= i;
				if (aRank <= 0) {
					rewardA = prizeA[i - 1];
				}
				if (rewardA != 0) {
					break;
				}
			}
		}
		if (bRank >= 1 && bRank <= 32) {
			for (int i = 0; i < 5; i++) {
				bRank -= Math.pow(2, i);
				if (bRank <= 0) {
					rewardB = prizeB[i];
				}
				if (rewardB != 0) {
					break;
				}
			}
		}
		sum = (rewardA + rewardB) * 10000;
		return sum;
	}
}
