package weeo06pr;

public class Member {
	
	public boolean login(String id, String password) {

		if(id.equals("유동기") && password.equals("20182570")){
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id+ "님이 로그아웃 되었습니다.");
	}
}


