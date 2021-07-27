package solutions;

import java.util.*;

public class Test {
	//Method to reverse an array
	 static void reverseArray(int a[])
	    {
		 int n = a.length;
	        
	        for (int i = 0; i < n / 2; i++) {
	           int temp = a[i];
	            a[i] = a[n - i - 1];
	            a[n - i - 1] = temp;
	        }
	        for (int k = 0; k < n; k++) {
	            System.out.println(a[k]);
	        }
	    }
//-----------------------------------------------------------------------------------------
	 //remove element from arraylist
	 static void removeElement(ArrayList<String> arr,String s) {
		 arr.remove(s);
	 }
//-----------------------------------------------------------------------------------------

	 //remove duplicates 
	 static void removeDuplicates(int arr[] ){
		 Set<Integer> s = new HashSet<>();
		 for (Integer t : arr) {
	            s.add(t);
	        }
		 System.out.println(s);
	 }
//-----------------------------------------------------------------------------------------

	 //print second largest element
	 public static void print2largest(int arr[],
             int arr_size){
		 int first, second;
		 first = second = Integer.MIN_VALUE;
		 for (int i = 0; i < arr_size; i++) {
			 if (arr[i] > first) {
				 second = first;
				 first = arr[i];
			 }else if (arr[i] > second && arr[i] != first)
				 second = arr[i];
		 }

		 if (second == Integer.MIN_VALUE) {
			 System.out.print("There is no second largest element");
		 }else {
			 System.out.print("The second largest element"+ " is " + second);
		 }
}

}
