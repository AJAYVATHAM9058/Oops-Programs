/* Write a Java program to create a class called "Bank" with a
 *  collection of accounts and methods to add and remove accounts,
 *   and to deposit and withdraw money. Also define a class called "Account"
 *    to maintain account details of a particular customer. */


import java.util.ArrayList;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account("Ajay","62478478244",5000);
		Account acc2 = new Account("Anil","62394753497",6000);
		Account acc3 = new Account("Sai","63464465442",4202);
		
		Bank bank = new Bank();
		
		bank.addAccount(acc1);
		bank.addAccount(acc2);
		bank.addAccount(acc3);
		
		ArrayList<Account> accounts = bank.getAccounts();
		
		for(Account acc : accounts) {
			System.out.println(acc.getAccountInfo());
		}
		
		
		System.out.println("depositing 1000 to account 1");
		acc1.deposit(1000);
		System.out.println(acc1.getAccountInfo());
		
		System.out.println("No transaction in Account 2");
		System.out.println(acc2.getAccountInfo());
		
		System.out.println("withdrawing 523 from account 3");
		acc3.withdraw(523);
		System.out.println(acc3.getAccountInfo());
		
		
	}
}
