package p0427;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car("모닝", 80, true); //인스턴스화
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.start);
		myCar.powerOn();
		
		Car yourCar = new Car("BMW", 140, false);
		System.out.println(yourCar.model);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.start);
	}

}
