package part06;

public class Ex15Service {

	public boolean login(String id, String password) {
		boolean login = false;
		
		if(id.equals("hong")&&password.equals("12345")){
			login=true;
		}
		return login;
	}

	public void logout(String id) {
		if(id.equals("hong")){
			System.out.println("로그아웃 되셨습니다");
		}else{
			System.out.println("다시 입력해주세요");
		}
	}

}
