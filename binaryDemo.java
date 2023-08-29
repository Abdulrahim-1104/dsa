package DataStructureAndAlgorithm;

public class binaryDemo {
 public static void main(String args[]) {
	 int arr[]= {1,2,4,6,8,9};
	 int ar[]= {8,7,6,5,4,2};
	 int a=binarySearch.find(arr, 8);
	 int b=binarySearch.find(ar, 2);
	 System.out.println("If Ascending ["+a+"]");  
	 System.out.println("If Dscending ["+b+"]");  
	 System.out.println(binarySearch.demo());
	 System.out.println(binarySearch.mySqrt(8)); 
 }
}
