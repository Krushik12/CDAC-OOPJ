
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of array:: ");
		int size = ConsoleInput.getInt();
		
		int arr[] = new int [size];
		
		System.out.println("Enter the array Element:: ");
		
		for(int Temp = 0; Temp<size;Temp++) {
			
			arr[Temp] = ConsoleInput.getInt();
		}
		
		
		for(int Temp = 0; Temp<size;Temp++) {
			
			System.out.print(arr[Temp] + " ");
			
		}
		System.out.println();
	
		int arr2[] = new int [size];
		
		System.out.println("Enter the array Second Element:: ");
		
		for(int Temp1 = 0; Temp1<size;Temp1++) {
			
			arr2[Temp1] = ConsoleInput.getInt();
		}
		
		for(int Temp1 = 0; Temp1<size;Temp1++) {
			
			System.out.print(arr2[Temp1] + " ");
			
		}			
		
	
//sort
		sort obj = new sort();
        obj.sortArray(arr);
		System.out.println("Sort: ");
		
		for(int Temp = 0; Temp<size;Temp++) {
			
			System.out.print(arr[Temp] + " ");
			
		}
//sum		
		System.out.println();
		sum obj2 = new sum();

        int result = obj2.sumArray(arr);

        System.out.println("Sum of array elements = " + result);
		
		
		
		System.out.println();
//average		
		System.out.print( "Average is " + result/size);
		
		System.out.println();
		
		
		
//copyarray	
		
		Copy obj3 = new Copy();

        int[] copiedArray = obj3.copyArray(arr);
		
		
		System.out.println("Copy array");
		
		for(int Temp = 0; Temp<size;Temp++) {
			
			System.out.print(copiedArray[Temp] + " ");
			
		}
		
		
//min max
		
		System.out.println();
		MinMax obj4 = new MinMax();

        obj4.findMinMax(arr);
		
		
		
		
//Reverse array
		System.out.println();
		Reverse obj5 = new Reverse();

        int[] reversedArray = obj5.reverseArray(arr);

        System.out.println("Reversed Array:");

        for (int Temp = 0; Temp < size; Temp++) {
            System.out.print(reversedArray[Temp] + " ");
        }		
		
		
		System.out.println();
		
//Duplicate integer
		
		DuplicateI obj6 = new DuplicateI();

        obj6.findDuplicates(arr);
        
		
		
		
		System.out.println();	
//Duplicate integer
		
		DuplicateV obj7 = new DuplicateV();

		obj7.findDuplicates(arr);
		
//Common
		Common obj8 = new Common();

	     obj8.findCommon(arr, arr2);
	
		
	
		

	
	}
	
}
