
public class Account {

	private String name,accNo;
	private double balance;
	Account(String name,String accNo,double balance){
		this.name = name;
		this.accNo = accNo;
		this.balance  = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
	}
	
	public String getAccountInfo() {
		return "Name "+name+" | Account No. "+accNo+" | Balance : "+balance;
		
	}
	
}
