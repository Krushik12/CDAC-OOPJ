
public class Program {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s1 = new Student();
	
	s1.name = "John";
	s1.roll_no =2;
	
	System.out.println("Part A:");
    System.out.println("Name: " + s1.name);
    System.out.println("Roll No: " + s1.roll_no);	
	
    Student s2 = new Student();
    Student s3 = new Student();
    
    s2.name = "Sam";
    s2.roll_no = 1;
    s2.phone_no = "9874561352";
    s2.address = "Valsad";
    
    s3.name = "John";
    s3.roll_no = 2;
    s3.phone_no = "9874845352";
    s3.address = "Ahmedabad";
    System.out.println("\nPart B:");

    System.out.println("Student 1:");
    System.out.println("Name: " + s2.name);
    System.out.println("Roll No: " + s2.roll_no);
    System.out.println("Phone No: " + s2.phone_no);
    System.out.println("Address: " + s2.address);

    System.out.println("\nStudent 2:");
    System.out.println("Name: " + s3.name);
    System.out.println("Roll No: " + s3.roll_no);
    System.out.println("Phone No: " + s3.phone_no);
    System.out.println("Address: " + s3.address);   
    
		
	}

}
