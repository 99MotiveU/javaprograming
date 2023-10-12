package p0525;

public class TV implements Remocon {

	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
		Remocon.powerOff();
		
	}
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}

}
