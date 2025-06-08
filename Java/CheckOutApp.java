import java.util.Scanner;

public class CheckOutApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("\nWELCOME TO SEMICOLON STORE..");

	System.out.println("\nWhat is the customer's Name?");
	String customerName = input.nextLine();

	String itemBought = " ";
	double pricePerUnit = 0.0;
	String cashierName = " ";
	double discount = 0.0;
	double payment = 0.0; 
	int quantities = 0;
	String choice = "yes";

	do {
		System.out.print("\nWhat did the customer buy? ");
		itemBought = input.next();
    
		System.out.print("\nHow much per unit? ");
		pricePerUnit = input.nextDouble();

		if (pricePerUnit <= 0) {
		System.out.println("Enter a valid price");
		continue;
}
		System.out.print("\nHow many unit? ");
		quantities = input.nextInt();
		if (quantities <= 0) {
		System.out.println("Invalid number of units!");
		continue;
}
		
		System.out.println("Add more items? (yes or no)");
		choice = input.next();
		if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
		System.out.println("Please enter yes or no.");
} 
} 	while (!choice.equalsIgnoreCase("no"));

		System.out.println("What is your Name?");
		cashierName = input.next();

		System.out.println("How much discount will customer get?");
		discount = input.nextDouble();
		if (discount < 0 || discount > 100) {
		System.out.println("Discount must be between 0 and 100!");
}
		System.out.println(CheckOutAppFunctions.getStoreDetails());
		CheckOutAppFunctions.printCustomerInvoice(itemBought, quantities, pricePerUnit, customerName, cashierName, discount);

		System.out.println("\n\nHow much did the customer give to you?");
		payment = input.nextDouble();
		if (payment <= 0) {
		System.out.println("Invalid or negative payment!");
}
		System.out.println(CheckOutAppFunctions.getStoreDetails());
		CheckOutAppFunctions.printCustomerReceipt(itemBought, quantities, pricePerUnit, customerName, cashierName, discount, payment);
}
}