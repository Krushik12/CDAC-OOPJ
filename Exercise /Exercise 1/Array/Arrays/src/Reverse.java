
public class Reverse {
	public int[] reverseArray(int[] arr) {

        int[] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }

        return reverse;
    }
}
