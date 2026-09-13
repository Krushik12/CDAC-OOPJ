
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Member member = new Member();

	        System.out.println("Enter Member Details");

	        System.out.print("Enter Name: ");
	        member.setName(ConsoleInput.getString());

	        System.out.print("Enter Age: ");
	        member.setAge(ConsoleInput.getInt());

	        System.out.print("Enter Phone Number: ");
	        member.setPhoneNumber(ConsoleInput.getString());

	        System.out.print("Enter Address: ");
	        member.setAddress(ConsoleInput.getString());

	        System.out.print("Enter Salary: ");
	        member.setSalary(ConsoleInput.getDouble());

	        
	        System.out.println("\n--- Member Details ---");

	        System.out.println("Name: " + member.getName());
	        System.out.println("Age: " + member.getAge());
	        System.out.println("Phone Number: " + member.getPhoneNumber());
	        System.out.println("Address: " + member.getAddress());

	        member.printSalary();


	        // Creating object of PrimeMembers class
	        PrimeMembers prime = new PrimeMembers();

	        System.out.println("\nEnter Prime Member Details");

	        System.out.print("Enter Name: ");
	        prime.setName(ConsoleInput.getString());

	        System.out.print("Enter Age: ");
	        prime.setAge(ConsoleInput.getInt());

	        System.out.print("Enter Phone Number: ");
	        prime.setPhoneNumber(ConsoleInput.getString());

	        System.out.print("Enter Address: ");
	        prime.setAddress(ConsoleInput.getString());

	        System.out.print("Enter Salary: ");
	        prime.setSalary(ConsoleInput.getDouble());

	        System.out.print("Enter Joining Year: ");
	        prime.setJoiningYear(ConsoleInput.getInt());

	        System.out.print("Enter Joining Fees: ");
	        prime.setJoiningFees(ConsoleInput.getDouble());

	        System.out.print("Is Active (true/false): ");
	        prime.setActive(ConsoleInput.getBoolean());

	        // Display all details
	        prime.display();
	}

}
