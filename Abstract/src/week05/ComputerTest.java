package week05;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer();  // 추상클래스
		Computer c2 = new DeskTop();  // 일반클래스
		Computer c3 = new NoteBook(); // 추상클래스
		Computer c4 = new MyNoteBook(); // 일반클래스

	}

}
