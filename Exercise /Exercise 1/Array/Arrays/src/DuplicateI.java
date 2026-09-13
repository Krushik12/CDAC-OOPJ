
public class DuplicateI {
	 public void findDuplicates(int[] arr) {
		 System.out.print("Duplicate Integer ");
		 boolean found = false;
			
			for(int Temp = 0;Temp <arr.length; Temp++) {
				for(int Temp1 = Temp + 1;Temp1<arr.length;Temp1++) {
					if(arr[Temp]==arr[Temp1]) {
					System.out.print(arr[Temp]+" ");
					found = true;
					break;
					
								
					}
				}
			}
			if (!found) {
				System.out.print("Not found ");
			}
	 }

}
