
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee
				("Robert", 1994, 30000,"64C-WallsStreat");

	        Employee emp2 = new Employee(
	            "Sam", 2000,40000, "68D-WallsStreat"
	        );

	        Employee emp3 = new Employee(
	            "John", 1999,50000, "26B-WallsStreat"
	        );

	        System.out.println("Name\tYear of joining\tSalary\tAddress");
	        
	        emp1.display();
	        emp2.display();
	        emp3.display();
	}

}
