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
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			int select = sc.nextInt();

			switch (select) {
			case 1: 
				System.out.print("���ݾ�>");
				money = sc.nextInt();
				sum += money;
				break;
			
			case 2: 
				System.out.print("��ݾ�>");
				money = sc.nextInt();
				sum -= money;
				
				break;
			
			case 3: 
				System.out.printf("�ܰ�>%d", sum);
				System.out.println();
				break;
			
			case 4: 
				run=false;
				break;
			default:
				System.out.println("�ٽ��Է����ּ���");
				break;
			}
			
		}

		System.out.println("���α׷� ����");
	}

}
