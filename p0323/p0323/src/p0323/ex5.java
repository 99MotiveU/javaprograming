package p0323;

public class ex5 {

	public static void main(String[] args) {
		//사다리꼴의 넓이 구하기
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = ((lengthTop+lengthBottom)*height/2.0);
		System.out.println("보기1번 코드로 구한 사다리꼴의 넓이 =" + area1);
	
		
		double area2 = ((lengthTop+lengthBottom)*height*1.0/2);
		System.out.println("보기2번 코드로 구한 사다리꼴의 넓이 =" + area2);
		
		
		double area3 = ((double)(lengthTop+lengthBottom)*height/2);
		System.out.println("보기3번 코드로 구한 사다리꼴의 넓이 =" + area3);
		
		System.out.println("*정답 = 1번,2번,3번*");
		System.out.println();
		
		double area4 = ((double)(lengthTop+lengthBottom*height/2));
		System.out.println("보기4번 코드로 구한 사다리꼴의 넓이 =" + area4);
		//괄호의 차이
		
	}

}
