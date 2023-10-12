package p0309;

public class Exam01 {

	public static void main(String[] args) {
		//정수
		int x = 3;//정수 리터럴
		int y = 5;
		int sum = x+y;
		
		System.out.println("x="+ x + "," + " y=" + y);
		System.out.println("sum="+ sum);
		
		char c1 = 0x30;//문자 리터럴
		char c2 = 97;
		char c3 = '가';
		
		
		System.out.println(c1 + "," + c2 + "," + c3);
		
		int num1 = 1;
		int num2 = 5;
		int sum1 = num1+num2;
		
		System.out.println("num1="+ num1 + "," + " num2=" + num2);
		System.out.println("sum1="+ sum1);
		
		char ch1 = '1';//문자 리터럴
		char ch2 = '5';		
		String chSum = "1"+"5";
		System.out.println(ch1+ch2);
		System.out.println(chSum);
		
		double dNum1 = 10.0;
		double dNum2 = 20.0;
		
		boolean result;
		result = dNum1 <= dNum2;
		
		System.out.println(dNum1 + dNum2);
		System.out.println(result);
	}

}
