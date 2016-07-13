package ordenacao;

/**
 * Merge sort is based on the divide-and-conquer paradigm. The algorithm
 * consists of recursively dividing the unsorted list in the middle, sorting
 * each sublist, and then merging them into one single sorted list. Notice that
 * if the list has length == 1, it is already sorted.
 */
public class MergeSortBeta {

	public void sort(int[] array, int leftIndex, int rightIndex) {
		if (rightIndex <= leftIndex) {
			return;
		}
		int meio = leftIndex + (rightIndex - leftIndex) / 2;
		sort(array, leftIndex, meio);
		sort(array, meio + 1, rightIndex);
		merge(array, leftIndex, meio, rightIndex);
	}

	private int[] merge(int[] array, int leftIndex, int meio, int rightIndex) {
		int[] aux = new int[array.length];

		for (int i = leftIndex; i < array.length; i++) {
			aux[i] = array[i];
		}

		int i, j, k;
		i = leftIndex;
		j = meio + 1;
		k = leftIndex;

		while (i <= meio && j <= rightIndex) {
			if (aux[i] < aux[j]) {
				array[k] = aux[i];
				i++;
			} else {
				array[k] = aux[j];
				j++;
			}
			k++;
		}

		while (i <= meio) {
			array[k] = aux[i];
			i++;
			k++;
		}

		return aux;
	}

}
