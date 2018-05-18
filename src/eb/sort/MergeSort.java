package eb.sort;

import eb.tools.*;

public class MergeSort {
	private MergeSort() {
		//prevents instantiation
	}
	
	public static void sort(Comparable[] array) {
		Comparable[] tempArray = new Comparable[array.length];
		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = array[i];
		}
		mergeSort(array, tempArray, 0, array.length - 1);
	}

	//====================================================================================================//
	private static void mergeSort(Comparable[] array, Comparable[] tempArray, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(array, tempArray, first, mid);
			mergeSort(array, tempArray, mid + 1, last);
			merge(array, tempArray, first, mid, last);
		}
	}

	private static void merge(Comparable[] array, Comparable[] tempArray, int first, int mid, int last) {
		//First half
		int firstF = first;
		int firstL = mid;
		//Second half
		int secondF = mid + 1;
		int secondL = last;

		int index = first; //for reading index of array

		//Swapping occurs here
		while (firstF <= firstL && secondF <= secondL) { //swap here
			if (array[firstF].compareTo(array[secondF]) < 0) {
				tempArray[index] = array[firstF]; //copy smaller element into array
				firstF++;
			} else {
				tempArray[index] = array[secondF]; //copy smaller/equal element into tempArray
				secondF++;
			}
			index++; //increment index
		}

		//Start copying remaining elements
		if (firstF > firstL) {
			//copy second half's elements
			while (secondF <= secondL) {
				tempArray[index] = array[secondF]; //move remaining elements
				secondF++; //increment second half index
				index++; //increment index
			}
		} else if (secondF > secondL) {
			while (firstF <= firstL) {
				tempArray[index] = array[firstF]; //move remaining elements
				firstF++; //increment first half index
				index++; //increment index
			}
		}

		//copy to original array
		for (int i = first; i < array.length; i++) {
			array[i] = tempArray[i];
		}
	}
}