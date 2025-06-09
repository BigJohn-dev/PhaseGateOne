import java.util.Scanner;

public class CheckOutApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("\nWELCOME TO SEMICOLON STORE..");

	System.out.println("\nWhat is the customer's Name?");
	String customerName = input.nextLine();

	String[] itemBought = new String[10];
	double[] pricePerUnit = new double[10];
	int[] quantities = new int[10];
	int itemNumber = 0;

	String choice = "yes";

	do {
		System.out.print("\nWhat did the customer buy? ");
		itemBought[itemNumber] = input.next();
    
		System.out.print("\nHow much per unit? ");
		double price = input.nextDouble();
		if (price <= 0) {
		System.out.println("Enter a valid price");
		continue;
}	
		pricePerUnit[itemNumber] = price;
		
		System.out.print("\nHow many unit? ");
		int quantity = input.nextInt();
		if (quantity <= 0) {
		System.out.println("Invalid number of units!");
		continue;
}
		quantities[itemNumber] = quantity;
		
		itemNumber++;
		
		System.out.println("Add more items? (yes or no)");
		choice = input.next();
		if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
		System.out.println("Please enter yes or no.");
} 
} 	while (!choice.equalsIgnoreCase("no"));

		System.out.println("Enter cashier's Name?");
		String cashierName = input.next();

		System.out.println("How much discount will customer get?");
		double discount = input.nextDouble();
		if (discount < 0 || discount > 100) {
		System.out.println("Discount must be between 0 and 100!");
}
		System.out.println(CheckOutAppFunctions.getStoreDetails());
		CheckOutAppFunctions.printCustomerInvoice(itemBought, quantities, pricePerUnit, itemNumber, customerName, cashierName, discount);

		System.out.println("\n\nHow much did the customer give to you?");
		double payment = input.nextDouble();
		if (payment <= 0) {
		System.out.println("Invalid or negative payment!");
}
		System.out.println(CheckOutAppFunctions.getStoreDetails());
		CheckOutAppFunctions.printCustomerReceipt(itemBought, quantities, pricePerUnit, itemNumber, customerName, cashierName, discount, payment);
}
}