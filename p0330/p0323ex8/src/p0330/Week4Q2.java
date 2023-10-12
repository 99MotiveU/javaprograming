package p0330;

public class Week4Q2 {

	public static void main(String[] args) {
		//switch, case 뒤에 문자열 사용 가능, double은 사용 불가
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
			case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
			
		}
		System.out.println("score1= "+score1);
	}

}
