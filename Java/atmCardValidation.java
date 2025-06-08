import java.util.Scanner;

public class atmCardValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number: ");
        String cardNumber = input.nextLine().trim();

        // Remove any spaces or hyphens
        cardNumber = cardNumber.replaceAll("[\\s-]", "");

        // Validate input
        if (!isNumeric(cardNumber) || cardNumber.length() < 13 || cardNumber.length() > 16) {
            System.out.println("Invalid input: Must be 13–16 digits.");
            input.close();
            return;
        }

        // Determine card type
        String cardType = getCardType(cardNumber);

        // Validate using Luhn algorithm
        boolean isValid = isValidLuhn(cardNumber);

        // Output results
        System.out.println("Card Type: " + cardType);
        System.out.println("Validity Status: " + (isValid ? "Valid" : "Invalid"));

        input.close();
    }

    // Check if string contains only digits
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Determine card type based on starting digits and length
    private static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }

    // Validate card number using Luhn algorithm
    private static boolean isValidLuhn(String cardNumber) {
        int[] digits = cardNumber.chars().map(ch -> ch - '0').toArray();
        int sum = 0;

        // Step 1: Double every second digit from right to left
        for (int i = digits.length - 2; i >= 0; i -= 2) {
            int doubled = digits[i] * 2;
            // If result is two digits, sum them
            digits[i] = (doubled > 9) ? (doubled - 9) : doubled;
            sum += digits[i];
        }

        // Step 2: Add digits in odd positions (1-based, right to left)
        for (int i = digits.length - 1; i >= 0; i -= 2) {
            sum += digits[i];
        }

        // Step 3: Check if sum is divisible by 10
        return sum % 10 == 0;
    }
}