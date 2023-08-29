package DataStructureAndAlgorithm;

import java.util.Arrays;

public class sortSolution { 
	public static void main(String args[]) {
		int arr[]= {4,1,2,5,3}; 
/*	Sort.selectionSortmax(arr); 
		System.out.println("Using Selection Sort "+Arrays.toString(arr)); 
		Sort.selectionSortmin(arr);  
		System.out.println("Using Selection Sort "+Arrays.toString(arr)); 
		Sort.bubbleSortmax(arr);  
		System.out.println("Using Bubble Sort "+Arrays.toString(arr)); 
		Sort.bubbleSortmin(arr);  
		System.out.println("Using Bubble Sort "+Arrays.toString(arr)); 
		Sort.insertionSortmin(arr);
		System.out.println("Using Insertion Sort "+Arrays.toString(arr));
		Sort.insertionSortmax(arr);
		System.out.println("Using Insertion Sort "+Arrays.toString(arr)); 
	    Sort.mergeSort(arr);
		System.out.println("Using Merge Sort"+Arrays.toString(arr)); 
		*/
	    Sort.mergeInplace(arr, 0, arr.length);
	    System.out.println("Using Merge Sort In Place"+Arrays.toString(arr));
	
	    Sort.quickSort(arr, 0, arr.length-1);
	    System.out.println(Arrays.toString(arr)); 
	}
 
} 
