
public class sort {
	public void sortArray(int[] arr) {

		for (int Temp = 0; Temp < arr.length; Temp++) {
        	int minIndex = Temp;
            for (int Temp1 = Temp; Temp1 < arr.length; Temp1++) {

                if (arr[minIndex] > arr[Temp1]) {

                    int temp = arr[minIndex];
                    arr[minIndex] = arr[Temp1];
                    arr[Temp1] = temp;
                }
            }
        }
    }

}
