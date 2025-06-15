public class Atm_functions {

	private String firstName;
	private String lastName;
	private String pin;
	private double balance;

	public Account(String firstName, String lastName, String pin, double balance) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.pin = pin;
	this.balance = balance;
}

	public void deposit(double amount) {
	if (amount > 0) balance += amount;
}

	public void withdraw(double amount) {
	if (amount > 0 && amount < this.balance) balance -= amount;
}

	public void checkBalance() {
	
}


}