package solution;

import java.io.*;
import java.util.*;

public class Ex15953_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			String test = br.readLine();
			String[] str = test.split(" ");

			int aRank = Integer.parseInt(str[0]);
			int bRank = Integer.parseInt(str[1]);
			int sum = getPrizeA(aRank) + getPrizeB(bRank);
			System.out.println(sum * 10000);
		}
	}

	public static int getPrizeA(int rank) {
		int prize = 0;
		Map<Integer, Integer> ranked = new HashMap<Integer, Integer>();
		int grade = 0;
		for (int i = 1; i <= 6; i++) {
			ranked.put(i, i);
			if (ranked.get(i - 1) != null) {
				ranked.put(i, i + ranked.get(i - 1));
			}
			if (rank <= ranked.get(i)) {
				grade = i;
				break;
			}
		}
		if (grade == 1) {
			prize = 500;
		} else if (grade == 2) {
			prize = 300;
		} else if (grade == 3) {
			prize = 200;
		} else if (grade == 4) {
			prize = 50;
		} else if (grade == 5) {
			prize = 30;
		} else if (grade == 6) {
			prize = 10;
		} else {
			prize = 0;
		}
		return prize;
	}

	public static int getPrizeB(int rank) {
		int prize = 0;
		Map<Integer, Integer> ranked = new HashMap<Integer, Integer>();
		int grade = 0;

		// 1, 3, 7, 15, 31
		for (int i = 1; i <= 5; i++) {
			ranked.put(i, i);
			if (ranked.get(i - 1) != null) {
				ranked.put(i, (int) (Math.pow(2, i)) - 1);
			}
			if (rank <= ranked.get(i)) {
				grade = i;
				break;
			}
		}
		if (grade == 1) {
			prize = 512;
		} else if (grade == 2) {
			prize = 256;
		} else if (grade == 3) {
			prize = 128;
		} else if (grade == 4) {
			prize = 64;
		} else if (grade == 5) {
			prize = 32;
		} else {
			prize = 0;
		}
		return prize;
	}
}
