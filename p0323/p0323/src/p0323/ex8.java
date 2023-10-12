package p0323;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		//p.104  학점 계산 프로그램 + scanner응용
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
			
		
		
		char grade = (x > 90)? 'A' : (x> 80)? 'B':'C';
		System.out.println(x + "점은 " + grade + "등급입니다.");
	}

}
