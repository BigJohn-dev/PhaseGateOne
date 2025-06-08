import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCheckOutApp{

	@Test
	public void testGetStoreDetails() {
	String result = CheckOutAppFunctions.getStoreDetails();
	String expected = "SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03938373320\n";
	assertEquals(result, expected);
}


}