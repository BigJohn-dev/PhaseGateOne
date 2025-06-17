public class TaskEight {
	public static void main(String[] args) {

	
	for(int number = 1; number <= 10; number++) {
	    if (number % 4 == 0) {
		int sum = 0;
	      for(int numbers = 1; numbers <= 5; numbers++) {
		 sum += (int)Math.pow(number, numbers);
}
	System.out.print(sum + " ");
}
}

}
}