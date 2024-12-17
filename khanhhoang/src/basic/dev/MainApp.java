package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main  (String[]args) {
		try (//TODO Auto-generated method stub		
		Scanner sc = new Scanner (System.in)) {
			int dai ;
			int rong ;
			System.out.println("nhap chieu rong");
			dai =sc.nextInt();
			System.out.println("nhap chieu dai");
			rong =sc.nextInt();
			
			int dientich =dai*rong;
			int chuvi = (dai+rong);
			
			
			System.out.println("dien tich:"+ dientich);
			System.out.println("chu vi:"+ dientich);
		}
        }
}
