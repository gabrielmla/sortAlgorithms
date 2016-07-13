package ordenacao;

import ordenacao.CountingSort;

public class RadixSort {
	
	public void sort(int[] array) {
		CountingSort counting = new CountingSort();
		for (int i = 0; i < maior(array); i++) {
			counting.sort(array, i); 
		}
		
	}
	
	private int maior(int[] array) {
		int maior = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		return String.valueOf(maior).length();
	}

}
