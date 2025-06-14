// Computing Students grade application
const prompt = require("prompt-sync")();

function printSummary(scores) {

	console.log("=".repeat(99));

	let numStudent = scores.length;
	let numSubject = scores[0].length;

	let total = [];
	let average = [];
	let position = [];

	let displayLine = "\nSTUDENT\t\t";
	for(let i = 0; i < numStudent; i++) displayLine += `SUBJECT${i + 1}\t`;
	displayLine += "TOTAL\tAVERAGE\tPOSITION";

	console.log(displayLine);

	console.log("=".repeat(99));

	for(let count = 0; count < numStudent; count++) {
	  let sum = 0;
	  for(let counter = 0; counter < numSubject; counter++) {
	     sum += scores[count][counter];
}
	let averages = sum / numSubject;
	total[count] = total;
	average[count] = averages;
}

	for(let i = 0; i < numStudent; i++) {
	   let first = 1;
	   for(let j = 0; j < numStudent; j++){
	      if(total[j] > total[i]) first++;
}
	  position[i] = first;
}

	for (let i = 0; i < numStudent; i++) {
		console.log("\nStudent " + (i + 1) + "\t");
            for (let j = 0; j < numSubject; j++) {
                console.log(scores[i][j] + "\t\t");
}
            console.log(total[i]);
            console.log("\t" + Math.round(average[i]));
            console.log("\t\t" + position[i]);
}
}

function main() {

	console.log(" __- LAGBAJA HIGH SCHOOL -__ ");
	console.log("...managing classroom grades\n");

	let numStudent = Number(prompt("Enter number of students: "));
	let numSubject = Number(prompt("Enter number of subjects: "));

	let scores = [];

	for (let count = 0; count < numStudent; count++) {
		console.log("\nEnter score for Student " + (count + 1));
		scores[count] = [];
		for(let counter = 0; counter < numSubject; counter++) {
		while(true) {
			let score = Number(prompt("Enter score for subject " + (counter + 1) + ": "));
			if (score >= 0 && score <= 100) {
			scores[count][counter] = score;
			break;
} else {
		console.log("Invalid score. Please enter a valid score between 0 and 100");
}
}
}
}
		console.log(printSummary(scores));
}

main();