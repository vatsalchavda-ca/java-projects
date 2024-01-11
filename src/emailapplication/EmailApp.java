package emailapplication;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Doe");
		
//		em1.setAlternateEmail("john.doe@gmail.com");
//		System.out.println("The alternate email is: " + em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
	}

}
