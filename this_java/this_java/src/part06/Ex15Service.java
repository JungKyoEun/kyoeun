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
			System.out.println("�α׾ƿ� �Ǽ̽��ϴ�");
		}else{
			System.out.println("�ٽ� �Է����ּ���");
		}
	}

}
