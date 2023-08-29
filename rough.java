package DataStructureAndAlgorithm;

import java.util.Arrays;

public class rough {
	public static void mergeesort(int arr[],int s,int e) {
		if(e-s==1) {  
			return; 
		}
		int m=(s+e)/2; 
		mergeesort(arr,s,m);
		mergeesort(arr,m,e); 
		mergee(arr,s,m,e);  
	}    
	public static void mergee(int arr[],int s,int m, int e) {
		int join[]=new int[e-s];     
	    int i=s; 
		int j=m;
		int k=0; 
		while(i<m&&j<e) {   
			if(arr[i]<arr[j]) { 
				join[k++]=arr[i++];
			}
			else {
				join[k++]=arr[j++];
			}
		}  
		while(i<m) { 
			join[k++]=arr[i++];
		}  
		while(j<e) { 
			join[k++]=arr[j++];  
		} 
		for(k=0;k<join.length;k++) { 
			arr[s++]=join[k];  
		}    
	}
	public static void quiksort(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		int s=low;
		int e=high;
		int mid=(s+e)/2;
		int pivot=arr[mid];
		while(s<=e) {
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		quiksort(arr,low,e);
		quiksort(arr,s,high);
	}
     public static void bubblesort(int arr[]) {
    	 for(int i=0;i<arr.length-1;i++) {
    		 for(int j=0;j<arr.length-i-1;j++) {
    			 if(arr[j+1]<arr[j]) {   
    				 int temp=arr[j+1];
    		 		 arr[j+1]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	 }
     }
     public static void insertionsort(int arr[]) {
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j=i;j>0;j--) {
    			 if(arr[j-1]>arr[j]) {
    				 int temp=arr[j-1];
    				 arr[j-1]=arr[j];
    				 arr[j]=temp;
    			 }
    			 else
    				 break;
    		 }
    	 }
     }
	public static void selectionsort(int arr[]) {
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
	public static void main(String args[]) {
		int arr[]= {5,1,2,4,3};
	rough sort=new rough();
	/*	sort.QuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr)); 
		sort.mergesort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		sort.insertionSortmin(arr);
		System.out.println(Arrays.toString(arr));
		
	    sort.selectionsort(arr);
	    System.out.println(Arrays.toString(arr));
	    	
	sort.bubblesort(arr);
	
	sort.insertionsort(arr);
	
	sort.mergeesort(arr, 0, arr.length);
	*/ 
	sort.quiksort(arr, 0, arr.length-1);
	System.out.println(Arrays.toString(arr));
	}
}

 