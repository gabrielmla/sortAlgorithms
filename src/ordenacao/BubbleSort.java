package ordenacao;

public class BubbleSort {
	
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] > array[i]){
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

}
