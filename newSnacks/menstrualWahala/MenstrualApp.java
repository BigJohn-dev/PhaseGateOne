import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("MENSTRUAL CYCLE APP");
	System.out.println("...calculate your monthly flow.");

	System.out.print("\nEnter the start date of your last period (YYYY-MM-DD): ");
	String periodInput = input.next();

	LocalDate periodDate = LocalDate.parse(periodInput);

	System.out.print("Enter your average cycle length in days (21 - 35): ");
	int cycleLength = input.nextInt();

	if (cycleLength < 21 || cycleLength > 35) {
	System.out.println("Cycle length must be between 21 and 35 days.");
	return;
}

	LocalDate nextPeriod = periodDate.plusDays(cycleLength);
	LocalDate ovulationDate = nextPeriod.minusDays(14);

	LocalDate fertileStart = ovulationDate.minusDays(3);
	LocalDate fertileEnd = ovulationDate.plusDays(2);

	System.out.println("\nMenstrual Cycle Prediction:");
	System.out.println("Next period expected on: " + nextPeriod);
	System.out.println("Estimated ovulation date: " + ovulationDate);

	System.out.println("\nFertile window: " + fertileStart + " to " + fertileEnd);
	System.out.println("Relatively safe days (lower pregnancy risk):");

	System.out.println("\n- Before fertile window: " + periodDate + " to " + fertileStart.minusDays(1));
	System.out.println("- After fertile window: " + fertileEnd.plusDays(1) + " to " + nextPeriod);
}
}
