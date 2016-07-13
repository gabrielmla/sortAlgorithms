package ordenacao;

public class SelectionSort {
	
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = i + 1;
			int menor = i;
			
			while (j < array.length) {
				if (array[j] < array[menor]){
					menor = j;
				}
				j++;
			}
			
			if (i != menor){
				int aux = array[i];
				array[i] = array[menor];
				array[menor] = aux;
			}
		}
		
	}

}
