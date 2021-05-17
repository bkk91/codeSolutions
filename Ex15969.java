package solution;

import java.io.*;
import java.util.*;

public class Ex15969 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		
		String gradeList = br.readLine();		
		ArrayList<Integer> grade = new ArrayList<>();
		
		for(int i = 0; i < n; i ++) {
			String[] temp = gradeList.split(" ");
			grade.add(Integer.parseInt(temp[i]));
		}
		
		Collections.sort(grade);
		int diff = grade.get(grade.size()-1)- grade.get(0);
		System.out.println(diff);
	}	
}
