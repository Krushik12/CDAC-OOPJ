
public class Employee {
	private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // Constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee information
    public void display() {
        System.out.println(name + "\t" + yearOfJoining + "\t\t" + salary + "\t" + address);
    }
}
