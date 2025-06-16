from banke_atm import account, atm_main
import unittest

class testbanke_atm(unittest.TestCase):

	def test_banke_atm_setUp(self):
		atm = atm_main()
	
	def test_that_function_exist(self):
		self.assertTrue(callable(atm_main.create_account))
		self.assertTrue(callable(atm_main.close_account))
		self.assertTrue(callable(atm_main.get_account))
		self.assertTrue(callable(atm_main.transfer))
		self.assertTrue(callable(account.deposit))
		self.assertTrue(callable(account.withdraw))
		self.assertTrue(callable(account.check_balance))
		self.assertTrue(callable(account.change_pin))

	def test_create_account(self):
		result = self.atm_main.create_account("JOHN", "BILLS", "2211")
		self.assertEqual(self.atm_main.create_account, "JOHN", "BILLS", "2211")
		self.assertIn("\nAccount successfully created for JOHN BILLS")

	def test_deposit_money(self):
		result = self.account.deposit_money(1000)
		self.assertEqual(self.account.check_balance, 1000.0)