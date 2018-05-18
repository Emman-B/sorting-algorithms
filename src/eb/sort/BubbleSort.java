package eb.sort;

import eb.tools.*;

public class BubbleSort {
	private BubbleSort() {
		//prevents instantiation
	}

	public static void sort(Comparable[] array) {
		while (!ArrayToolkit.isSorted(array)) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					ArrayToolkit.swap(array, i, i + 1);
				}
			}
		}
	}
}