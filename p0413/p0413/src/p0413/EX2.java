package p0413;

public class EX2 {

	public static void main(String[] args) {
		int[] score= {83, 90, 87, 60, 55};
		score[1] = 100;
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
	}
			System.out.println("총합 = " + sum);
			System.out.println("평균 = " + sum/score.length);
			
		int[] score2 = new int[5];
		
		 for(int i=0; i<score2.length; i++) {
			 score2[i] = 20 * i;
		 }
		 for(int s : score2) {
			 System.out.print(s + " ");
		 }
		 
	}
	
}
