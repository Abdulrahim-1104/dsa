package DataStructureAndAlgorithm;
public class LinearSearch {
	public static int find(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) 
				return i;
		}
		return -1;
		}
	public static boolean contain(int arr[], int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return true;
		}
		return false; 
	}
	public static int find( String str,char target) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target)
				return i;
		}
		return -1;
		}
	public static int[] find(int arr[][],int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target)
					return new int[] {row,col};	  	
	}  
	}
		 return new int[] {-1,-1};
}
	public static int max(int arr[]) {
		int max=arr[0];  
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) 
				max=arr[i];
				}
		return max;  
	}
	public static int min(int arr[]) {
		 int min=arr[0];  
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i]; 
		}  
	return min;	
	}
	public static int[] countString(String str[])  { 
		int arr[]=new int[str.length];
		int count;
		   for(int i=0;i<str.length;i++) {  
			 count=0; 
		 	for(int j=0;j<str[i].length();j++) {       
			count++;        
		 	}  
		 	arr[i]=count-1;     
	   }    
	return arr ;    
	}                                   
	public static int fourDigit(String str[]){  
		int count=0;
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length();j++) {     
				if(str[i].length()==4) {
	           count++;
	           break;
				}
			}
		}
		return count; 
		    
	}
	
	public static int fourDigit(int arr[]) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<String.valueOf(arr[i]).length();j++) {
				if(String.valueOf(arr[i]).length()==4) {
					count++; 
				   break;
				}
			}
		} 
		return count;
	}
	public static int countChar(String str[],char target) { 
		int count=0;
		 for(int i=0;i<str.length;i++) {
			 for(int j=0;j<str[i].length();j++) {
				 if(str[i].charAt(j)==target){    
					 count++;   
				 }
			 }
		 }
		 return count-1;
	}
}