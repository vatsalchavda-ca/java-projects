package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentId;
	private String courses; // TODO try to add an array of String to store courses
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nEnter student\'s First Name: ");		
		this.firstName = in.nextLine();
		
		System.out.print("Enter student\'s Last Name: ");		
		this.lastName = in.nextLine();
		
		System.out.print("Enter student\'s Gread Year:\n1 - Primary\n2 - Highschool\n3 - Higher Secondary\n4 - Collage ");		
		this.gradeYear = in.nextInt();
		
		setStudentId();
		System.out.println("Full Name: " + firstName + " " + lastName + "\nGrade Year: " + gradeYear + "\nStudent Id:" + StudentId);
	}
	
	// Generate student Id
	private void setStudentId() {
		// Grade level + id
		id ++;
		this.StudentId = gradeYear + "" + id;
	}
	
	// Enroll student in courses
	public void enroll() {
		do {
			System.out.print("Enter course name to enroll. (Q/q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			int index = 0;
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
			
		} while (1 != 0);
//		System.out.println("Enrolled in: " + courses + "\nTuition balance: " + tuitionBalance);
		viewBalance();
	}
	
	// View balance 
	public void viewBalance() {
		System.out.print("Your balance is: " + tuitionBalance);
	}
	
	// Pay tuition fees
	public void payTuition () {
		System.out.print("\nEnter your payment amount in $: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $" + payment);
		viewBalance();
	}
	
	// Show final information
	public void showInfo () {
		System.err.println("\n\nStudent Name: " + firstName + " " + lastName + 
				"\nStudent Id: " + StudentId + 
				"\nStudent Grade: " + gradeYear +
				"\nCourses Enrolled: " + courses +
				"\nTuition Fees: " + tuitionBalance);
	}
	
}
