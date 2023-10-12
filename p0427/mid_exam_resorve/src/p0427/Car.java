package p0427;

public class Car {
	//필드, 생성자, 메소드를 가질 수 있다.
	String model = "모닝";
	boolean start;
	int speed;

	public Car(String model, int speed, boolean start) {
		this.model = model;
		this.speed = speed;
		this.start = start;
	}
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
