package week06;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("문자입력 : ");
			String sel = scanner.next();
		switch(sel) {
			case"a": System.out.println("a");
			break;
			case"b": System.out.println("b");
			break;
			case"q": System.exit(0);
			default : System.out.println("a/b만 입력하세요!!");
		}
		}

	}

}
