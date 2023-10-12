package p0525;

public class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹야옹";
	}

	@Override
	public void setMute(boolean mute) {
			if(mute) {
				System.out.println("고양이 소리 줄이기");
			}else {
				System.out.println("무음 해제합니다.");
			}
	
	}
}
