# task_seven
import math

for number in range(1, 11):
	if number % 4 == 0:
		for numbers in range(1, 6):
			print(int(math.pow(number, numbers)), end = " ")