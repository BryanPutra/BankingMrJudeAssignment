import java.util.ArrayList;

public class Driver {
	public static void main(String [] args) {
		
//		Account a1 = new Account(200000);
//		System.out.println(a1.deposit(200000));
//		System.out.println(a1.withdraw(500000));
//		System.out.println(a1.withdraw(100000));
//		System.out.println(a1.getBalance());
//		Customer c1 = new Customer("Bryan", "Putra");
//		c1.setAccount(a1);
//		System.out.println(c1.getAccount());
//		System.out.println(c1.getAccount().getBalance());
//		Bank b1 = new Bank("test");
//		System.out.println(b1.getBankName());
//		b1.addCustomer("Bryan", "Putra");
//		System.out.println(b1.getCustomer(0));
//		System.out.println(testbank.getCustomer(0));
//		System.out.println(testbank.getNumberOfCustomers());
		
		ArrayList <Customer> customers = new ArrayList <Customer> ();
		
		Bank b1 = new Bank("BANK");
		b1.getBankName();
		Account a1 = new Account(1000000);
		Account a2 = new Account(500000);
		Account a3 = new Account(300000);
		a1.withdraw(2000000);
		a1.withdraw(500000);
		a1.deposit(1000000);
		a2.withdraw(10000000);
		a2.withdraw(200000);
		a2.deposit(110000);
		a3.withdraw(400000);
		a3.withdraw(100000);
		a3.deposit(300000);
		b1.addCustomer(customers, "Bryan", "Putra");
		b1.getCustomer(customers, 0).setAccount(a1);
		b1.addCustomer(customers, "Johansen", "Junias");
		b1.getCustomer(customers, 1).setAccount(a2);
		b1.addCustomer(customers, "Henry", "Ford");
		b1.getCustomer(customers, 2).setAccount(a3);
		System.out.println(b1.getCustomer(customers, 0).getFirstName() + " " + b1.getCustomer(customers, 0).getLastName() + " " + b1.getCustomer(customers, 0).getAccount().getBalance());
		System.out.println(b1.getCustomer(customers, 1).getFirstName() + " " + b1.getCustomer(customers, 1).getLastName() + " " + b1.getCustomer(customers, 1).getAccount().getBalance());
		System.out.println(b1.getCustomer(customers, 0).toString());
		System.out.println(b1.getNumberOfCustomers(customers));
		System.out.println(b1.toString(customers));
	}
}
