package DataStructureAndAlgorithm;

public class binarySearch {
	public static int find(int arr[], int target) {
		int start= 0;
		int end = arr.length-1; 
		boolean asc=arr[start]<arr[end]?true:false;     
		if(asc==true) {
		while(start<=end) {  
			int mid = (start+end)/2;
			if(target>arr[mid]) 
				start=mid+1;
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else
				return mid;
		}  
		}
		else {
			while(start<=end) {  
				int mid = (start+end)/2;
				if(target>arr[mid]) 
					end=mid-1; 
				else if(target<arr[mid]) {
					start=mid+1;
				} 
				else
					return mid;
		}
}
		return -1;  

}
	public static int demo() {
		double b=2.82842712475;
		return (int)b;
	}
	public static int mySqrt(int x) {
        int end=x; int start=0;int mid=0;
        if(x==0||x==1) 
            return x;
        while(start<=end){
             mid=(start+end)/2;      
            if((long)mid*(long)mid==x) 
                return mid; 
            else if(x>mid*mid){  
                start=mid+1;
            }
            else
                end=mid-1;
        } 
        return mid-1;  
        
        
    }
}






