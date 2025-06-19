# Phone book application

class PhoneBook:

	def __init__(self):
		self.contacts = []

	def add_contact(self, first_name, last_name, phone_number):
		if not (first_name and last_name and phone_number):
			return "No contact added."

		for contact in self.contacts:
			if contact["Phone number"] == phone_number:
				return "Contact with this number already exists."
			self.contacts.append({"First name": first_name, "Last name": last_name, "Phone number": phone_number})
			return "Contact saved successfully."


	def remove_contact(self, index):
		if 1 <= index <= len(self.contacts):
			removed_contact = self.contacts.pop(index - 1)
			return f"Contact '{removed_contact['first_name']} {removed['last name']}' deleted"
		return "Invalid contact number"

	def find_contact_by_phone_number(self, phone_number):
		if phone_number not in self.contacts and ["Phone number"] != phone_number:
			return "Contact not found"
		result = "From your contact list:\n"
		for i, contact in enumerate(self.contacts, 1):
			status = "Found" if contact ["phone_number"] else "Not found"
			return "\n".join([f"{i+1}. {c['First name']} {c['Last name']} - {c['Phone number']}"

	def find_contact_by_first_name(self, first_name):
		if first_name not in self.contacts:
			return "Contact not found"
		for i, contact in enumerate(self.contacts, 1):
			status = "Found" if contact ["first_name"] else "Not found"
			return "\n".join([f"{i+1}. {c['First name']} {c['Last name']} - {c['Phone number']}"

	def find_contact_by_last_name(self, last_name):
		if last_name not in self.contacts:
			return "Contact not found"
		for i, contact in enumerate(self.contacts, 1):
			status = "Found" if contact ["last_name"] else "Not found"
			return "\n".join([f"{i+1}. {c['First name']} {c['Last name']} - {c['Phone number']}"

	def edit_contact(self, first_name, last_name,  new_number):
		for contact in self.contacts:
			if contact["First name"].lower() == first_name.lower() and contact["Last name"].lower() == last_name.lower():
				contact["Phone number"] = new_number
				return "Phone number changed successfully."
			return "Contact not found."



def main():
	Phone_Book = PhoneBook()
	while True:
		print("\nPHONE BOOK CONTACTS")
		menu = """
Phone book menu
1. Add new contact
2. Remove contact
3. Find contact by phone number
4. Find contact by first name
5. Find contact by last name
6. Edit contact
0. Exit
"""
		print(menu)
		choice = input("Enter your choice (1-5): ")

		if choice == "1":
			print("ADD  NEW CONTACT")
			first_name = input("Enter first name: ")
			last_name = input("Enter last name: ")
			phone_number = input("Enter contact number: ")
			print(phone_book.add_contact(first_name, last_name, phone_number))

		elif choice == "2":
			print("REMOVE CONTACT")
			print(phone_book.remove_contact())
			try:
				index_num = input("Enter the number of the contact to delete: ")
				print(phone_book.remove_contact(index_num))
			except ValueError:
				print("Invalid input, please enter a valid number")

		elif choice == "3":
			print("FIND CONTACT BY PHONE NUMBER")
			contact_num = input("Enter contact number to view: ")
			print(phone_book.find_contact_by_phone_number(contact_num))
			
		elif choice == "4":
			print("FIND CONTACT BY FIRST NAME")
			contact_first_name = input("Enter contact first name to view: ")
			print(phone_book.find_contact_by_first_name(contact_first_name))
			
		elif choice == "5":
			print("FIND CONTACT BY LAST NAME")
			contact_last_name = input("Enter contact last name to view: ")
			print(phone_book.find_contact_by_last_name(contact_last_name))
			
		elif choice == "6":
			print("EDIT CONTACT ")
			first_name = input("Enter first name: ")
			last_name = input("Enter last name: ")
			new_number = input("Enter new number: ")
			print(phone_book.edit_contact(first_name, last_name, new_number))

		elif choice == "0":
			print("...exiting phone book")
			break
		else:
			print("Invalid option")

if __name__ == "__main__":
	main()