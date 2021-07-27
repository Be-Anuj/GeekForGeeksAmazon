package solutions;

public class BinarySort {
	
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int temp =arr.length-1; 
	    int a =0;
	    while(a<temp){
	        if(arr[a]==1 && arr[temp]==0){
	        	int x = arr[a];
	        	arr[a]=arr[temp];
	        	arr[temp]=x;
	            a++;
	            temp--;
	            continue;
	        }
	        if(arr[a]==0){
	            a++;
	        }
	        if(arr[temp]==1){
	            temp--;
	        }
	    }
	    return arr;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[] = {1,0,1,0,1,1,1,0,0,1,0};
		int ar[]=SortBinaryArray(arr,1);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
