package ordenacao;

public class QuickSort {
	
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
		
		for (int j = i + 1; j <= rightIndex; j++) {
			if (array[j] < pivot) {
				i++;
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
		}
		
		if (pivot != array[i]) {
			int aux = pivot;
			pivot = array[i];
			array[i] = aux;
		}
		
		return i;
	}

}
