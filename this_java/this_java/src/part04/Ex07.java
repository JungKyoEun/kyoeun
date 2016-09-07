package part04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		boolean run = true;


		Scanner sc = new Scanner(System.in);
		int money = 0;
		int sum =0;
		

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();

			switch (select) {
			case 1: 
				System.out.print("예금액>");
				money = sc.nextInt();
				sum += money;
				break;
			
			case 2: 
				System.out.print("출금액>");
				money = sc.nextInt();
				sum -= money;
				
				break;
			
			case 3: 
				System.out.printf("잔고>%d", sum);
				System.out.println();
				break;
			
			case 4: 
				run=false;
				break;
			default:
				System.out.println("다시입력해주세요");
				break;
			}
			
		}

		System.out.println("프로그램 종료");
	}

}
