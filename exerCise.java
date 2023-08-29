package DataStructureAndAlgorithm;

import java.util.Arrays;

public class exerCise {
	public static int real(int nums[]) {
		int dup=0;
		for(int i=0;i<nums.length;i++){ 
             dup=i; 
            for(int j=0;j<nums.length;j++){
                if(nums[dup]!=nums[j]){
                     dup=nums[j]; 
                }  
            }
        }
        return dup;
	} 
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i=0;
         int k=0;
         int j=0;
         int sort[]= new int[nums1.length];
	        while(i<m&&j<n) { 
	        	if(nums1[i]<=nums2[j]) {  
	        		sort[k++]=nums1[i++];  
	        	} 
	        	else {    
	        		sort[k++]=nums2[j++];
	        	}
	        }
	        while(i<m) { 
	        	sort[k++]=nums1[i++];
	        }
	        while(j<n) { 
	        	sort[k++]=nums2[j++];
	        }
	        for(k=0;k<nums1.length;k++) {
	        	nums1[k]=sort[k];
	        }
	    }

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,0,0,0};
        int arr2[]= {2,5,6};
		exerCise ex=new exerCise();      
		System.out.println(ex.real(arr));  
		ex.merge(arr, 3, arr2, 3);
		System.out.println(Arrays.toString(arr));
		 

	}

}
