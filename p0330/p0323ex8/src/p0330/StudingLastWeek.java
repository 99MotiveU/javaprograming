package p0330;

import java.util.Scanner;

public class StudingLastWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		char grade;
		
		if(score>=90 && score<=100) { grade = 'A'; }
		else if(score>=80 && score<90) { grade = 'B'; }
		else if(score>=70 && score<80) { grade = 'c'; }	
		else if(score>=60 && score<70) { grade = 'D'; }
		else {grade = 'F'; }
				
		System.out.println(score + "점은 " + grade + "등급 입니다.");
	}

}
