import java.util.Scanner;

public class AtmMain {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("\nWELCOME TO BANKe BANK");
	System.out.println("...transactions made easy.");

	while (true) {
	String atmMenu = """
========================
	ATM Menu
...select an option
1. Create an account
2. Close account
3. Deposit money
4. Withdraw money
5. Check account balance
6. Transfer 
7. Change Pin
0. Exit
========================
		""";
		System.out.println(atmMenu);
		int choice = input.nextInt();

		String firstName, lastName, pin, validCheck;
		double amount;
		switch (choice) {
		case 1:
			System.out.println("\nCREATE NEW ACCOUNT");
			System.out.print("\nEnter first name: ");
			firstName = input.next();
			
			System.out.print("Enter last name: ");
			lastName = input.next();

			System.out.print("Create account pin: ");
			pin = input.next();
			System.out.println(AtmFunctions.createAccount(firstName, lastName, pin));
			break;
		case 2:
			System.out.println("\nCLOSE ACCOUNT");
			System.out.print("\nEnter first name: ");
			firstName = input.next();

			System.out.print("Enter last name: ");
			lastName = input.next();

			System.out.print("Enter account pin: ");
			pin = input.next();
			System.out.println(AtmFunctions.closeAccount(firstName, lastName, pin));
			break;
		case 3:
			System.out.println("DEPOSIT MONEY");
			System.out.print("\nEnter first name: ");
			firstName = input.next();
			
			System.out.print("Enter last name: ");
			lastName = input.next();

			System.out.print("Enter account pin: ");
			pin = input.next();
			validCheck = AtmFunctions.getAccount(firstName, lastName, pin);
			if (validCheck) {
				System.out.print("Enter amout to deposit: ");
				amount = input.nextDouble();
				System.out.println(AtmFunctions.deposit(amount));
} else {
			System.out.println("Invalid account name or pin");
}
			break;

		case 4:
			System.out.println("WITHDRAW MONEY");
			System.out.print("\nEnter first name: ");
			firstName = input.next();
			
			System.out.print("Enter last name: ");
			lastName = input.next();

			System.out.print("Enter account pin: ");
			pin = input.next();
			validCheck = AtmFunctions.getAccount(firstName, lastName, pin);
			if (validCheck) {
				System.out.print("Enter amout to withdraw: ");
				amount = input.nextDouble();
				System.out.println(AtmFunctions.withdraw(amount, pin));
} else {
			System.out.println("Invalid account name or pin");
}
			break;

		case 5:
			System.out.println("CHECK ACCOUNT BALANCE");
			System.out.print("\nEnter first name: ");
			firstName = input.next();
			
			System.out.print("Enter last name: ");
			lastName = input.next();

			System.out.print("Enter account pin: ");
			pin = input.next();
			validCheck = AtmFunctions.getAccount(firstName, lastName, pin);
			if (validCheck) {
				System.out.println(AtmFunctions.checkBalance(pin));
} else {
			System.out.println("Invalid account name or pin");
}
			break;

		case 6:
			System.out.println("TRANSFER MONEY");

			System.out.print("\nEnter sender's first name: ");
			String senderFirstName = input.next().toUpperCase();
			
			System.out.print("Enter sender's last name: ");
			String senderLasttName = input.next().toUpperCase();

			String senderID = senderFirstName + " " + senderLasttName;
		
			System.out.print("\nEnter receiver's first name: ");
			String receiverFirstName = input.next().toUpperCase();
			
			System.out.print("Enter receiver's last name: ");
			String receiverLasttName = input.next().toUpperCase();

			String receiverID = receiverFirstName + " " + receiverLasttName;

			System.out.print("Enter sender's pin: ");
			pin = input.next();

			System.out.print("Enter amount to transfer: ");
			amount = input.next();
			System.out.println(AtmFunctions.transfer(senderID, receiverID, amount, pin));	
			break;

		case 7:
			System.out.println("\nCHANGE PIN");
			System.out.print("\nEnter first name: ");
			firstName = input.next();
			
			System.out.print("Enter last name: ");
			lastName = input.next();

			System.out.print("Enter old pin: ");
			String oldPin = input.next();

			validCheck = AtmFunctions.getAccount(firstName, lastName, oldPin);
			if (validCheck) {
				System.out.print("Enter new pin");
				String newPin = input.next();
				System.out.println(AtmFunctions.changePin(newPin));
} else {
			System.out.println("Invalid account name or pin");
}
			break;

		default:
			System.out.println("\nExiting ATM terminal.");
			System.out.println("...thank you for banking with us @Banke bank");
}
}
}
}