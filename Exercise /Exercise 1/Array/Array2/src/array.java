
public class array {

	public static void main(String[] args) {
		
		ComplexNumber[] arr= new ComplexNumber[5];
		for(int Temp=0; Temp<arr.length;Temp++) {
			arr[Temp]= new ComplexNumber();
			
			System.out.print("Enter number1 for object" + (Temp +1)+ ": ");
			int num1 = ConsoleInput.getInt();			
			
			System.out.print("Enter number2 for object" + (Temp +1)+ ": ");
			int num2 = ConsoleInput.getInt();	
			
			arr[Temp].setNumber1(num1);
			arr[Temp].setNumber2(num2);
			
			
		}
		System.out.println();
		for(int Temp =0; Temp<arr.length;Temp++) {
			int result = arr[Temp].computeComplexNumber();
			
			System.out.println("Result :" + result);
			
		}
		
	

	
	}

}
