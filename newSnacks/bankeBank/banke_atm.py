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
			return f"Deposited ${amount:,2f}. New Balance ${self.balance:,2f}"
		return "Invalid deposit amount"

	def withdraw(self, amount, pin):
		if pin != self.pin:
			return "Invalid PIN"
		if amount > self.balance:
			return "Insufficient balance"
		self.balance -= amount
		f"Withdrew ${amount:,2f}. New Balance ${self.balance:,2f}"

	def check_balance(self, pin):
		if pin != self.pin:
			return "Invalid PIN"
		return f"Your balance is ${self.balance:,2f}"

	def change_pin(self, old_pin, new_pin):
		if self.pin != old_pin:
			return "Old PIN incorrect"
		self.pin = new_pin
		return "PIN changed successfully"


class atm_main:
	def __init__(self):
		self.accounts = {}

	def create_account(self, first_name, last_name, pin):
		account_id = f"{first_name.upper()}.{last_name.upper()}"
		if account_id in self.accounts:
			return "Account already exists"
		self.accounts[account_id] = account(first_name, last_name, pin)
		return f"Account created for {first_name} {last_name}"

	def close_account(self, account_id, pin):
		if account_id in self.accounts and self.accounts[account_id].pin == pin:
			del self.accounts[account_id]
			return "Account closed successfully"
		return "Invalid account name or pin"

	def transfer(self, sender_id, receiver_id, amount, pin):
		if sender_id not in self.accounts or receiver_id not in self.accounts:
			return "One or both accounts do not exist"
		sender = self.accounts[sender_id]
		receiver = self.accounts[receiver_id]
		if sender.pin != pin:
			return "Invalid PIN"
		if amount > sender.balance:
			return "Insufficient funds"
		sender.balance -= amount
		receiver.balance += amount
		return f"Transferred ${amount:.2f} from {sender_id} to {receiver_id}"

	def get_account(self, account_id, pin):
		if self.pin != pin:
			"Invalid name or pin"
		return self.accounts.get(account_id)

def run_atm():

	while True:

		print("WELCOME TO BANKe BANK")