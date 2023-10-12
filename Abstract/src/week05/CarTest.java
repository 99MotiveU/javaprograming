package week05;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=======자율주행 자동차 AICar=======");
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("=======사람이 운전하는 자동차=======");
		Car manCar = new ManualCar();
		manCar.run();
	}
	

}
