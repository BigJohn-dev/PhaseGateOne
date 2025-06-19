public class PhoneBookFunctions {

        String firstName, lastName, phoneNumber;

        public Contact(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
}
	String[] contacts = new Contact[10];
	public static Contact[] getContacts() {
	for(int i = 0; i < contacts.length; i++) {
	result[i] = contacts[i];
	System.out.println(result[i]);
}
	return result;	
}


	public static String addContact(String firstName, String lastName, String phoneNumber){
	if (firstName.equals(contacts.firstName) && lastName.equals(contacts.lastName) && phoneNumber.equals(contacts.phoneNumber)) {
	return "Contact is already existing";
} else {
	contacts.append(firstName, lastName, phoneNumber);
	return "Contact added successfully";
}
}
	public static String removeContact(String firstName, String lastName, String phoneNumber){
	if (firstName.equals(contacts.firstName) && lastName.equals(contacts.lastName) && phoneNumber.equals(contacts.phoneNumber)) { 
	contacts.pop(firstName, lastName, phoneNumber);
} else {
	return "Contact does not exist";
}
}
	public static String findContactByPhoneNumber(String phoneNumber){
	if (phoneNumber.equals(contacts.phoneNumber)) {
	contacts.getContact();
} else {
	return "Contact does not exist";
}
	public static String findContactByFirstName(String firstName){
	if (firstName.equals(contacts.firstName)) {
	contacts.getContact();
} else {
	return "Contact does not exist";
}
}
	public static String findContactByLastName(lastName){
	if (lastName.equals(contacts.lastName)) {
	contacts.getContact();
} else {
	return "Contact does not exist";
}
}
	public static String edit_contact(String firstName, String lastName, String phoneNumber){
	if (firstName.equals(contacts.firstName) && lastName.equals(contacts.lastName) && phoneNumber.equals(contacts.phoneNumber)) {
		String contact = contacts.getContact();
		if (contact.equals(contacts.contacts)) contacts.append(firstName, lastName, phoneNumber);
}else {
	return "Contact does not exist";
}
}

}