
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter Length of Rectangle: ");
	        double length = ConsoleInput.getDouble();

	        System.out.println("Enter Breadth of Rectangle: ");
	        double breadth = ConsoleInput.getDouble();

	        Rectangle rectangle = new Rectangle(length, breadth);

	        System.out.println("\n--- Rectangle Details ---");
	        rectangle.printArea();
	        rectangle.printPerimeter();


	      
	        System.out.println("\nEnter Side of Square: ");
	        double side = ConsoleInput.getDouble();

	        Square square = new Square(side);

	        System.out.println("\n--- Square Details ---");
	        square.printArea();
	        square.printPerimeter();
	}

}
