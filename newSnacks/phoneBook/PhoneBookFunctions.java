public class PhoneBookFunctions {

        String firstName;
        String lastName;
        String phoneNumber;
	String[] contacts = {};

        public contact(String firstName, String lastName, String phoneNumber, String[] contacts) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.contacts = contacts;
}
	static void String[] getContact() {
	for(int i = 0; i < contact.length; i++) {
	System.out.print(contact[i]);
}
	System.out.println();
}


	public static String addContact(String firstName, String lastName, String phoneNumber){
	if (firstName == this.firstName && lastName == this.lastName && phoneNumber == this.phoneNumber) {
	return "Contact is already existing";
} else {
	contacts.append(firstName, lastName, phoneNumber);
	return "Contact added successfully";
}
}
	public static String removeContact(String firstName, String lastName, String phoneNumber){
	if (firstName == this.firstName && lastName == this.lastName && phoneNumber == this.phoneNumber) { 
	contacts.pop(firstName, lastName, phoneNumber);
} else {
	return "Contact does not exist";
}
}
	public static String findContactByPhoneNumber(String phoneNumber){
	if (phoneNumber == this.phoneNumber) {
	contacts.getContact();
} else {
	return "Contact does not exist";
}
	public static String findContactByFirstName(String firstName){
	if (firstName == this.firstName) {
	contacts.getContact();
} else {
	return "Contact does not exist";
}
}
	public static String findContactByLastName(lastName){
	if (lastName == this.lastName) {
	contacts.getContact();
} else {
	return "Contact does not exist";
}
}
	public static String edit_contact(String firstName, String lastName, String phoneNumber){
	if (firstName == this.firstName && lastName == this.lastName && phoneNumber == this.phoneNumber) {
		String contact = contacts.getContact();
		if (contact == this.contacts) contacts.append(firstName, lastName, phoneNumber);
}else {
	return "Contact does not exist";
}
}

}