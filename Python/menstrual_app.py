from datetime import datetime, timedelta, date

print("MENSTRUAL CYCLE APP")
print("...calculate your monthly flow.")

period_input = input("\nEnter the start date of your last period (YYYY-MM-DD): ")

period_date = datetime.strptime(period_input, "%Y-%m-%d").date()


cycle_length = int(input("Enter your average cycle length in days (21–35): "))

def calculate_cycle(period_start: date, cycle_length: int):
	if not (21 <= cycle_length <= 35):
		print("Cycle length must be between 21 and 35 days.")

	next_period = period_start + timedelta(days=cycle_length)
	ovulation_date = period_start + timedelta(days=cycle_length // 2)
	fertile_start = ovulation_date - timedelta(days=3)
	fertile_end = ovulation_date + timedelta(days=2)
	safe_before = fertile_start - timedelta(days=1)

	return {
		"next_period": next_period,
		"ovulation_date": ovulation_date,
		"fertile_start": fertile_start,
		"fertile_end": fertile_end,
		"safe_before_end": safe_before,
		"safe_after_start": fertile_end + timedelta(days=1)
	}


result = calculate_cycle(period_date, cycle_length)


print("\nMenstrual Cycle Prediction:")
print(f"Next period expected on: {result['next_period']}")
print(f"Estimated ovulation date: {result['ovulation_date']}")
print(f"Fertile window: {result['fertile_start']} to {result['fertile_end']}")
print("Relatively safe days (lower pregnancy risk):")
print(f"- Before fertile window: {period_date} to {result['safe_before_end']}")
print(f"- After fertile window: {result['safe_after_start']} to {result['next_period']}")
