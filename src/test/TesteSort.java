package test;

import java.util.Arrays;

import ordenacao.*;
import variationsOfOrdenacao.*;


public class TesteSort {
	
	private static int[] arrayPar = new int[] {5,9,10,7,0,1,3,11};
	private static int[] arrayImpar = new int[] {5,9,10,7,0,1,3};
	private static int[] arrayIgual = new int[] {0,0,0,0,0};
	private static int[] arrayRepetido = new int[] {3,3,0,0,1,1,12,89,45,32,45,32,41,7};
	private static int[] arrayOrdenado1 = new int[] {1,2,3,4,5,6,7,8,9,10};
	private static int[] arrayOrdenado2 = new int[] {1,3,5,7,9,11,15,25};
	
	private static CountingSort sort1 = new CountingSort();
	private static MergeTwoSortedLists sort2 = new MergeTwoSortedLists();
	private static BubbleSort sort3 = new BubbleSort();
	private static BidirectionalBubbleSort sortV3 = new BidirectionalBubbleSort();
	private static SelectionSort sort4 = new SelectionSort();
	private static BidirectionalSelectionSort sortV4 = new BidirectionalSelectionSort();
	private static InsertionSort sort5 = new InsertionSort();
	private static MergeSortBeta sort6 = new MergeSortBeta();
	private static QuickSort sort7 = new QuickSort();
	private static QuickSortMedianaDeTres sortV7= new QuickSortMedianaDeTres();
	private static MergeSort sortX = new MergeSort();
	
	public static void main(String[] args) {
		// BubbleSort
		System.out.println("BubbleSort");
		sort3.sort(arrayPar);
		sort3.sort(arrayImpar);
		sort3.sort(arrayRepetido);
		sort3.sort(arrayIgual);
		sysoArrays();
		resetArrays();
		// SelectionSort
		System.out.println("SelectionSort");
		sort4.sort(arrayPar);
		sort4.sort(arrayImpar);
		sort4.sort(arrayRepetido);
		sort4.sort(arrayIgual);
		sysoArrays();
		resetArrays();
		// InsertionSort
		System.out.println("InsertionSort");
		sort5.sort(arrayPar);
		sort5.sort(arrayImpar);
		sort5.sort(arrayRepetido);
		sort5.sort(arrayIgual);
		sysoArrays();
		resetArrays();
		// MergeSort
		System.out.println("MergeSortBeta");
		sort6.sort(arrayPar, 0, arrayPar.length-1);
		sort6.sort(arrayImpar, 0, arrayImpar.length - 1);
		sort6.sort(arrayRepetido, 0, arrayRepetido.length - 1);
		sort6.sort(arrayIgual, 0, arrayIgual.length - 1);
		sysoArrays();
		resetArrays();
		// MergeSo
		System.out.println("MergeSort");
		sortX.sort(arrayPar, 0, arrayPar.length-1);
		sortX.sort(arrayImpar, 0, arrayImpar.length - 1);
		sortX.sort(arrayRepetido, 0, arrayRepetido.length - 1);
		sortX.sort(arrayIgual, 0, arrayIgual.length - 1);
		sysoArrays();
		resetArrays();
		// MergeSortTwo
		System.out.println("MergeTwoSortedLists");
		System.out.println(Arrays.toString(sort2.mergeVector(arrayOrdenado1, arrayOrdenado2)));
		// QuickSort
		System.out.println("QuickSort");
		sort7.sort(arrayPar, 0, arrayPar.length - 1);
		sort7.sort(arrayImpar, 0, arrayImpar.length - 1);
		sort7.sort(arrayRepetido, 0, arrayRepetido.length - 1);
		sort7.sort(arrayIgual, 0, arrayIgual.length - 1);
		sysoArrays();
		resetArrays();
		// CoutingSort
		System.out.println("CountingSort");
		sort1.sort(arrayPar, 11);
		sort1.sort(arrayImpar, 10);
		sort1.sort(arrayRepetido, 89);
		sort1.sort(arrayIgual, 0);
		sysoArrays();
		resetArrays();
		
		// VariationsOfOrdenacao
		
		// BidirectionalBubbleSort
		System.out.println("BidirectionalBubbleSort");
		sortV3.sort(arrayPar, 0, arrayPar.length - 1);
		sortV3.sort(arrayImpar, 0, arrayImpar.length - 1);
		sortV3.sort(arrayRepetido, 0, arrayRepetido.length - 1);
		sortV3.sort(arrayIgual, 0, arrayIgual.length - 1);
		sysoArrays();
		resetArrays();
		// BidirectionalSelectionSort
		System.out.println("BidirectionalSelectionSort");
		sortV4.sort(arrayPar, 0, arrayPar.length - 1);
		sortV4.sort(arrayImpar, 0, arrayImpar.length - 1);
		sortV4.sort(arrayRepetido, 0, arrayRepetido.length - 1);
		sortV4.sort(arrayIgual, 0, arrayIgual.length - 1);
		sysoArrays();
		resetArrays();
		// QuickSortMediana
		System.out.println("QuickSortMedianaDeTres");
		sortV7.sort(arrayPar, 0, arrayPar.length - 1);
		sortV7.sort(arrayImpar, 0, arrayImpar.length - 1);
		sortV7.sort(arrayRepetido, 0, arrayRepetido.length - 1);
		sortV7.sort(arrayIgual, 0, arrayIgual.length - 1);
		sysoArrays();
		resetArrays();
	}
	
	private static void sysoArrays() {
		System.out.println(Arrays.toString(arrayPar));
		System.out.println(Arrays.toString(arrayImpar));
		System.out.println(Arrays.toString(arrayRepetido));
		System.out.println(Arrays.toString(arrayIgual));
	}
	
	private static void resetArrays() {
		arrayPar = new int[] {5,9,10,7,0,1,3,11};
		arrayImpar = new int[] {5,9,10,7,0,1,3};
		arrayIgual = new int[] {0,0,0,0,0};
		arrayRepetido = new int[] {3,3,0,0,1,1,12,89,45,32,45,32,41,7};
	}
}
