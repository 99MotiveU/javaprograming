package week06;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int card = 10000;
		int fee;
		System.out.println("카드 잔액은 10000원 입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("사용금액 입력 : ");
		String input = scanner.nextLine();
		fee = Integer.parseInt(input);
		int exchange = card-fee;
		if(exchange <0) {
			System.out.println("잔액이 부족해 교통 카드를 사용할 수 없습니다!!");
			System.exit(0);
		}else {
			System.out.println(fee+ "원을 사용하고"+" 잔액은 "+ exchange +"원 입니다.");
			System.exit(0);
		}
		
	}

}
// 이런 유형 1문제 시험 출제