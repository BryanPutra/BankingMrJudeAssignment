
public class Account {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean deposit(double amount) {
		if(amount <= 0) {
			return false;
		}
		else {
			balance += amount;
			return true;
		}
	}
	public boolean withdraw(double amount) {
		if(amount > balance) {
			return false;
		}
		else {
			balance -= amount;
			return true;
		}
	}
}
