package p0525;


public class SoundableExample {
	
	public static void main(String[] args) {
		Soundable ani = new Cat();
		ani.setMute(true);
		Soundable.eat();
		printSound(new Cat());
		printSound(new Dog());
	}

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
}
