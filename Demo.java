 package DataStructureAndAlgorithm;

import java.util.Arrays;
public class Demo {
	public static void main(String args[]) {
		int arr[]= {1,2,10,3,4,5,6};  
		String str = "Allah"; 
		String strr[]= {"Mashaallah","Allah","Bismillah"};   
		String strrr[]= {"1234","878","8877","454554"};
		int ar[]= {1233,433333,345,31,1234,7566,7686,2356,12345};   
		int a=LinearSearch.find(arr, 4); 
		boolean b=LinearSearch.contain(arr, 4);
		int c = LinearSearch.find(str, 'a');  
		int d[][]= {
				{1,2,3,4}, 
				{5,6,7,8},
				{9,10,11} 
		}; 
		int[] e=LinearSearch.find(d, 7);   
		int f=LinearSearch.max(arr);
		int g=LinearSearch.min(arr);
		int[] j=LinearSearch.countString(strr); 
	   int k=LinearSearch.fourDigit(strrr);
		System.out.println(a); 
       	System.out.println(b);
		System.out.println(c); 
		System.out.println(Arrays.toString(e)); 
		System.out.println("The Max Element is "+f);
		System.out.println("The Min Element is "+g);
		System.out.println(Arrays.toString(j));
		System.out.println(k);
		System.out.println("The Array Of four Digit Number "+LinearSearch.fourDigit(ar));
	    System.out.println("The Total Number "+LinearSearch.countChar(strr, 'l'));
	
	}  
}
