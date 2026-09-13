
public class Complex {

	
	private int real;
	private int imaginary;
	
	public Complex(int real,int imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
		
	}
	
	public Complex Sum(Complex c) {
		return new Complex(
			this.real + c.real,
			this.imaginary + c.imaginary
				);
		
	}
	public Complex Difference(Complex c) {
		return new Complex(
			this.real - c.real,
			this.imaginary - c.imaginary
			);	
		
	}

	public Complex Product(Complex c) {
		int r = (this.real * c.real) - (this.imaginary * c.imaginary);
        int i = (this.real * c.imaginary) + (this.imaginary * c.real);

        return new Complex(r, i);
		
	}
	
	public void display() {
		
		System.out.println(real + " + " + imaginary + "i");
	}
}
