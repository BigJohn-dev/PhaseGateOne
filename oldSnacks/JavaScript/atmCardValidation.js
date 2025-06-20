// Atm card Validator
const prompt = require("prompt-sync")();

const ATM_Card = {

	visa(card_number) {
	if (!card_number || card_number.length !== 16) {
	return "Valid: false, reason: Invalid length";
}
	if (card_number[0] !== 4) {
	return "Valid: false, reason: Invalid starting digit";
}
	if (!this.isValidLuhn(card_number)) {
	return "Valid: false, reason: Invalid checksum";
}
	return "Valid: true, issuer: Visa Card";
},

	masterCard(card_number) {
	if (!card_number || card_number.length !== 16) {
	return "Valid: false, reason: Invalid length";
}
	if (card_number[0] !== 5) {
	return "Valid: false, reason: Invalid starting digit";
}
	if (!this.isValidLuhn(card_number)) {
	return "Valid: false, reason: Invalid checksum";
}
	return "Valid: true, issuer: MasterCard";
},

	discover(card_number) {
	if (!card_number || card_number.length !== 16) {
	return "Valid: false, reason: Invalid length";
}
	if (card_number[0] !== 6) {
	return "Valid: false, reason: Invalid starting digit";
}
	if (!this.isValidLuhn(card_number)) {
	return "Valid: false, reason: Invalid checksum";
}
	return "Valid: true, issuer: Discover Card";
},

	americanExpress(card_number) {
	if (!card_number || card_number.length !== 15) {
	return "Valid: false, reason: Invalid length";
}
	if (card_number[0] !== 3) {
	return "Valid: false, reason: Invalid starting digit";
}
	if (!this.isValidLuhn(card_number)) {
	return "Valid: false, reason: Invalid checksum";
}
	return "Valid: true, issuer: America Express Card";
},

	isValidLuhn(card_number) {
	let sum = 0;
	let isEven = false;
	for (let i = card_number.length - 1; i >= 0; i--) {
	let digit = card_number[i];
	if (isEven) {
	digit *= 2;
	if (digit > 9) digit -= 9;
}
	sum += digit;
	isEven = !isEven;
}
	return sum % 10 === 0;
}
};

let userInput = prompt("Enter card number: ")

console.log(ATM_Card.visa(userInput));
console.log(ATM_Card.masterCard(userInput));
console.log(ATM_Card.discover(userInput));
console.log(ATM_Card.americanExpress(userInput));