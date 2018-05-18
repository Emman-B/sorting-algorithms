package eb.tools;

public class ArrayToolkit {
	/**
	 * class is created to assist with
	 * array modification
	 */

	private ArrayToolkit() {
		//prevents instantiation
	}

	//swaps two objects at certain indices
	public static void swap(Object[] array, int firstIndex, int secondIndex) {
		Object temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}

	//reverses an object array (returns nothing)
	public static void reverse(Object[] array) {
		Object[] tempArray = getReverse(array); //new array in reverse
		array = new Object[tempArray.length]; //reset original array
		for (int i = 0; i < tempArray.length; i++) {
			array[i] = tempArray[i];
		}
	}

	//returns an object array that has been reversed
	public static Object[] getReverse(Object[] array) {
		Object[] tempArray = new Object[array.length];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[(array.length - 1) - i];
		}
		return tempArray;
	}

	//checks if it is sorted in ascending order
	public static boolean isSorted(Comparable[] array) {
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