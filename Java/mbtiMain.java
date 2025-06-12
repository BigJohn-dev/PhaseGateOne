import java.util.Scanner;

public class mbtiMain {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to the MBTI Test!");
	System.out.println("Please answer each question with A or B.\n");

	System.out.print("What is your name?: ");
	String name = input.next();

	char[] answers = mbti.askQuestions(input);
	String mbti = mbti.calculateMBTI(answers);
    
	System.out.println("Your MBTI type is: " + mbti);
	System.out.println("\nDescription:");
	System.out.println(mbti.getDescription(mbti));
}
}