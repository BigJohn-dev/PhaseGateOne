from datetime import datetime

class CheckOutAppFunctions:

	def get_store_details(self):
		return (f"\nSEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03938373320 \n{datetime.now()}")

	def print_customer_invoice(self, items, customer, cashier, discount):
		print(f"Cashier: {cashier}")
		print(f"Customer Name: {customer}")
		print("=" * 60)
		print("\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)")
		print("-" * 60)

		sub_total = 0
		for item in items:
			total = item['quantity'] * item['price']
			sub_total += total
			print(f"\t\t{item['name']}\t{item['quantity']}\t\t{item['price']}\t{total:.2f}")

		print("-" * 60)

		discount_amount = sub_total * (discount / 100)
		vat = sub_total * 0.175
		bill_total = sub_total - discount_amount + vat

		print(f"\n\t\t\tSub Total: \t\t{sub_total:.2f}")
		print(f"\t\t\tDiscount: \t\t{discount_amount:.2f}")
		print(f"\t\t\tVAT @ 17.50%: \t\t{vat:.2f}")
		print("=" * 60)
		print(f"\t\t\tBill Total: \t\t{bill_total:.2f}")
		print("=" * 60)
		print(f"THIS IS NOT A RECEIPT. KINDLY PAY {bill_total:.2f}")
		print("=" * 60)

	def print_customer_receipt(self, items, customer, cashier, discount, payment):
		print(f"Cashier: {cashier}")
		print(f"Customer Name: {customer}")
		print("=" * 60)
		print("\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)")
		print("-" * 60)

		sub_total = 0
		for item in items:
			total = item['quantity'] * item['price']
			sub_total += total
			print(f"\t\t{item['name']}\t{item['quantity']}\t\t{item['price']}\t{total:.2f}")

		print("-" * 60)

		discount_amount = sub_total * (discount / 100)
		vat = sub_total * 0.175
		bill_total = sub_total - discount_amount + vat
		balance = payment - bill_total

		print(f"\n\t\t\tSub Total: \t\t{sub_total:.2f}")
		print(f"\t\t\tDiscount: \t\t{discount_amount:.2f}")
		print(f"\t\t\tVAT @ 17.50%: \t\t{vat:.2f}")
		print("=" * 60)
		print(f"\t\t\tBill Total: \t\t{bill_total:.2f}")
		print(f"\t\t\tAmount Paid: \t\t{payment:.2f}")
		print(f"\t\t\tBalance: \t\t{balance:.2f}")
		
		if balance < 0:
			print(f"\n\t{customer}, please pay your balance of N{abs(balance):.2f}")

		print("=" * 60)
		print("\t\tTHANK YOU FOR YOUR PATRONAGE")
		print("=" * 60)


def main():
	checkout = CheckOutAppFunctions()
	
	customer_name = input("What is the customer's Name? ")
	
	items = []
	choice = "yes"

	while choice.lower() == "yes":
		item_bought = input("What did the customer buy? ")

		price_per_unit = float(input("How much per unit? "))
		if price_per_unit <= 0:
			print("Invalid price input")
			continue

		quantity = int(input("How many units? "))
		if quantity <= 0:
			print("Invalid number of units.")
			continue

		items.append({
			'name': item_bought,
			'price': price_per_unit,
			'quantity': quantity
		})

		choice = input("Add more items? (yes or no) ").lower()

		while choice not in ["yes", "no"]:
			choice = input("Add more items? ").lower()

	cashier_name = input("Enter cashier's name: ")

	discount = float(input("How much discount will customer get? "))
	if discount < 0 or discount > 100:
		print("Discount must be between 0 and 100!")

	print(checkout.get_store_details())
	checkout.print_customer_invoice(items, customer_name, cashier_name, discount)

	payment = float(input("How much did the customer give to you? "))
	if payment <= 0:
		print("Invalid or negative payment!")

	print(checkout.get_store_details())
	checkout.print_customer_receipt(items, customer_name, cashier_name, discount, payment)


if __name__ == "__main__":
	main()
