import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println(" __- LAGBAJA HIGH SCHOOL -__");
	System.out.println("...managing classroom grades");

        System.out.println("\nEnter number of students: ");
        int numStudents = input.nextInt();

        System.out.println("Enter number of subjects: ");
        int numSubjects = input.nextInt();

        int[][] scores = new int[numStudents][numSubjects];

	for (int count = 0; count < numStudents; count++) {
		System.out.println("\nEnter score for Student " + (count + 1));
		for (int counter = 0; counter < numSubjects; counter++) {
                while (true) {
                	System.out.println("Enter score for Subject " + (counter + 1) + ": ");
                    int score = input.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[count][counter] = score;
                        break;
} else {
		System.out.println("Invalid score. Please enter a valid score between 0 and 100.");
}
}
}
}        
	StudentGradeFunction.printSummary(scores);



}
}
