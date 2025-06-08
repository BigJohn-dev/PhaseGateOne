import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCheckOutApp{

	    @Test
    public void testGetStoreDetails() {
        String result = CheckOutAppFunctions.getStoreDetails();
        String expectedPrefix = "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03938373320\n";
        String datePattern = "\\w{3} \\w{3} \\d{2} \\d{2}:\\d{2}:\\d{2} \\w{3} \\d{4}";
        assertTrue(result.startsWith(expectedPrefix), "Store details prefix incorrect");
        assertTrue(Pattern.compile(datePattern).matcher(result.substring(expectedPrefix.length())).matches(),
                "Date format incorrect");
    }

	@Test
    	public void testPrintCustomerInvoice() {
        String item = "Apple";
        int quantities = 2;
        double price = 1.5;
        String customerName = "John Doe";
        String cashierName = "Alice";
        double discount = 10.0;
	assertEquals();
        CheckOutAppFunctions.printCustomerInvoice(item, quantities, price, customerName, cashierName, discount);

}