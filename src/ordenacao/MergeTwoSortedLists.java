package ordenacao;

public class MergeTwoSortedLists {
	
	public int[] mergeVector(int[] A, int[] B) {
		int sizeTotal = A.length + B.length;
		int[] aux = new int[sizeTotal];
		
		int i = 0; // Indice do A
		int j = 0; // Indice do B
		int k = 0; // Indice do merge
		
		while(i < A.length && j < B.length) {
			if(A[i] < B[j]) {
				aux[k] = A[i];
				i++;
			} else {
				aux[k] = B[j];
				j++;
			}
			k++;
		}
		
		while(i < A.length){
			aux[k] = A[i];
			i++;
			k++;
		}
		
		while(j < B.length){
			aux[k] = B[j];
			j++;
			k++;
		}
		
		return aux;
	}

}
