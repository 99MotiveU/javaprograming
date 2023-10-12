package p0330;

public class Print1to10 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for(int i = 0; i<=10; i+=2) {
			System.out.print(i + " ");
			sum = sum + i; // sum += i
			count++;
		}
		System.out.println();
		System.out.print("합 = " + sum + ", 횟수 = " + count);
	}
}
