package p0427_1;

public class Member  {
	String name;
	String id;
	String password;
	int age;

	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public void print() {
		System.out.println(this.name + " " + this.id + " " + this.password + " " + this.age);
	}
}