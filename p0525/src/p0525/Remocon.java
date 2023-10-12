package p0525;

public interface Remocon {
	public void powerOn();
	static void powerOff() {
		System.out.println("TV를 끕니다.");
	}
}
