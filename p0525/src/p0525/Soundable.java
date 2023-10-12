package p0525;

public interface Soundable {
	int VALUE = 0;;
	String sound(); //추상 메소드
	//정적 메소드
	static void eat() {
		System.out.println("맛있게 먹어");
	}
	
	private void p() {
		System.out.println("동물의 소리");
	}
	
	//default 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
