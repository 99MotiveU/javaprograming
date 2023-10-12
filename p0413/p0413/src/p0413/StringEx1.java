package p0413;

public class StringEx1 {

	public static void main(String[] args) {
		String hobby1 = "독서";
		
		String hobby2 = new String("독서");
		
		if(hobby1.equals(hobby2))
			System.out.println("같음");
		else
			System.out.println("같지 않음");
		
		if(hobby1 == hobby2)
			System.out.println("같음");
		else
			System.out.println("같지 않음");

	}

}
