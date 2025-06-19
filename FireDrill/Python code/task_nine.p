# task_nine
import math

total = 0
for number in range(1, 11):
	if number % 4 == 0:
		sum = 0
		for numbers in range(1, 6):
			sum += int(math.pow(number, numbers))
		total += sum
		
print(total * total)