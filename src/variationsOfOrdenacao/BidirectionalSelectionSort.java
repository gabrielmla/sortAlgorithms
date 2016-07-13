package variationsOfOrdenacao;

public class BidirectionalSelectionSort {
	
	public void sort(int[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++){
			int menor = i;
			int maior = i;
			
			for (int j = i + 1; j <= rightIndex; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}
			}
			
			if (maior != i) {
				int aux = array[maior];
				array[maior] = array[rightIndex - i];
				array[rightIndex - i] = aux;
			}
			
			
			for (int k = rightIndex - i; k >= leftIndex; k--) {
				if (array[k] < array[maior]) {
					maior = k;
				}
			}
			
			if (menor != i) {
				int aux = array[menor];
				array[menor] = array[i];
				array[i] = aux;
			}
		}
	}

}
