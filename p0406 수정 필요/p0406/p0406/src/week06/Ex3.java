package week06;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연소득 : ");
		int income = scanner.nextInt();
		System.out.print("신용 등급 : ");
		String creditRating = scanner.next();
		System.out.print("기존 고객 여부 : ");
		Boolean customer = scanner.nextBoolean();
		
		System.out.println(income + "," + creditRating + "," 
		+ customer);
		
		if((income>=5000 || creditRating.equals("A") || creditRating.equals("B"))
				&& customer){
			System.out.println("가입 가능");
		}else {
			System.out.println("가입 불가능");
		}
		
		
	}

}
