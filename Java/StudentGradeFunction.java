public class StudentGradeFunction {

	public static void printSummary(int[][] score) {

	for (int line = 1; line < 100; line++) System.out.print("=");

	int numStudents = score.length;
	int numSubjects = score[0].length;

	int[] total = new int[numStudents];
	double[] average = new double[numStudents];
	int[] position = new int[numStudents];

	System.out.println("\nSTUDENT\t\tSUBJECT1\tSUBJECT2\tSUBJECT3\tTOTAL\tAVERAGE\t\tPOSITION");	
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
}