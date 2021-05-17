package solution;

import java.io.*;
import java.util.Arrays;

public class Ex15953_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		int sum = 0;

		for (int i = 0; i < testCase; i++) {
			String str1 = br.readLine();
			String[] str2 = str1.split(" ");

			int A = Integer.parseInt(str2[0]);
			int B = Integer.parseInt(str2[1]);

			int first = festivalOne(isRankedA(A));
			int second = festivalTwo(isRankedB(B));

			System.out.println(first);
			System.out.println(second);
			sum = (int) ((first + second) * Math.pow(10, 4));

			System.out.println(sum);
		}
	}

	public static int festivalOne(int A) {

		int prize = 0;

		if (A == 1) {
			prize = 500;
		} else if (A == 2) {
			prize = 300;
		} else if (A == 3) {
			prize = 200;
		} else if (A == 4) {
			prize = 50;
		} else if (A == 5) {
			prize = 30;
		} else if (A == 6) {
			prize = 10;
		}

		return prize;
	}

	public static int isRankedA(int rank) {

		int[] ranked = new int[6];

		for (int i = 0; i < 6; i++) {
			ranked[i] = i + 1;
			// index numbering starts from 0
			if (i != 0) {
				ranked[i] = ranked[i - 1] + (i + 1);
			}
		}
		// components of isRanked[i]
		// rank 1 = 1; rank 2 = 3, rank 3 = 6, rank 4 = 10, rank 5 = 15, rank 6 = 21

		int grade = 0;

		for (int i = 0; i < 6; i++) {
			while (rank >= ranked[i]) {
				grade = i + 1;
				break;
			}
		}

		return grade;
	}

	public static int festivalTwo(int B) {

		int prize = 0;

		if (B == 1) {
			prize = 512;
		} else if (B == 2) {
			prize = 256;
		} else if (B == 3) {
			prize = 128;
		} else if (B == 4) {
			prize = 64;
		} else if (B == 5) {
			prize = 32;
		}

		return prize;
	}

	public static int isRankedB(int rank) {

		int[] ranked = new int[5];

		for (int i = 0; i < 5; i++) {
			ranked[i] = i + 1;
			// index numbering starts from 0
			if (i != 0) {
				ranked[i] = (int) (ranked[i - 1] + Math.pow(2, i));
			}
		}
		System.out.println(Arrays.toString(ranked));
		// components of isRanked[i]
		// rank 1 = 1; rank 2 = 3, rank 3 = 7, rank 4 = 15, rank 5 = 31

		int grade = 0;

		for (int i = 0; i < 5; i++) {
			while (rank >= ranked[i]) {
				grade = i + 1;
				break;
			}
		}

		return grade;
	}

}
