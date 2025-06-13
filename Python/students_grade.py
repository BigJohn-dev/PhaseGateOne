# Computing student grade application

class grade_function:

	def print_summary(scores):
		num_students = len(scores)
		num_subjects = len(scores[0])

		totals = []
		averages = []
		positions = [0] * num_students

		for student_scores in scores:
			total = sum(student_scores)
			average = total / num_subjects
			totals.append(total)
			averages.append(average)

		for i in range(num_students):
			first = 1
			for j in range(num_students):
				if totals[j] > totals[i]:
 					first += 1
			
			positions[i] = first

		print("=" * 60)
		print("STUDENT\t" + "\t".join([f"SUB{n+1}" for n in range(num_subjects)]) + "\tTOTAL\tAVERAGE\tPOSITION")
		print("=" * 60)

		for i in range(num_students):
			row = [f"Student {i + 1}"]
			row += [str(score) for score in scores[i]]
			row += [str(totals[i]), f"{averages[i]:.2f}", str(positions[i])]
			print("\t".join(row))


def main():
	students_grade = grade_function()

	print(" __- LAGBAJA HIGH SCHOOL -__")
	print("...managing classroom grades")

	num_student = int(input("\nEnter number of students: "))
	num_subject = int(input("Enter number of subjects: "))

	scores = []

	for student_index in range(num_student):
		print(f"\nEnter scores for Student {student_index + 1}")
		for subject_index in range(num_subject):
			while True:
				score = int(input(f"Enter score for Subject {subject_index + 1}: "))
				if 0 <= score <= 100:
					scores.append(score)
					break
				else:
					print("Invalid score. Please enter a score between 0 and 100.")

	students_grade.print_summary(scores)


if __name__ == "__main__":
	main()
