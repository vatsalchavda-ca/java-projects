package emailapplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "mycompany";
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	// Constructor to receive the First and Last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department and then return the department
		this.department = this.setDepartment();
		System.out.println("Entered Department is: " + this.department);
		
		// Call a method that returns a random password.
		this.password = this.randomPassword(this.defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "."+ lastName.toLowerCase() + "." + department + "@" + companySuffix + ".com";
		System.out.println("Generated Email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("Department Codes:\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter Department Code:\t");
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt(); 
		if(depChoice == 1) { return "sales"; }
		else if(depChoice == 2) { return "development"; }
		else if(depChoice == 3) { return "accounting"; }
		else { return ""; }
		
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMONPQRSTUVWXYZ1234567890!@#$%&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity (int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate Email address
	public void setAlternateEmail(String altRmail) {
		this.alternateEmail = altRmail;
	}
	
	// Change the password
	public void changePassword (String password) {
		this.password = password;
	}

	// Getter
	public int getMailboxCapacity () {
		return mailboxCapacity;
	}
	
	// Getter
	public String getAlternateEmail () {
		return alternateEmail;
	}
	
	// Getter
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name:" + firstName + " " + lastName + "\n" +
				"Company Email: " + email + "\n" +
				"Mailbox capacity: " + mailboxCapacity;
		
	}
}
 