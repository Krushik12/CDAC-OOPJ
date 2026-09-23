import java.io.Serializable;

public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
    private String name;
    private int age;
    private double salary;
    private String address;
    private String gender;

    public Employee(String name, int age, double salary,String address,String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.gender = gender;
    }

    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    	if(age<18 || age>60)
			this.age = 21;
		else
			this.age = age;	
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
    	if(salary<1000 || salary>100000) 
    		this.salary = 25000.00;
    		else
    			this.salary =salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Address:" + address);
        System.out.println("Gender:" + gender);

    }
}