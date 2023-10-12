package mid_exam_resorve;

public class Pr09 {

	public static void main(String[] args) {
		int[] array = {5,10,-15,0,30};
		int min = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		System.out.println("최솟값= " + min);
//원소의 합을 구하시오
		int sum = 0;
		for(int j=0; j<array.length; j++) {
			sum+=array[j]; 
		}
		System.out.println("원소의 합 = "+sum);
	}
}