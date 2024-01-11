package bankingapplication;

public class Checking extends Account {
	// List properties specific to checking accounts
	private int debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking (String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
//		System.out.println("Account number is: " + this.accountNumber);
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
//		System.out.println("Implement rate for checking");
	}
	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to checking account
	public void showInfo() {
		System.out.println("\nAccount Type is Checking");
		super.showInfo();
		System.out.println("Your Checking account features" + 
				"\n Debit Card Number is: " + debitCardNumber + 
				"\n Debit Card pin is: " + debitCardPin);
	}
}
