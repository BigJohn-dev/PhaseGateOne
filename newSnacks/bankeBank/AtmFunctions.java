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
		return "Invalid deposit amount";
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
}

	public String checkBalance(String inputPin) {
	if (!this.pin.equals(inputPin)) {
		return "Invalid PIN";
}
	return "Your balance is $" + String.format("%.2f", this.balance);
}

	public String changePin(String oldPin, String newPin) {
	if (!this.pin.equals(oldPin)) {
		return "Old pin incorrect";
}
	this.pin = newPin;
	return "PIN changed successfully";
}

	public static AtmFunctions createAccount(String firstName, String lastName, String pin) {
        String accountId = firstName + "_" + lastName;
        AtmFunctions account = new AtmFunctions(firstName, lastName, pin, 0.0);
        accounts.put(accountId, account);
        return account;
}
	public static String closeAccount(String firstName, String lastName, String pin) {
        String accountId = firstName + "_" + lastName;
        AtmFunctions acc = accounts.get(accountId);
        if (acc != null && acc.validatePin(pin)) {
            accounts.remove(accountId);
            return "Account closed successfully.";
}
        return "Account not found or invalid pin.";
}
	 public static AtmFunctions getAccount(String firstName, String lastName, String pin) {
        String accountId = firstName + lastName;
        AtmFunctions acc = accounts.get(accountId);
        if (acc != null && acc.validatePin(pin)) {
            return acc;
}
        return null;
}

}