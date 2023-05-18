package Week12;

public class Exam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
