from datetime import datetime

class check_out_app:

	def get_store_details():
		return "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03938373320\n" + str(datetime.now())

	def printCustomerInvoice(items, quantities, prices, CustomerName, cashierName, discount):

		print("Cashier: " + cashierName)
		print("Customer Name: " + CustomerName)

		for line in range (1, 61):
			print("=", end = " ")

		print("\nITEM\t\tQUANTITY\tPRICE\tTOTAL(NGN)")
		for dash in range (1, 61):
			print("-", end = " ")

		totalItems = prices * quantities

		print(f"\n{items}\t\t{quantities}\t{price}\t{totalItems}")

		for dash2 in range (1, 61):
			print("-", end = " ")

		discountAmount = total * (discount / 100)
		finalAmount = total - discountAmount
		VAT = total * (17.50 / 100)
		billTotal = VAT + total - discountAmount

		print("Sub Total: " + total)
		print("Discount: " + discountAmount)
		print("VAT @ 17.50%: " + VAT)

		for line2 in range (1, 61):
			print("=", end = " ")

		print("Bill Total: " + billTotal)

		for line3 in range (1, 61):
			print("=", end = " ")

		print("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal)

		for line4 in range (1, 61):
			print("=", end = " ")

	def printCustomerInvoice(items, quantities, prices, CustomerName, cashierName, discount, payment):
		print("Cashier: " + cashierName)
		print("Customer Name: " + CustomerName)

		for line in range (1, 61):
			print("=", end = " ")

		print("\nITEM\t\tQUANTITY\tPRICE\tTOTAL(NGN)")
	
		for dash in range (1, 61):
			print("-", end = " ")

		totalItems = prices * quantities
	
		print(f"\n{items}\t\t{quantities}\t{price}\t{totalItems}")

		for dash2 in range (1, 61):
			print("-", end = " ")

		discountAmount = total * (discount / 100)
		finalAmount = total - discountAmount
		VAT = total * (17.50 / 100)
		billTotal = VAT + total - discountAmount
		balance = payment - billTotal

		print("Sub Total: " + total)
		print("Discount: " + discountAmount)
		print("VAT @ 17.50%: " + VAT)

		for line2 in range (1, 61):
			print("=", end = " ")

		print("Bill Total: " + billTotal)
		print("Amount paid: " + payment)
		print("Balance: " + balance)

		for line3 in range (1, 61):
			print("=", end = " ")
		pint("THANK YOU FOR YOUR PATRONAGE")

		for line4 in range (1, 61):
			print("=", end = " ")

def main():

	while True:
		name = input("What is the customer's Name? ")
		itemBought
		icePerUnit
cashierName;
discount;
payment;
quantities = 0;


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
	System.out.println("Please enter 'yes' or 'no'.");
} else { quantities += 1; }
}
	while (!choice.equalsIgnoreCase("no"));

	System.out.println("What is your Name?");
	cashierName = input.next();

	System.out.println("How much discount will customer get?");
	discount = input.nextDouble();

	if (discount < 0 || discount > 100) {
	System.out.println("Discount must be between 0 and 100!");
	continue;
} else {
	System.out.println("How much did the customer give to you?");
	payment = input.nextDouble();
	if (payment <= 0) {
	System.out.println("Invalid or negative payment!");
}
}
}
	System.out.println(CheckOutAppFunctions.getStoreDetails());
	CheckOutAppFunctions.printCustomerInvoice(itemBought, quantities, pricePerUnit, customerName, cashierName, discount);

}
}
