public class StudentGradeFunction {

	public static void printSummary(int[][] score) {

	System.out.println();
	for (int line = 1; line < 100; line++) System.out.print("=");

	int numStudents = score.length;
	int numSubjects = score[0].length;

	int[] total = new int[numStudents];
	double[] average = new double[numStudents];
	int[] position = new int[numStudents];

	String displayLine = "\nSTUDENT\t\t";
	for(int i = 0; i < numSubjects; i++) displayLine += "SUBJECT " + (i + 1) + "\t";
	displayLine += "TOTAL\tAVERAGE\t\tPOSITION";

	System.out.println(displayLine);
	
	for (int line = 1; line < 100; line++) System.out.print("=");

	for (int count = 0; count < numStudents; count++) {
          int sum = 0;
          for (int counter = 0; counter < numSubjects; counter++) {
                sum += score[count][counter];
}
	total[count] = sum;
        average[count] = (double) sum / numSubjects;
}

	for(int i = 0; i < numStudents; i++){
	    int first = 1;
	    for (int j = 0; j < numStudents; j++) {
		if (total[j] > total[i]) first++;
}
	position[i] = first;
}
	
	for (int i = 0; i < numStudents; i++) {
		System.out.print("\nStudent " + (i + 1) + "\t");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(score[i][j] + "\t\t");
}
            System.out.print(total[i]);
            System.out.print("\t" + Math.round(average[i]));
            System.out.print("\t\t" + position[i]);
}
}

	public static void printSubjectSummary(int[][] score) {

	System.out.println("\n\nSUBJECT SUMMARY");

	int numStudents = score.length;
	int numSubjects = score[0].length;
	
	int[] total = new int[numStudents];
	double[] average = new double[numStudents];
	int[] position = new int[numStudents];

	int pass = 0;
	int fail = 0;
	int scores = 0;

	for (int count = 0; count < numStudents; count++) {
          int sum = 0;
          for (int counter = 0; counter < numSubjects; counter++) {
                sum += score[count][counter];
		if (score[count][counter] < 50) {
		fail += 1;
} else {
		pass += 1;
}
}
	total[count] = sum;
        average[count] = (double) sum / numSubjects;
}

	for(int i = 0; i < numStudents; i++){
	    int first = 1;
	    for (int j = 0; j < numStudents; j++) {
		if (total[j] > total[i]) first++;
}
	position[i] = first;
}
	
	for (int i = 0; i < numStudents; i++) {
		System.out.print("\nStudent " + (i + 1) + "\t");
            for (int j = 0; j < numSubjects; j++) {
                scores += score[i][j];
}

	for(int a = 0; a < numSubjects + 1; a++) {
	System.out.println("\nSubject " + (a + 1));
	System.out.println("Highest scoring student is: Student " + position[a] + " scoring " + scores);
	System.out.println("Lowest scoring student is: Student " + position[a] + " scoring " + scores);
	System.out.println("Total score is: " + total[a]);
	System.out.println("Average score is: " + average[a]);
	System.out.println("Number of passes: " + pass);
	System.out.println("Number of fails: " + fail);
}
}
}

}