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

		switch (choice) {
		case 1: {
			System.out.println("\nCreate new account");
			System.out.print("Enter first name: ");
			String firstName = input.next().toUpperCase();
			System.out.print("Enter last name: ");
			String lastName = input.next().toUpperCase();
			System.out.print("Set account pin: ");
			String pin = input.next();

			AtmFunctions account = AtmFunctions.createAccount(firstName, lastName, pin);
			//System.out.println("\nAccount successfully created for " + account(firstName, lastName, pin));
			break;
}
		case 2: {
			System.out.println("\nClose account");
			System.out.print("Enter first name: ");
			String firstName = input.next().toUpperCase();
			System.out.print("Enter last name: ");
			String lastName = input.next().toUpperCase();
			System.out.print("Set account pin: ");
			String pin = input.next();
			System.out.println(AtmFunctions.closeAccount(firstName, lastName, pin));
			break;
}

		case 3: {
			System.out.println("\nDeposit money");
			System.out.print("Enter first name: ");
			String firstName = input.next().toUpperCase();
			System.out.print("Enter last name: ");
			String lastName = input.next().toUpperCase();
			System.out.print("Set account pin: ");
			String pin = input.next();
			AtmFunctions validCheck = AtmFunctions.get_account(firstName, lastName, pin);
			if (validCheck != null){
				System.out.print("Enter amount: ");
                        	double amount = input.nextDouble();
				System.out.println(validCheck.deposit(amount));
} else {
				System.out.println("Invalid amount. Please enter a number.");
}
				break;
}

		case 4: {
			System.out.println("\nWithdraw money");
			System.out.print("Enter first name: ");
			String firstName = input.next().toUpperCase();
			System.out.print("Enter last name: ");
			String lastName = input.next().toUpperCase();
			System.out.print("Set account pin: ");
			String pin = input.next();
			AtmFunctions validCheck = AtmFunctions.get_account(firstName, lastName, pin);
			if (validCheck != null){
				System.out.print("Enter amount: ");
                        	double amount = input.nextDouble();
				System.out.println(validCheck.withdraw(amount, pin));
} else {
				System.out.println("Invalid amount. Please enter a number.");
}
				break;
}

		case 5: {
			System.out.println("\nCheck account balance");
			System.out.print("Enter first name: ");
			String firstName = input.next().toUpperCase();
			System.out.print("Enter last name: ");
			String lastName = input.next().toUpperCase();
			System.out.print("Set account pin: ");
			String pin = input.next();
			AtmFunctions validCheck = AtmFunctions.get_account(firstName, lastName, pin);
			if (validCheck != null){
				System.out.print("Enter amount: ");
                        	double amount = input.nextDouble();
				System.out.println(validCheck.checkBalance());
} else {
				System.out.println("Invalid account or pin");
}
				break;
}

		case 6: {
			System.out.println("\nTransfer money");
			System.out.print("Enter sender's first name: ");
			String senderFirstName = input.next().toUpperCase();
			System.out.print("Enter sender's last name: ");
			String senderLastName = input.next().toUpperCase();
			System.out.print("Enter receiver's first name: ");
			String receiverFirstName = input.next().toUpperCase();
			System.out.print("Enter reciever's last name: ");
			String recieverLastName = input.next().toUpperCase();
			System.out.print("Set account pin: ");
			String pin = input.next();
			AtmFunctions validCheck = AtmFunctions.get_account(firstName, lastName, pin);
			if (validCheck != null){
				System.out.print("Enter amount: ");
                        	double amount = input.nextDouble();
				System.out.println(validCheck.transfer(amount));
} else {
				System.out.println("Invalid amount. Please enter a number.");
}
				break;
}

		case 7: {
			System.out.println("\nChange account pin");
			System.out.print("Enter first name: ");
			String firstName = input.next().toUpperCase();
			System.out.print("Enter last name: ");
			String lastName = input.next().toUpperCase();
			System.out.print("Enter current account pin: ");
			String currentPin = input.next();
			valid_check = atm.get_account(firstName, lastName, pin);
				if (valid_check != null) {
				System.out.print("Enter new pin: ");
				String newPin = input.next();
				System.out.println(valid_check.changePin(currentPin, newPin));
} else {
				print("Invalid account or pin.");
}
				break;
}

		case 0:
			System.out.println("\nExiting ATM terminal.");
			System.out.println("...thank you for banking with us @Banke bank");
			break;

		default:
			System.out.println("Invalid option. Try again");
}

}
}
}