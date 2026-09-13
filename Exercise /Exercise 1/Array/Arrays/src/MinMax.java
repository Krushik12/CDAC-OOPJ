
public class MinMax {
	 public void findMinMax(int[] arr) {
		 
		 int minElement =arr[0];
			int maxElement = arr[0];
			
			for(int Temp = 0; Temp <arr.length;Temp++) {
				if(arr[Temp]< minElement)
					minElement =arr[Temp];
				else
					maxElement=arr[Temp];
				
				
			}
			System.out.println("Min Element  "+minElement );
			System.out.println("Max Element  "+maxElement );
		 
	 }

}
