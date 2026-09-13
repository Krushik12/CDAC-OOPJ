
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

        System.out.print("Enter salary: ");
        double salary = ConsoleInput.getInt();

        System.out.print("Enter number of working hours per day: ");
        int hours = ConsoleInput.getInt();

        Employee emp = new Employee();

        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();

        System.out.println("Final Salary: $" + emp.getSalary());
	}

}
