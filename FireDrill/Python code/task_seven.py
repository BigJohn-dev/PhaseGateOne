# task_seven
import math

for number in range(1, 11):
	if number % 4 == 0:
		sum = 0
		for numbers in range(1, 6):
			sum += int(math.pow(number, numbers))

		print(sum, end = " ")