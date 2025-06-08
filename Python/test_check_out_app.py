import unittest
from check_out_app import CheckOutAppFunctions

class TestCheckOutApp(unittest.TestCase):

	def setUp(self):
		self.checkout = CheckOutAppFunctions()

	def test_that_check_out_app_exists(self):
		self.assertIsInstance(self.checkout, CheckOutAppFunctions)

