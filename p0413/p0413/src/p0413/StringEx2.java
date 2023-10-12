package p0413;

public class StringEx2 {

	public static void main(String[] args) {
		String hobby1 = "자바 프로그래밍";
		char charValue = hobby1.charAt(1);
		System.out.println(charValue);
		int length = hobby1.length();
		System.out.println(length);
		String hobby2 = hobby1.replace("자바", "Java");
		System.out.println(hobby2);
		System.out.println(hobby1.substring(3,5));
		
	}

}
