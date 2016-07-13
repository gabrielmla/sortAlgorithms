package variationsOfOrdenacao;

public class BidirectionalBubbleSort {
	
	public void sort(int[] array, int leftIndex, int rightIndex) {
		int delimitador1 = leftIndex;
		int delimitador2 = rightIndex;
		
		while (delimitador1 < delimitador2) {
			
			for (int i = delimitador1; i < delimitador1; i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
				}
			}
			delimitador2--;
			
			for (int j = delimitador2; j > delimitador1; j--) {
				if (array[j] < array[j - 1] ) {
					int aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
			}
			delimitador1++;
		}
	}

}
