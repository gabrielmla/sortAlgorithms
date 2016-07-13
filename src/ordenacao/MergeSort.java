package ordenacao;

public class MergeSort {

	public void sort(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int meio = leftIndex + (rightIndex - leftIndex) / 2;
			sort(array, leftIndex, meio);
			sort(array, meio + 1, rightIndex);
			merge(array, leftIndex, meio, rightIndex);
		}
	}

	private int[] merge(int[] array, int leftIndex, int meio, int rightIndex) {
		int[] aux = new int[array.length];

		for (int i = leftIndex; i < array.length; i++) {
			aux[i] = array[i];
		}

		int i, j, k;
		i = leftIndex;
		j = meio + 1;
		k = leftIndex; // Array Original

		while (i <= meio && j <= rightIndex) {
			if (aux[i] < aux[j]) {
				array[k++] = aux[i++];
			} else {
				array[k++] = aux[j++];
			}
		}

		while (j <= rightIndex) {
			array[k++] = aux[j++];
		}

		while (i <= meio) {
			array[k++] = aux[i++];
		}

		return aux;
	}

}
