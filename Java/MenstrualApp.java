import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("MENSTRUAL CYCLE APP");
	System.out.println("...calculate your monthly flow.");

	System.out.print("\nEnter the start date of your last period: ");
	String periodDate = input.next();
	
	System.out.print("Enter your average cycle length in days: ");
	int cycleLength = input.nextInt();

	if (cycleLength < 21 || cycleLength > 35) {
	System.out.println("Cycle length is between 21 - 35 days.");
}
	LocalDate periodDate = LocalDate.parse(lastPeriodInput);

	LocalDate nextPeriod = periodDate.plusDays(cycleLength);
	System.out.println("Next period expected on: " + nextPeriodDate);



}

}