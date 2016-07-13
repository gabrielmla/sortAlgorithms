package variationsOfOrdenacao;

import java.util.Arrays;

public class QuickSortMedianaDeTres {
	
	public void sort(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int meio = medianaDeTres(array, leftIndex, rightIndex);
			
			swap(array, meio, rightIndex - 1);
			
			int pivot = partition(array, leftIndex + 1, rightIndex - 1);
			
			sort(array, leftIndex, pivot - 1);
			sort(array, pivot + 1, rightIndex);
		}
	}
	
	private int partition(int[] array, int leftIndex, int rightIndex) {
		swap(array, leftIndex, rightIndex);
		
		int pivot = array[leftIndex];
		int i = leftIndex;
		
		for (int j = i + 1; j <= rightIndex; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}
		
		if (array[i] != pivot) {
			swap(array, leftIndex, i);
		}
		
		return i;
	}
	
	 private int medianaDeTres(int[] array, int leftIndex, int rightIndex) {
	        int middle = leftIndex + (rightIndex - leftIndex + 1 ) / 2;
	       
	        if(array[rightIndex] < array[middle])
	            swap(array,rightIndex, middle );
	        if(array[rightIndex] < array[leftIndex])
	            swap(array, rightIndex, leftIndex);
	        if(array[middle] < array[leftIndex])
	            swap(array, leftIndex, middle);
	       
	        return middle;
	    }
	
	public static void swap(int[] array, int i, int j) {
		if(array == null)
			throw new IllegalArgumentException();

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
