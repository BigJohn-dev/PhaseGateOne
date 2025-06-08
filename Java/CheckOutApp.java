import java.util.Scanner;

public class CheckOutApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("What is the customer's Name?");
	String customerName = input.nextLine();

	String choice = "yes";
	do {
	System.out.print("What did the customer buy? ");
	String itemBought1 = input.next();
	
	System.out.print("How much per unit? ");
	double pricePerUnit = input.nextDouble();

	System.out.println("Add more items?");
	choice = input.next();
}
	while (!choice.equalsIgnoreCase("no"));

	System.out.println("What is your Name?");
	String cashierName = input.next();

	System.out.println("How much discount will customer get?");
	double discount = input.nextDouble();

	if (discount < 0 || discount > 100) {
	System.out.println("Discount must be between 0 and 100!");
	continue;
} else {
	System.out.println("How much did the customer give to you?");
	double payment = input.nextDouble();
}
}

}

