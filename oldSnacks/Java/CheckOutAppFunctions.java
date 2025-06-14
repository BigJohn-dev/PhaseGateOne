import java.util.Date;

public class CheckOutAppFunctions {

	public void storeDetails() {
	System.out.println("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03938373320");
	Date dateNow = new Date();
	System.out.println(dateNow);
}
	public static String getStoreDetails() {
	return "\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03938373320\n" + new Date();
}
	public static void printCustomerInvoice(String[] items, int[] quantities, double[] prices, int itemNumber, String CustomerName, String cashierName, double discount) {
	System.out.println("Cashier: " + cashierName);
	System.out.println("Customer Name: " + CustomerName);
	
	for (int line = 1; line <= 60; line++) {
	System.out.print("=");
}
        System.out.println("\n\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
        for (int dash = 1; dash <= 60; dash++) {
	System.out.print("-");
}
	double subTotal = 0;
	for (int count = 0; count < itemNumber; count++) {
		double total = prices[count] * quantities[count];
		subTotal += total;
        System.out.println("\n\t\t" + items[count] + "\t" + quantities[count] + "\t\t" + prices[count] + "\t" + total);
}
        for (int dash2 = 1; dash2 <= 60; dash2++) {
            System.out.print("-");
}
        double discountAmount = subTotal * (discount / 100);
	double VAT = subTotal * 0.175;
	double billTotal = subTotal + VAT - discountAmount;

        System.out.println("\n\t\t\tSub Total: \t\t" + subTotal);
        System.out.println("\t\t\tDiscount: \t\t" + discountAmount);
        System.out.printf("\t\t\tVAT @ 17.50%%:\t\t%.2f\n", VAT);

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
        System.out.println("\n\t\t\tBill Total: \t\t" + billTotal);

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
        System.out.println("\nTHIS IS NOT A RECEIPT KINDLY PAY " + billTotal);

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
}

    public static void printCustomerReceipt(String[] items, int[] quantities, double[] prices, int itemNumber, String CustomerName, String cashierName, double discount, double payment) {
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + CustomerName);

        for (int line = 1; line <= 60; line++) {
            System.out.print("=");
}
        System.out.println("\n\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
        for (int dash = 1; dash <= 60; dash++) {
            System.out.print("-");
}
       double subTotal = 0;
	for (int count = 0; count < itemNumber; count++) {
		double total = prices[count] * quantities[count];
		subTotal += total;
        System.out.println("\n\t\t" + items[count] + "\t" + quantities[count] + "\t\t" + prices[count] + "\t" + total);
}
        for (int dash2 = 1; dash2 <= 60; dash2++) {
            System.out.print("-");
}
	double discountAmount = subTotal * (discount / 100);
	double VAT = subTotal * 0.175;
	double billTotal = subTotal + VAT - discountAmount;
        double balance = payment - billTotal;

        System.out.println("\n\t\t\tSub Total: \t\t" + subTotal);
        System.out.println("\t\t\tDiscount: \t\t" + discountAmount);
        System.out.printf("\t\t\tVAT @ 17.50%%:\t\t%.2f\n", VAT);

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
        System.out.println("\n\t\t\tBill Total: \t\t" + billTotal);
        System.out.println("\t\t\tAmount paid: \t\t" + payment);
        System.out.println("\t\t\tBalance: \t\t" + balance);
	if (balance < 0) {
	System.out.println("\n\t" + CustomerName + ", please pay your balance of N" + Math.abs(balance));
}
        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
        System.out.println("\n\t\tTHANK YOU FOR YOUR PATRONAGE");

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
}
}