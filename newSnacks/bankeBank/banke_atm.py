# Banke Bank ATM 

class account:

	def __init__(self, first_name, last_name, pin, balance = 0.0):
		self.first_name = first_name
		self.last_name = last_name
		self.pin = pin
		self.balance = balance

	def deposit(self, amount):
		if amount > 0:
			self.balance += amount
			return f"\nDeposited ${amount:,.2f}. New Balance ${self.balance:,.2f}"
		return "\nInvalid deposit amount"

	def withdraw(self, amount, pin):
		if pin != self.pin:
			return "\bInvalid pin"
		if amount > self.balance:
			return "\nInsufficient balance"
		self.balance -= amount
		return f"\nWithdrew ${amount:,.2f}. New Balance ${self.balance:,.2f}"

	def check_balance(self, pin):
		if pin != self.pin:
			return "\nInvalid pin"
		return f"\nYour balance is ${self.balance:,.2f}"

	def change_pin(self, old_pin, new_pin):
		if self.pin != old_pin:
			return "\nold pin incorrect"
		self.pin = new_pin
		return "\nPIN changed successfully"


class atm_main:
	def __init__(self):
		self.accounts = {}

	def create_account(self, first_name, last_name, pin):
		account_id = f"{first_name.upper()}.{last_name.upper()}"
		if account_id in self.accounts:
			return "\nAccount already exists"
		self.accounts[account_id] = account(first_name, last_name, pin)
		return f"\nAccount successfully created for {first_name.upper()} {last_name.upper()}"

	def close_account(self, account_id, pin):
		if account_id in self.accounts and self.accounts[account_id].pin == pin:
			del self.accounts[account_id]
			return "\nAccount closed successfully"
		return "\nInvalid account name or pin"

	def transfer(self, sender_id, receiver_id, amount, pin):
		if sender_id not in self.accounts or receiver_id not in self.accounts:
			return "\nOne or both accounts do not exist"
		sender = self.accounts[sender_id]
		receiver = self.accounts[receiver_id]
		if sender.pin != pin:
			return "\nInvalid PIN"
		if amount > sender.balance:
			return "\nInsufficient funds"
		sender.balance -= amount
		receiver.balance += amount
		return f"\nTransferred ${amount:,.2f} from {sender_id} to {receiver_id}"

	def get_account(self, account_id, pin):
		account = self.accounts.get(account_id)
		if account and account.pin == pin:
			return account
		return None

def run_atm():
	atm = atm_main()

	print("\nWELCOME TO BANKe BANK")
	print("...transaction made easy")
	while True:

		atm_menu = """
========================
	ATM Menu
1. Create an account
2. Close account
3. Deposit money
4. Withdraw money
5. Check account balance
6. Transfer 
7. Change Pin
0. Exit
========================
		"""
		print(atm_menu)
		choice = input("Enter option: ");
		match choice:
			case "1":
				print("\nWelcome to Banke bank")
				print("\nCreate new account")
				first_name = input("\nEnter first name: ")
				last_name = input("Enter last name: ")
				pin = input("Set account pin: ")
				print(atm.create_account(first_name, last_name, pin))

			case "2":
				print("\nClose account")
				first_name = input("Enter first name: ")
				last_name = input("Enter last name: ")
				account_id = f"{first_name.upper()}.{last_name.upper()}"
				pin = input("Enter account pin: ")
				print(atm.close_account(account_id, pin))

			case "3":
				print("\nDeposit money")
				first_name = input("Enter first name: ")
				last_name = input("Enter last name: ")
				account_id = f"{first_name.upper()}.{last_name.upper()}"
				pin = input("Enter account pin: ")
				valid_check = atm.get_account(account_id, pin)
				if valid_check:
					try:
						amount = float(input("Enter amount to deposit: "))
						print(valid_check.deposit(amount))
					except ValueError:
						print("Invalid amount. Please enter a number.")
				else:
					print("Invalid account name or pin.")

			case "4":
				print("\nWithdraw money")
				first_name = input("Enter first name: ")
				last_name = input("Enter last name: ")
				account_id = f"{first_name.upper()}.{last_name.upper()}"
				pin = input("Enter account pin: ")
				valid_check = atm.get_account(account_id, pin)
				if valid_check:
					try:
						amount = float(input("Enter amount to withdraw: "))
						print(valid_check.withdraw(amount, pin))
					except ValueError:
						print("Invalid amount. Please Enter a number")
				else:
					print("Invalid account name or pin.")

			case "5":
				print("\nCheck account balance")
				first_name = input("Enter first name: ")
				last_name = input("Enter last name: ")
				account_id = f"{first_name.upper()}.{last_name.upper()}"
				pin = input("Enter account pin: ")
				valid_check = atm.get_account(account_id, pin)
				if valid_check:
					print(valid_check.check_balance(pin))
				else:
					print("Invalid account name or pin.")

			case "6":
				print("\nTransfer money")
				sender_first_name = input("Enter sender's first name: ")
				sender_last_name = input("Enter sender's last name: ")
				sender = f"{sender_first_name.upper()}.{sender_last_name.upper()}"
				receiver_first_name = input("Enter receiver's first name: ")
				receiver_last_name = input("Enter receiver's last name: ")
				receiver = f"{receiver_first_name.upper()}.{receiver_last_name.upper()}"
				pin = input("Enter sender's pin: ")
				try:
					amount = float(input("Enter amount to transfer: "))
					print(atm.transfer(sender, receiver, amount, pin))
				except ValueError:
					print("Invalid amount. Please enter a number.")

			case "7":
				print("\nChange pin")
				first_name = input("Enter first name: ")
				last_name = input("Enter last name: ")
				account_id = f"{first_name.upper()}.{last_name.upper()}"
				old_pin = input("Enter current pin: ")
				valid_check = atm.get_account(account_id, old_pin)
				if valid_check:
					new_pin = input("Enter new pin: ")
					print(valid_check.change_pin(old_pin, new_pin))
				else:
					print("Invalid account name or pin.")

			case "0":
				print("\nExiting ATM terminal.")
				print("...thank you for banking with us @Banke bank")
				break

			case _: 
				print("Invalid option. Try again")


run_atm()