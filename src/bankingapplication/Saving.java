package bankingapplication;

public class Saving extends Account{
	// List properties specific to savings accounts
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize savings account properties
	public Saving (String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
//		System.out.println("Account number is: " + this.accountNumber);
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .15;
//		System.out.println("Implement rate for saving");
	}

	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
//		System.out.println("Safety Deposit Box Id: " + safetyDepositBoxId + "\nSafety Deposit Box Key: " + safetyDepositBoxKey);
	}
	
	// List any methods specific to savings account
	public void showInfo() {
		System.out.println("Account Type is Saving");
		super.showInfo();
		System.out.println("Your Savings account features" + 
		"\n Safety Deposit Box Id is: " + safetyDepositBoxId + 
		"\n Safety Deposit Box Key is: " + safetyDepositBoxKey);
	}

}
