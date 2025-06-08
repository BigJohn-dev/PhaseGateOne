import java.util.Scanner;

public class CheckOutApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("What is the customer's Name?");
	String customerName = input.nextLine();

	String itemBought;
	double pricePerUnit;
	String cashierName;
	double discount;
	double payment;
	int quantities = 0;
	String choice = "yes";

	do {
	System.out.print("What did the customer buy? ");
	itemBought = input.next();
	
	System.out.print("How much per unit? ");
	pricePerUnit = input.nextDouble();
	if (pricePerUnit <= 0) {
	System.out.println("Enter a valid price");
	continue;
}
	System.out.println("Add more items?");
	choice = input.next();
	if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
	System.out.println("Please enter yes or no.");

} else { 
	quantities += 1; 
}
}
	while (!choice.equalsIgnoreCase("no"));

	System.out.println("What is your Name?");
	cashierName = input.next();

	System.out.println("How much discount will customer get?");
	discount = input.nextDouble();

	if (discount < 0 || discount > 100) {
	System.out.println("Discount must be between 0 and 100!");
}

	System.out.println(CheckOutAppFunctions.getStoreDetails());
	CheckOutAppFunctions.printCustomerInvoice(itemBought, quantities, pricePerUnit, customerName, cashierName, discount);

	System.out.println("How much did the customer give to you?");
	payment = input.nextDouble();
	if (payment <= 0) {
	System.out.println("Invalid or negative payment!");
}

	CheckOutAppFunctions.printCustomerReciept(itemBought, quantities, pricePerUnit, customerName, cashierName, discount, payment);

}
}
