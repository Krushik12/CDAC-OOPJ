
public class Copy {
	 public int[] copyArray(int[] arr) {
		 int cpyarr[] = new int [arr.length];
		 for(int Temp = 0; Temp<arr.length;Temp++) {
				
				cpyarr[Temp]=arr[Temp];
				
			}

	        return cpyarr;
	    }
}
