package p0316;

public class PromotionExample {

	public static void main(String[] args) {
		
		//int intValue = 10;
		//byte byteValue = (byte)intValue;
		//                  강제타입변환
		//System.out.println("intValue: " + byteValue);
		//System.out.println("intValue: " + intValue);
		
		//자동 타입 변환
//		byte byteValue = 100000;
//		int intValue = byteValue;
//		System.out.println("byteValue: " + byteValue);
//		
//		char charValue ='가';
//		intValue = charValue;
//		System.out.println("가의 유니코드:" + intValue);
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println("longValue:" + longValue);
//		
//		longValue = 100;
		double floatValue = 10.0;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		System.out.println();		

	}

}
