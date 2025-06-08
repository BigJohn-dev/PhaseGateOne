from datetime import datetime

class CheckOutAppFunctions:

	def get_store_details(self):
		return (f"\nSEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03938373320 \n{datetime.now()}")

	def print_customer_invoice(self, item, quantity, price, customer, cashier, discount):
		print(f"Cashier: {cashier}")
		print(f"Customer Name: {customer}")
		print("=" * 60)
		print("\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)")
		print("-" * 60)

		total = quantity * price
		print(f"\t\t{item}\t{quantity}\t\t{price}\t{total:.2f}")
		print("-" * 60)

		discount_amt = total * (discount / 100)
		vat = total * 0.175
		bill_total = total - discount_amt + vat

		print(f"\n\t\t\tSub Total: \t\t{total:.2f}")
		print(f"\t\t\tDiscount: \t\t{discount_amt:.2f}")
		print(f"\t\t\tVAT @ 17.50%: \t\t{vat:.2f}")
		print("=" * 60)
		print(f"\t\t\tBill Total: \t\t{bill_total:.2f}")
		print("=" * 60)
		print(f"THIS IS NOT A RECEIPT. KINDLY PAY {bill_total:.2f}")
		print("=" * 60)

	def print_customer_receipt(self, item, quantity, price, customer, cashier, discount, payment):
		print(f"Cashier: {cashier}")
		print(f"Customer Name: {customer}")
		print("=" * 60)
		print("\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)")
		print("-" * 60)

		total = quantity * price
		print(f"\t\t{item}\t{quantity}\t\t{price}\t{total:.2f}")
		print("-" * 60)

		discount_amt = total * (discount / 100)
		vat = total * 0.175
		bill_total = total - discount_amt + vat
		balance = payment - bill_total

		print(f"\n\t\t\tSub Total: \t\t{total:.2f}")
		print(f"\t\t\tDiscount: \t\t{discount_amt:.2f}")
		print(f"\t\t\tVAT @ 17.50%: \t\t{vat:.2f}")
		print("=" * 60)
		print(f"\t\t\tBill Total: \t\t{bill_total:.2f}")
		print(f"\t\t\tAmount Paid: \t\t{payment:.2f}")
		print(f"\t\t\tBalance: \t\t{balance:.2f}")
		print("=" * 60)
		print("\t\tTHANK YOU FOR YOUR PATRONAGE")
		print("=" * 60)


def main():
	checkout = CheckOutAppFunctions()

	customer_name = input("What is the customer's Name? ")
	
	total_price = 0.0
	item_name = ""
	total_quantity = 0
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

		item_name = item_bought
		total_price = price_per_unit
		total_qty = quantity

		choice = input("Add more items? (yes or no) ").strip().lower()

		while choice not in ["yes", "no"]:
			choice = input("Add more items? ").strip().lower()

	cashier_name = input("What is your Name? (Cashier name) ")

	discount = float(input("How much discount will customer get? "))
	if discount < 0 or discount > 100:
		print("Discount must be between 0 and 100!")

	print(checkout.get_store_details())
	checkout.print_customer_invoice(item_name, total_qty, total_price, customer_name, cashier_name, discount)

	payment = float(input("\n\nHow much did the customer give to you? "))
	if payment <= 0:
		print("Invalid or negative payment!")

	print(checkout.get_store_details())
	checkout.print_customer_receipt(item_name, total_qty, total_price, customer_name, cashier_name, discount, payment)


if __name__ == "__main__":
	main()
