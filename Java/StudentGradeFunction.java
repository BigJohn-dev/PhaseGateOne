public class StudentGradeFunction {

	public static void printSummary(int numStudents, int numSubjects, int score) {
	for (int line = 1; line < 60; line++) System.out.print("=");
	
	System.out.println("STUDENT\tSUBJECT1\tSUBJECT2\tSUBJECT3\tTOTAL\tAVERAGE\tPOSITION");	
	for (int line = 1; line < 60; line++) System.out.print("=");

	for (int count = 0; count < numStudents; count++) {
        int total = 0;
        	for (int counter = 0; counter < numSubjects; counter++) {
                total += scores[count][counter];
}
         double average = (double) total / numSubjects;
         System.out.println();
}
}


}