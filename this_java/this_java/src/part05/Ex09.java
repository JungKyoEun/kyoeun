package part05;

import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
		boolean run =true;
		int studentNum =0;
		int[] scores =null;
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1){
				System.out.print("�л���> ");
				studentNum=sc.nextInt();
				scores =new int[studentNum];
			}else if(selectNo==2){
				for(int i=0; i<studentNum;i++){
					System.out.print("scores["+i+"]>");
					scores[i]=sc.nextInt();
					System.out.println();
				}
			}else if(selectNo==3){
				for(int i=0; i<scores.length;i++){
					System.out.printf("scores[%d]:%d\n",i,scores[i]);
				}
			}else if(selectNo==4){
				int max=0; int sum=0;
				for(int i=0; i<scores.length;i++){
					sum+=scores[i];
					if(scores[i]>max)
						max=scores[i];
				}
				System.out.println("�ְ� ����:"+max);
				System.out.println("��� ����:"+sum/(double)studentNum);
				
			}else if(selectNo==5){
				run=false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
