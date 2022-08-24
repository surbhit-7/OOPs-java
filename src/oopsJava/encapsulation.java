package oopsJava;

// Encapsulation Implementation :-
class BankAccount
{
	private String owner;
	private double balance;
	protected BankName bankname;
	
	BankAccount(String owner, double balance){
		this.balance = balance;
		this.owner = owner;
		this.bankname = BankName.AXISBANK;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double money) {
		this.balance = this.balance + money;
	}
	
	public void withdraw(double money) {
		this.balance = this.balance - money;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount("Surbhit",5000);
		System.out.println(b.getBalance());
		b.deposit(3123);
		System.out.println(b.getBalance());
		b.withdraw(3133);
		System.out.println(b.getBalance());
		System.out.println(b.bankname);
		
	}

}
