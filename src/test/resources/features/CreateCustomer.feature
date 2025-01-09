Feature: Create Customer

@createNewCustomer
		 
Scenario:  Create New Customer by filling all fields
Given "Bank Manager" logs in to XYZ Bank Page
And selects add customer
When bank manager adds new customer
Then manager should be able to see new customer in customers section