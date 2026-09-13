
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter real part of first complex number: ");
        int real1 = ConsoleInput.getInt();

        System.out.print("Enter imaginary part of first complex number: ");
        int imag1 = ConsoleInput.getInt();

        System.out.print("Enter real part of second complex number: ");
        int real2 = ConsoleInput.getInt();

        System.out.print("Enter imaginary part of second complex number: ");
        int imag2 = ConsoleInput.getInt();
        
        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex sumResult = c1.Sum(c2);
        Complex differenceResult = c1.Difference(c2);
        Complex productResult = c1.Product(c2);
        
        System.out.print("\nSum: ");
        sumResult.display();

        System.out.print("Difference: ");
        differenceResult.display();

        System.out.print("Product: ");
        productResult.display();
        
	}

}
