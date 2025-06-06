import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualApp {

    // Display welcome message
    private static void displayWelcomeMessage() {
        System.out.println("MENSTRUAL CYCLE APP");
        System.out.println("...calculate your monthly flow.");
    }
    
    // Get period start date from user
    private static String getPeriodDate(Scanner input) {
        System.out.print("\nEnter the start date of your last period (YYYY-MM-DD): ");
        return input.next();
    }
    
    // Get cycle length from user
    private static int getCycleLength(Scanner input) {
        System.out.print("Enter your average cycle length in days: ");
        return input.nextInt();
    }
    
    // Validate cycle length
    private static boolean isValidCycleLength(int cycleLength) {
        return cycleLength >= 21 && cycleLength <= 35;
    }
    
    // Parse input date
    private static LocalDate parseDate(String dateInput) throws Exception {
        return LocalDate.parse(dateInput);
    }
    
    // Calculate next period date
    private static LocalDate calculateNextPeriod(LocalDate periodDate, int cycleLength) {
        return periodDate.plusDays(cycleLength);
    }
    
    // Calculate ovulation estimate
    private static LocalDate calculateOvulation(LocalDate nextPeriod) {
        return nextPeriod.minusDays(14);
    }
    
    // Display results
    private static void displayResults(LocalDate nextPeriod, LocalDate ovulationEstimate) {
        System.out.println("Next period expected on: " + nextPeriod);
        System.out.println("Estimated ovulation date: " + ovulationEstimate);
    }

	    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        displayWelcomeMessage();
        
        String lastPeriodInput = getPeriodDate(input);
        int cycleLength = getCycleLength(input);
        
        if (!isValidCycleLength(cycleLength)) {
            System.out.println("Warning: Typical cycle length is between 21 - 35 days.");
            System.out.println("Please consult a healthcare provider if your cycle length is consistently outside this range.");
            input.close();
            return;
        }
        
        try {
            LocalDate periodDate = parseDate(lastPeriodInput);
            LocalDate nextPeriod = calculateNextPeriod(periodDate, cycleLength);
            LocalDate ovulationEstimate = calculateOvulation(nextPeriod);
            
            displayResults(nextPeriod, ovulationEstimate);
        } catch (Exception e) {
            System.out.println("Error: Please enter the date in YYYY-MM-DD format (e.g., 2025-06-01)");
        } finally {
            input.close();
        }
    }
    
}