package eb.sort;

public class BubbleSort {
	private BubbleSort() {
		//prevents instantiation
	}

	public static void sort(Comparable[] array) {
		while (!isSorted(array)) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					Comparable temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}
	//====================================================================================================//
	private static boolean isSorted(Comparable[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].compareTo(array[i + 1]) <= 0) {
				continue; //continue if ascending order
			}
			else {
				return false;
			}
		}
		return true; 
	}
}