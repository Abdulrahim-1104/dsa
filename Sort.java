package DataStructureAndAlgorithm;

import java.util.Arrays;

public class Sort {  
	public static void selectionSortmin(int[] arr) {
		int min=0;
		for(int i=0;i<arr.length;i++) { 
			 min=i; 
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) { 
					min=j;     
				}  
			} 
			int temp=arr[i];
			arr[i]=arr[min];  
			arr[min]=temp; 
		} 
	}
	public static void selectionSortmax(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			max=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;

		} 
	}
	public static void bubbleSortmin(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) { 
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} 
			}
			
		}
	}
	public static void bubbleSortmax(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1]; 
					arr[j+1]=temp;   
				} 
			} 
		} 
	}
	public static void insertionSortmin(int arr[]) {
		for(int i=1;i<arr.length;i++) { 
			for(int j=i;j>0;j--) { 
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];  
					arr[j-1]=arr[j]; 
					arr[j]=temp; 
				}
				else {
					break;
				}  
			}
		} 
	}
	public static void insertionSortmax(int arr[]) {
		
		for(int i=1;i<arr.length;i++) { 
			for(int j=i;j>0;j--) { 
				if(arr[j]>arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j]; 
					arr[j]=temp;
				} 
				else {
					break;
				}
			}
		}
	}
	public static int[] mergeSort(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2; 
		
		int left[]=mergeSort(Arrays.copyOfRange(arr,0, mid)); 
		int right[]=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}
	public static int[] merge(int left[],int right[]) {
		int joined[]=new int [left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length&&j<right.length) { 
			if(left[i]<right[j]) {
				joined[k++]=left[i++]; 
			}
			else {
				joined[k++]=right[j++];
			}
		}
		while(i<left.length) {
			joined[k++]=left[i++]; 
		}
		while(j<right.length) { 
			joined[k++]=right[j++]; 
		}
		return joined; 
	}
	public static void mergeInplace(int arr[],int start,int end) {
		if(end-start==1) { 
			return; 
		} 
		int mid=(start+end)/2;
		mergeInplace(arr,start,mid); 
		mergeInplace(arr,mid,end);
	 	
		merging(arr,start,mid,end);
		
	}
	public static void merging(int arr[],int start,int mid,int end) {
		int joined[]=new int[end-start]; 
		int i=start; 
		int j=mid;  
		int k=0;
		while(i<mid&&j<end) { 
			if(arr[i]<arr[j]) {  
				joined[k++]=arr[i++];
			}
			else {
				joined[k++]=arr[j++];
			}
		} 
		while(i<mid) { 
			joined[k++]=arr[i++];
		}    
		while(j<end) { 
			joined[k++]=arr[j++]; 
		}    
		for(k=0;k<joined.length;k++) {
			arr[start+k]=joined[k];     
		}
	}
	
	public  static void quickSort(int arr[],int low, int high) {
		if(low>=high) { 
			return; 
		} 
		int start=low;
		int end=high;
		int mid=(low+high)/2; 
		int pivot=arr[mid];                         
		while(start<=end) {
			while(arr[start]<pivot) {
				start++; 
			}
			while(arr[end]>pivot) { 
				end--;  
			} 
			if(start<=end) {
				int temp=arr[start];  
				arr[start]=arr[end];
				arr[end]=temp;  
				start++;
				end--;
			}  
		}
		quickSort(arr,low,end);
		quickSort(arr,start,high);
}
}