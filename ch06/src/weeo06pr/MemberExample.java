package weeo06pr;

public class MemberExample {

	public static void main(String[] args) {
		Member p1 = new Member();
		boolean result = p1.login("유동기", "20182570");
		if(result) {
			System.out.println("유동기님이 로그인 되었습니다.");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
