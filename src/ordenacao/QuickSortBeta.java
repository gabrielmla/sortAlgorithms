package ordenacao;

/**
 * Quicksort is based on the divide-and-conquer paradigm.
 * The algorithm chooses a pivot element and rearranges the elements of the
 * interval in such a way that all elements lesser than the pivot go to the
 * left part of the array and all elements greater than the pivot, go to the
 * right part of the array. Then it recursively sorts the left and the right parts.
 * Notice that if the list has length == 1, it is already sorted.
 */
public class QuickSortBeta {

	public void sort(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int pivot = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivot - 1);
			sort(array, pivot + 1, rightIndex);
		}
	}

	private int partition(int[] array, int leftIndex, int rightIndex) {
		int pivot = array[leftIndex];
		int i = leftIndex;
		int j = i + 1;
		
		while (j <= rightIndex) {
			if (array[j] < pivot) {
				i++;
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
			j++;
		}
		
		int aux = array[leftIndex];
		array[leftIndex] = array[i];
		array[i] = aux;
		
		return i;
	}
	
}