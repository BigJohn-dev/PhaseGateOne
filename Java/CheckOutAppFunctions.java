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
	public static void printCustomerInvoice(String items, int quantities, double prices, String CustomerName, String cashierName, double discount) {
	System.out.println("Cashier: " + cashierName);
	System.out.println("Customer Name: " + CustomerName);
	
	for (int line = 1; line <= 60; line++) {
	System.out.print("=");
}
        System.out.println("\n\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
        for (int dash = 1; dash <= 60; dash++) {
	System.out.print("-");
}
	double total = prices * quantities;
        System.out.println("\n\t\t" + items + "\t" + quantities + "\t\t" + prices + "\t" + total);

        for (int dash2 = 1; dash2 <= 60; dash2++) {
            System.out.print("-");
}
        double discountAmount = total * (discount / 100);
	double VAT = total * 0.175;
	double billTotal = total + VAT - discountAmount;

        System.out.println("\n\t\t\tSub Total: \t\t" + total);
        System.out.println("\t\t\tDiscount: \t\t" + discountAmount);
        System.out.println("\t\t\tVAT @ 17.50%: \t\t" + VAT);

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

    public static void printCustomerReceipt(String items, int quantities, double prices, String CustomerName, String cashierName, double discount, double payment) {
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + CustomerName);

        for (int line = 1; line <= 60; line++) {
            System.out.print("=");
}
        System.out.println("\n\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
        for (int dash = 1; dash <= 60; dash++) {
            System.out.print("-");
}
        double total = prices * quantities;
        System.out.println("\n\t\t" + items + "\t" + quantities + "\t\t" + prices + "\t" + total);

        for (int dash2 = 1; dash2 <= 60; dash2++) {
            System.out.print("-");
}
	double discountAmount = total * (discount / 100);
	double VAT = total * 0.175;
	double billTotal = total + VAT - discountAmount;
        double balance = payment - billTotal;

        System.out.println("\n\t\t\tSub Total: \t\t" + total);
        System.out.println("\t\t\tDiscount: \t\t" + discountAmount);
        System.out.println("\t\t\tVAT @ 17.50%: \t\t" + VAT);

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
        System.out.println("\n\t\t\tBill Total: \t\t" + billTotal);
        System.out.println("\t\t\tAmount paid: \t\t" + payment);
        System.out.println("\t\t\tBalance: \t\t" + balance);

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
        System.out.println("\n\t\tTHANK YOU FOR YOUR PATRONAGE");

        for (int line2 = 1; line2 <= 60; line2++) {
            System.out.print("=");
}
}
}