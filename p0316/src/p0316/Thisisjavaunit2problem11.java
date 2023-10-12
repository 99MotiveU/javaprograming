package p0316;

public class Thisisjavaunit2problem11 {

	public static void main(String[] args) {
		//변수의 사용범위
		int v1 = 1;
		System.out.println("v1:" + v1);
		if(true) {
			int v2 =2;
			if(true) {
				int v3 = 3;
				System.out.println("v1:" + v1);
				System.out.println("v2:" + v2);
				System.out.println("v3:" + v3);
			}
			System.out.println("v1:" + v1);
			System.out.println("v2:" + v2);
			System.out.println("v3:" + v3);
			//v3은 if문 안에서만 존재 벗어날 경우 존재하지 않음
			
		}
		System.out.println("v1:" + v1);
		System.out.println("v2:" + v2);
		System.out.println("v3:" + v3);
		//v2도 사용할 수 없게됨
	}

}
