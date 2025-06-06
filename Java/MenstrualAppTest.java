import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assert;

public class MenstrualAppTest {

	@Test
	public void testNextPeriod() {
	LocalDate periodDate = LocalDate(2025, 5, 15);
	int cycleLength = 28;
	assertEquals(LocalDate(2025, 6, 12), MenstrualApp.nextPeriod(periodDate, cycleLength));
}

}
