package part06;

import java.util.*;

public class Ex20Example {
	private static Ex20[] accountArray = new Ex20[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run =true;
		while(run){
			System.out.println("------------------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5����");
			System.out.println("------------------------------------------");
			System.out.print("����>");
			
			int selectNo=sc.nextInt();
			
			if(selectNo==1){
				createAccount();
			}else if(selectNo==2){
				accountList();
			}else if(selectNo==3){
				deposit();
			}else if(selectNo==4){
				withdraw();
			}else if(selectNo==5){
				run=false;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		System.out.print("���¹�ȣ");
		String ano = sc.next();
		System.out.print("������");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ�");
		int balance = sc.nextInt();
		
	}
	private static void accountList() {
		
	}
	
	private static void deposit() {
		
	}

	private static void withdraw() {
		
	}


}
