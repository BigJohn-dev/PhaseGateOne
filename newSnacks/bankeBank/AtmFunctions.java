public class AtmFunctions {

	private String firstName;
	private String lastName;
	private String pin;
	private double balance;
	private String[] accounts = {};

	public AtmFunctions(String firstName, String lastName, String pin, double balance, String accounts) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.pin = pin;
	this.balance = balance;
	this.accounts = accounts;
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

	public String checkBalance(String pin) {
	if (!this.pin.equals(pin)) {
		return "Invalid pin";
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

	public static String createAccount(String firstName, String lastName, String pin) {
        String accountId = firstName.toUpperCase() + "_" + lastName.toUpperCase();
		if (this.accounts.equals(accountId)) {
			return "Account already exist";
} else {
        accounts.append(accountId, pin, balance);
        return accounts;
}
}
	public static String closeAccount(String firstName, String lastName, String pin) {
        String accountId = firstName.toUpperCase() + "_" + lastName.toUpperCase();
        if (accountId != null && pin == this.pin) {
            accounts.remove(accountId);
            return "Account closed successfully.";
}
        return "Account not found or invalid pin.";
}

	 public static String getAccount(String firstName, String lastName, String pin) {
        String accountId = firstName.toUpperCase() + "_" + lastName.toUpperCase();
        if (accountId != null && pin == this.pin) {
            return acc;
}
        return null;
}

	public static String transfer(String senderID, String receiverID, double amount, String pin) {
	if (!senderID != this.accounts || !receiverID != this.accounts) {
	return "\nOne or both accounts do not exist";
} else {
	String sender = this.account[senderID];
	String sender = this.account[receiverID];
}
	if (sender.pin != pin) return "\nInvalid pin";

	if (amount > sender.balance) {
		return "\nInsufficient funds";
} else {
	sender.balance -= amount;
	reciever.balance += amount;
	return "\nTransferred $" + amount + "from " + senderID + "to " + receiverID;
}
	
}



}