// Check out app
const prompt = require("prompt-sync")();

function getStoreDetails() {
	return "\n\nSEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03938373320 \nDATE: " + new Date().toLocaleString();
}

function printCustomerInvoice(items, customer, cashier, discount) {
	console.log("Cashier: " + cashier);
	console.log("Customer Name: " + customer);
	console.log("=".repeat(60));
	console.log("\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
	console.log("-".repeat(60));

	let total = 0;
	for (let item of items) {
		let itemTotal = item.price * item.quantity;
		total += itemTotal;
		console.log("\t\t" + item.name + "\t" + item.quantity + "\t\t" + item.price + "\t" + itemTotal.toFixed(2));
	}

	console.log("-".repeat(60));

	let discountAmount = total * (discount / 100);
	let vat = total * 0.175;
	let billTotal = total - discountAmount + vat;

	console.log("\t\t\tSub Total:\t\tN" + total.toFixed(2));
	console.log("\t\t\tDiscount:\t\tN" + discountAmount.toFixed(2));
	console.log("\t\t\tVAT @ 17.50%:\t\tN" + vat.toFixed(2));
	console.log("=".repeat(60));
	console.log("\t\t\tBill Total:\t\tN" + billTotal.toFixed(2));
	console.log("=".repeat(60));
	console.log("THIS IS NOT A RECEIPT. KINDLY PAY N" + billTotal.toFixed(2));
	console.log("=".repeat(60));

	return billTotal;
}

function printCustomerReceipt(items, customer, cashier, discount, payment) {
	console.log("Cashier: " + cashier);
	console.log("Customer Name: " + customer);
	console.log("=".repeat(60));
	console.log("\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
	console.log("-".repeat(60));

	let total = 0;
	for (let item of items) {
		let itemTotal = item.price * item.quantity;
		total += itemTotal;
		console.log("\t\t" + item.name + "\t" + item.quantity + "\t\t" + item.price + "\t" + itemTotal.toFixed(2));
	}

	console.log("-".repeat(60));

	let discountAmount = total * (discount / 100);
	let vat = total * 0.175;
	let billTotal = total - discountAmount + vat;
	let balance = payment - billTotal;

	console.log("\t\t\tSub Total:\t\tN" + total.toFixed(2));
	console.log("\t\t\tDiscount:\t\tN" + discountAmount.toFixed(2));
	console.log("\t\t\tVAT @ 17.50%:\t\tN" + vat.toFixed(2));
	console.log("=".repeat(60));
	console.log("\t\t\tBill Total:\t\tN" + billTotal.toFixed(2));
	console.log("\t\t\tAmount Paid:\t\tN" + payment.toFixed(2));
	console.log("\t\t\tBalance:\t\tN" + balance.toFixed(2));
	console.log("=".repeat(60));
	console.log("\t\tTHANK YOU FOR YOUR PATRONAGE");
	console.log("=".repeat(60));
}

function main() {
	console.log("WELCOME TO SEMICOLON STORES\n");

	let customerName = prompt("What is the customer's Name? ");
	let items = [];
	let choice = "yes";

	while (choice.toLowerCase() === "yes") {
		let name = prompt("What did the customer buy? ");
		let price = parseFloat(prompt("How much per unit? "));
		if (price <= 0) {
			console.log("Enter a valid price");
			continue;
		}
		let quantity = parseInt(prompt("How many units? "), 10);

		items.push({ name, price, quantity });

		choice = prompt("Add more items? (yes/no): ");
		while (choice.toLowerCase() !== "yes" && choice.toLowerCase() !== "no") {
			choice = prompt("Please enter yes or no: ");
		}
	}

	let cashierName = prompt("What is your Name (cashier)? ");
	let discount = parseFloat(prompt("How much discount (%) will customer get? "));
	if (discount < 0 || discount > 100) {
		console.log("Discount must be between 0 and 100!");
		discount = 0;
	}

	console.log(getStoreDetails());
	let billTotal = printCustomerInvoice(items, customerName, cashierName, discount);

	let payment = parseFloat(prompt("How much did the customer give to you? "));
	if (payment <= 0) {
		console.log("Invalid or negative payment!");
		return;
	}

	console.log(getStoreDetails());
	printCustomerReceipt(items, customerName, cashierName, discount, payment);
}

main();
