// Menstrual app tracker
const prompt = require("prompt-sync")();

console.log("MENSTRUAL CYCLE APP");
console.log("...calculate your monthly flow.");

let periodInput = prompt("\nEnter the start date of your last period (YYYY-MM-DD): ");

let cycleLength = prompt("Enter your average cycle length in days (21–35): ");

if (cycleLength < 21 || cycleLength > 35) {
console.log("Cycle length must be between 21 and 35 days.");
}

LocalDate nextPeriod = periodDate.plusDays(cycleLength);

Number ovulationDay = cycleLength / 2;
LocalDate ovulationDate = periodDate.plusDays(ovulationDay);

LocalDate fertileStart = ovulationDate.minusDays(3);
LocalDate fertileEnd = ovulationDate.plusDays(2);

console.log("\nMenstrual Cycle Prediction:");
console.log("Next period expected on: " + nextPeriod);
console.log("Estimated ovulation date: " + ovulationDate);
console.log("Fertile window: " + fertileStart + " to " + fertileEnd);
console.log("Relatively safe days (lower pregnancy risk):");
console.log("- Before fertile time: " + periodDate + " to " + fertileStart.minusDays(1));
console.log("- After fertile time: " + fertileEnd.plusDays(1) + " to " + nextPeriod);