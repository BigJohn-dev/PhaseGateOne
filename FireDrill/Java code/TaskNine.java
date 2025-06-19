public class TaskNine {
	public static void main(String[] args) {

	int total = 0;
	for(int number = 1; number <= 10; number++) {
	    if (number % 4 == 0) {
		int sum = 0;
	      for(int numbers = 1; numbers <= 5; numbers++) {
		 sum += (int)Math.pow(number, numbers);
}
	total += sum;
}
}
	System.out.print(total * total + " ");
}
}