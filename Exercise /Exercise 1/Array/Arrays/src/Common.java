
public class Common {
	public void findCommon(int[] arr1, int[] arr2) {

        boolean found = false;

        System.out.println("Common elements:");

        for (int Temp = 0; Temp < arr1.length; Temp++) {

            for (int Temp1 = 0; Temp1 < arr2.length; Temp1++) {

                if (arr1[Temp] == arr2[Temp1]) {
                    System.out.print(arr1[Temp] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }
    }
}
