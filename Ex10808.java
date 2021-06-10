package solution;

import java.io.*;

public class Ex10808 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String s = br.readLine();
		String[] syllable = s.split("");
		
		int lengthS = syllable.length;
		int lengthA = alphabet.length;

		int[] print = new int[lengthA];
		
		for(int i = 0; i < lengthS; i++) {
			for(int j = 0; j < lengthA; j++) {
				if(syllable[i].equals(alphabet[j])) {
					print[j] ++;
				}
			}
		}
		
		for(int i = 0; i < lengthA; i++) {
			System.out.print(print[i] + " ");
		}
		
		
	}
}
