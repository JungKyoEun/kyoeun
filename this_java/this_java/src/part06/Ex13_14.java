package part06;

public class Ex13_14 {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Ex13_14() {}
	Ex13_14(String name,String id){
		this.name = name;
		this.id= id;
	}
	

	Ex13_14 user1 = new Ex13_14("홍길동","hong");
	Ex13_14 user2 = new Ex13_14("강자바","java");
}
