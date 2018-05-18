package eb.sort;

import eb.tools.*;

public class SelectionSort {
	private SelectionSort() {
		//prevents instantiation
	}

	public static void sort(Comparable[] array) {
		for (int i = 0; i < array.length; i++) {
			Comparable minimum = array[i]; //set minimum to i
			int minIndex = i;
			for (int compare = i; compare < array.length; compare++) { 
				if (minimum.compareTo(array[compare]) > 0) {
					minimum = array[compare]; //new minimum
					minIndex = compare; //record index
				}

				//last item only
				if (compare == array.length - 1) {
					ArrayToolkit.swap(array, i, minIndex);
				}
			}
		}
	}
}