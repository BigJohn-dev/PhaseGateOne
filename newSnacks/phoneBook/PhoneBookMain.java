import java.util.Scanner;

public class PhoneBookMain {

	static void printMenu() {
	String menu = """
1. Add contact
2. Remove contact
3. Find contact by phone number
4. Find contact by first name
5. Find contact by last name
6. Edit contact
0. Exit
""";
	System.out.println(menu);
}


	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("\nPHONE BOOK\n");
	printMenu();

	System.out.print("Enter an option: ");
	int choice = input.nextInt();
	
	String firstName, lastName, phoneNumber;
	switch (choice) {
	case 1:
		System.out.println("\nADD NEW CONTACT");
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter phone number: ");
		phoneNumber = input.next();
		System.out.println(PhoneBookFunctions.addContact(firstName, lastName, phoneNumber));
	
	default:
		System.out.println("Invalid input.");

}
	
}
}