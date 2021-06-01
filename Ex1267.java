package solution;

import java.io.*;

public class Ex1267 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());		
		String time = br.readLine();
		
		String[] eachTime = time.split(" ");
		
		int priceY = 0;
		int priceM = 0;
		
		for(int i = 0; i < cnt; i ++) {
			int temp = Integer.parseInt(eachTime[i]);
			priceY += Y(temp);
			priceM += M(temp);
		}
		
		if(priceY < priceM) {
			System.out.print("Y" +" " + priceY);
		}else if(priceY > priceM) {
			System.out.print("M" +" " + priceM);
		}else {
			System.out.println("Y M"+" "+priceY);
		}
	}
	
	static int Y(int n) {
		int a = n / 30;
		int b = n % 30;
		int c = 0;
		if(b != 0) {
			c = 1;
		}
		int price = a * 10 + c * 10;
		
		return price;
	}
	
	static int M(int n) {
		int a = n / 60;
		int b = n % 60;
		int c = 0;
		if(b != 0) {
			c = 1;
		}
		int price = a * 15 + c * 15;
		
		return price;
	}
}
