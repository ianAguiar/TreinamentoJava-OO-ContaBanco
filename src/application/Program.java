package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Deseja fazer um deposito (y/n)?");
		char responseDeposite = sc.next().charAt(0);
		
		
		if (responseDeposite == 'y' ) {
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			account.deposit(depositValue);
			System.out.println("Update account data: ");
			System.out.println(account);
		} else {
			System.out.println("Deposit was canceled");
			System.out.println("Account data: ");
			System.out.println(account);
		}
		
		System.out.println();
		System.out.print("Deseja efetuar um saque (y/n)?");
		char responseWithDraw = sc.next().charAt(0);
		
		if (responseWithDraw == 'y' ) {
			System.out.print("Enter a withDraw value: ");
			double withdrawValue = sc.nextDouble();
			account.withdraw(withdrawValue);
			System.out.println("Update account data: ");
			System.out.println(account);
		} else {
			System.out.println("WithDraw was canceled");
			System.out.println("Account data: ");
			System.out.println(account);
		}


		sc.close();
	}

}
