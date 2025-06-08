import java.util.Date;

public class CheckOutAppFunctions {

	public void storeDetails() {

	System.out.println("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03938373320");

	Date dateNow = new Date();
	System.out.println(dateNow);
}

	public static String getStoreDetails(){
	return storeDetails();
}

	public static printCustomerInvoice(String items, String quantities, double prices, String CustomerName, String cashierName, double discount) {

	System.out.println("Cashier: " + cashierName);
	System.out.println("Customer Name: " + CustomerName);

	for(int line = 1; line <= 60; line++){
	System.out.print("=");
}
	System.out.println("\nITEM\t\tQUANTITY\tPRICE\tTOTAL(NGN)");
	for(int dash = 1; dash <= 60; dash++) {
	System.out.print("-");
}
	double total = 0.0;
	for(int count = 0; count < len(items); count++) {
	double totalItems = prices(count) * quantities(count);
	total += totalItems;
	System.out.println(items(count) + "\t\t" + quantities(count) + "\t" + price(count) + "\t" + totalItems);
}
	for(int dash2 = 1; dash2 <= 60; dash2++) {
	System.out.print("-");
}
	double discountAmount = total * (discount / 100);
	double finalAmount = total - discountAmount;
	double VAT = total * (17.50 / 100);
	double billTotal = VAT + total - discountAmount;

	System.out.println("Sub Total: " + total);
	System.out.println("Discount: " + discountAmount);
	System.out.println("VAT @ 17.50%: " + VAT);

	for(int line2 = 1; line2 <= 60; line2++){
	System.out.print("=");
}
	System.out.println("Bill Total: " + billTotal);

	for(int line2 = 1; line2 <= 60; line2++){
	System.out.print("=");
}
	System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);

	for(int line2 = 1; line2 <= 60; line2++){
	System.out.print("=");
}
}

	public static printCustomerInvoice(String items, String quantities, double prices, String CustomerName, String cashierName, double discount, double payment) {

	System.out.println("Cashier: " + cashierName);
	System.out.println("Customer Name: " + CustomerName);

	for(int line = 1; line <= 60; line++){
	System.out.print("=");
}
	System.out.println("\nITEM\t\tQUANTITY\tPRICE\tTOTAL(NGN)");
	for(int dash = 1; dash <= 60; dash++) {
	System.out.print("-");
}
	double total = 0.0;
	for(int count = 0; count < len(items); count++) {
	double totalItems = prices(count) * quantities(count);
	total += totalItems;
	System.out.println(items(count) + "\t\t" + quantities(count) + "\t" + price(count) + "\t" + totalItems);
}
	for(int dash2 = 1; dash2 <= 60; dash2++) {
	System.out.print("-");
}
	double discountAmount = total * (discount / 100);
	double finalAmount = total - discountAmount;
	double VAT = total * (17.50 / 100);
	double billTotal = VAT + total - discountAmount;
	double balance = payment - billTotal;

	System.out.println("Sub Total: " + total);
	System.out.println("Discount: " + discountAmount);
	System.out.println("VAT @ 17.50%: " + VAT);

	for(int line2 = 1; line2 <= 60; line2++){
	System.out.print("=");
}
	System.out.println("Bill Total: " + billTotal);
	System.out.println("Amount paid: " + payment);
	System.out.println("Balance: " + balance);

	for(int line2 = 1; line2 <= 60; line2++){
	System.out.print("=");
}
	System.out.println("THANK YOU FOR YOUR PATRONAGE");

	for(int line2 = 1; line2 <= 60; line2++){
	System.out.print("=");
}
}































}