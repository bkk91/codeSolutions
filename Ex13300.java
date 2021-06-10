package solution;

import java.io.*;

public class Ex13300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number = br.readLine();		
		String[] line = number.split(" ");		
		int K = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		
		int[][] count = new int[6][2];  // 기본 테이블: 이차원배열
		
		for(int i = 0; i < K; i++) {
			String temp = br.readLine();
			String[] info = temp.split(" ");
			int x = Integer.parseInt(info[1]) - 1;
			int y = Integer.parseInt(info[0]);
			count[x][y] ++;
		}		
		int room = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 2; j++) {
				if(count[i][j] != 0) {
					double temp = Double.valueOf(count[i][j]);
					int result = (int) Math.ceil(temp / N) ;
					room += result;
				}
			}
		}
		
		System.out.println(room);
		
	}
}
