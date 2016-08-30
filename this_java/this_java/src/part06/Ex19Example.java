package part06;

import java.security.AccessControlContext;

public class Ex19Example {
	public static void main(String[] args) {
		Ex19 account = new Ex19();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
	}
}
