package part06;

import java.util.*;

public class Ex20Example {
	private static Ex20[] accountArray = new Ex20[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run =true;
		while(run){
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>");
			
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
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호");
		String ano = sc.next();
		System.out.print("계좌주");
		String owner = sc.next();
		System.out.print("초기입금액");
		int balance = sc.nextInt();
		
	}
	private static void accountList() {
		
	}
	
	private static void deposit() {
		
	}

	private static void withdraw() {
		
	}


}
