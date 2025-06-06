import unittest
from datetime import date
from menstrual_app import calculate_cycle

class TestMenstrualApp(unittest.TestCase):

	def test_that_menstrual_app_exist(self):
		result = calculate_cycle(date(2025, 6, 1), 28)
		self.assertIn("next_period", result)  # basic key presence check

	def test_normal_cycle(self):
		start = date(2025, 6, 1)
		cycle = 28
		result = calculate_cycle(start, cycle)

		self.assertEqual(result["next_period"], date(2025, 6, 29))
		self.assertEqual(result["ovulation_date"], date(2025, 6, 15))
		self.assertEqual(result["fertile_start"], date(2025, 6, 12))
		self.assertEqual(result["fertile_end"], date(2025, 6, 17))
		self.assertEqual(result["safe_before_end"], date(2025, 6, 11))
		self.assertEqual(result["safe_after_start"], date(2025, 6, 18))