package ordenacao;

public class InsertionSort {

	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) { // Percorre todo o array
			int j = i + 1; // A cada laço do for, vc cria um J que vai ser no elemento na frente do indice i
			while (j > 0 && j < array.length){ // Pra quando vc fazer j-- n quebrar e nem quando fizer j = i + 1
				if (array[j] < array[j-1]){ // Vai comparando o J com o anterior e se for menor vc troca até o começo
					int aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
				j--;
			}
		}
	}

}
