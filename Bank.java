import java.util.ArrayList;

public class Bank {
	private ArrayList <Customer> customer;
	private int numberOfCustomers;
	private String bankName;
	
	public Bank(String bName){
		this.bankName = bName;
	}

	public Customer getCustomer(ArrayList <Customer> customer, int index) {
		return customer.get(index);
	}

	public void setCustomer(ArrayList <Customer> customer) {
		this.customer = customer;
	}

	public int getNumberOfCustomers(ArrayList <Customer> customer) {
		return customer.size();
	}

	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void addCustomer(ArrayList <Customer> customer, String f, String l) {
		customer.add(new Customer(f, l));
	}
	public String toString(ArrayList <Customer> customer) {
		String temp = bankName + " : " + "\n" + "Number Of Customers : " + customer.size()  + "\n";
		for(int i = 0; i < customer.size(); i++) {
			temp += customer.get(i).toString() + "\n";
		}
		return temp;
	}
	
}
