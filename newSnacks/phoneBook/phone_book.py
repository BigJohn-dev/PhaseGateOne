# Phone book application

class phone_book:

	def __init__(self):
		self.contacts = []

	def add_contact(self, first_name, last_name, phone_number):
		if first_name and last_name and phone_number == " ":
			return "No contact added."
		if first_name and last_name and phone_number not in self.contacts:
			self.contacts.append({"First name": first_name, "Last name": last_name, "Phone number":  phone_number})
			return "Contact saved successfully"

		return "Contact already exists"

	def remove_contact(self, index):
		if 1 <= index <= len(self.contacts):
			removed_contact = self.contacts.pop(index - 1)
			return f"Contact '{removed_contact['first_name, last_name, phone_number']}' deleted"
		return "Invalid contact number"

	def find_contact_by_phone_number(self, phone_number):
		if phone_number not in self.contacts:
			return "Contact not found"
		result = "From your contact list:\n"
		for i, contact in enumerate(self.contacts, 1):
			status = "Found" if contact ["phone_number"] else "Not found"
			result += f"{i}. {contacts['phone_number']} - {status}\n"
		return result

	def find_contact_by_first_name(self, first_name):
		if first_name not in self.contacts:
			return "Contact not found"
		result = "From your contact list:\n"
		for i, contact in enumerate(self.contacts, 1):
			status = "Found" if contact ["first_name"] else "Not found"
			result += f"{i}. {contacts['first_name']} - {status}\n"
		return result

	def find_contact_by_last_name(self, last_name):
		if last_name not in self.contacts:
			return "Contact not found"
		result = "From your contact list:\n"
		for i, contact in enumerate(self.contacts, 1):
			status = "Found" if contact ["last_name"] else "Not found"
			result += f"{i}. {contacts['last_name']} - {status}\n"
		return result

	def  edit_contact(self, first_name, last_name,  new_number):
		if self.first_name  != first_name and self.last_name != last_name:
			return "\nFirst name or Last Name is incorrect"
		self.new_number = new_number
		return "\nPhone number  changed successfully"



def main():
	Phone_Book = phone_book()
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
				contact_num = input("Enter contact number to delete: ")
				print(phone_book.remove_contact(contact_num))
			except ValueError:
				print("Invalid input, please enter contact number")

		elif choice == "3":
			print("FIND CONTACT BY PHONE NUMBER")
			print(phone_book.find_contact_by_phone_number())
			try:
				contact_num = input("Enter contact number to view: ")
				print(phone_book.find_contact_by_phone_number(contact_num))
			except ValueError:
				print("Invalid input, please enter contact number")

		elif choice == "4":
			print("FIND CONTACT BY FIRST NAME")
			print(phone_book.find_contact_by_first_name())
			try:
				contact_first_name = input("Enter contact first name to view: ")
				print(phone_book.find_contact_by_first_name(contact_first_name))
			except ValueError:
				print("Invalid input, please enter contact first name")

		elif choice == "5":
			print("FIND CONTACT BY LAST NAME")
			print(phone_book.find_contact_by_last_name())
			try:
				contact_last_name = input("Enter contact last name to view: ")
				print(phone_book.find_contact_by_last_name(contact_last_name))
			except ValueError:
				print("Invalid input, please enter contact last name")

		elif choice == "6":
			print("EDIT CONTACT ")
			first_name = input("Enter first name: ")
			last_name = input("Enter last name: ")
			check_contact = phone_book.self.contacts(first_name, last_name)
			if valid_check:
				new_number = input("Enter new number: ")
				print(check_contact.edit_contact(first_name, last_name, new_number))
			else:
				print("Invalid contact first name or last name .")

		elif choice == "0":
			print("...exiting phone book")
			break
		else:
			print("Invalid option")

if __name__ == "__main__":
	main()