package part06;

public class Ex15 {
	public static void main(String[] args) {
		 Ex15Service memberService = new  Ex15Service();
		 boolean result = memberService.login("hong","12345");
		 
		 if(result){
			 System.out.println("�α��� �Ǿ����ϴ�");
			 memberService.logout("hong");
		 }else{
			 System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		 }
	}
}
