/*
 ######################## Banking Application ########################
Scenario: You are a back end developer and need to create an application to handle new customer bank account requests.
 
The application should do the following:
- Read a .csv file of names, social security numbers, account type. and initial deposit
- Use a proper data structure to hold all these accounts
- Both savings and checking accounts share the following properties.
	deposit()
 	withdraw()
	transfer()
	showinfo()
 		
11-digit account number (generated with the following process: 1 or 2 depending on Saving or Checking, last two digits of SSN, unique 5digit number and random 3-digit number)
 
- Savings account holders are given a Safety Deposit Box, identified by a 3 digit number and accessed with 4 digit code
- Checking account holders are assigned a Debit Card with 12 digit number and 4 digit PIN
- Both accounts will use an interface that determines the base interest rate.
	Savings accounts will use .25 point less than the base rate
	Checking accounts will use 15% of the base rate
- The ShowInfo() method should reveal relevant account information as well as information specific to the Checking account or Savings account

Implementation of this project demonstrate...
- Learn to develop a robust application architecture
- Use when to use abstract classes and abstract methods
- Use an interface API to receive information from a developer's application
- Explore constructors deeper and use the super() keyword
- Explore access modifiers and when to use public, private and protected
- Read data from a file and store in an appropriate data structure
- Generate random numbers and work with String API
*/
package bankingapplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account>  accounts = new LinkedList<Account>();
		
		String file = "src/resources/NewBankAccounts.csv";

		// Read a csv file and create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")) {
//				System.out.println("Open a Saving Account");
				accounts.add(new Saving(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
//				System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}
		}
		
		for (Account acc : accounts) {
			acc.showInfo();
		}
	}

}

