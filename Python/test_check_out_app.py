import unittest
from check_out_app import CheckOutAppFunctions

class TestCheckOutApp(unittest.TestCase):

	def test_check_out_app_setUp(self):
		self.checkout = CheckOutAppFunctions()

	def test_that_check_out_app_functions_works(self):
		self.assertTrue(callable(CheckOutAppFunctions.get_store_details))
		self.assertTrue(callable(CheckOutAppFunctions.print_customer_invoice))
		self.assertTrue(callable(CheckOutAppFunctions.print_customer_receipt))

	def test_get_store_details(self):
		self.assertTrue("\nSEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: 03938373320 \n{datetime.now()}")

	def test_print_customer_invoice(self):
		checkout = CheckOutAppFunctions("Rice", "2", "1100", "John Floss", "Jose", "0.08")
		result = checkout.print_customer_invoice