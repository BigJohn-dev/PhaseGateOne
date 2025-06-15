public class AtmFunctions {

	private String firstName;
	private String lastName;
	private String pin;
	private double balance;

	public AtmFunctions(String firstName, String lastName, String pin, double balance) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.pin = pin;
	this.balance = balance;
}

	public String deposit(double amount) {
	if (amount > 0) {
		balance += amount;
		return "\nDeposited $" + String.format("%.2f", amount) + ". New Balance: $" + String.format("%.2f", balance);
}
		return "Invalid deposit amount"
}

	public String withdraw(double amount, String pin) {
	if (!this.pin.equals(pin)) {
		return "Invalid pin";
}
	if (amount > 0 && amount < this.balance) {
		balance -= amount;
		return "\nWithdrew $" + String.format("%.2f", amount) + ". New Balance: $" + String.format("%.2f", balance);

} else {
		return "Insufficient funds";
}

	public String checkBalance(String inputPin) {
	if (!this.pin.equals(inputPin)) {
		return "Invalid PIN";
}
	return "Your balance is $" + String.format("%.2f", balance);
}

	public String changePin(String oldPin, String newPin) {
	if (!this.pin.equals(oldPin)) {
		return "Old pin incorrect";
}
	this.pin = newPin;
	return "PIN changed successfully";
}

	


}