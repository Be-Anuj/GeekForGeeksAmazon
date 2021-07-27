// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Pair {
    int l, r;
    Pair(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            int q = Integer.parseInt(br.readLine().trim());
            ArrayList<Pair> queries = new ArrayList<Pair>();
            for (int i = 0; i < q; i++) {
                String[] lr = br.readLine().trim().split(" ");
                queries.add(
                    new Pair(Integer.parseInt(lr[0]), Integer.parseInt(lr[1])));
            }
            Solution sln = new Solution();

            ArrayList<Boolean> al = sln.processQueries(a, n, queries, q);
            for (boolean u : al) {
                if (u) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

// refer Pair class in driver code
class Solution {
    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
                                      int q) {
                                          
       // code here
       ArrayList <Boolean>result = new ArrayList<>();
       for(int i=0;i<queries.size();i++){
           result.add(findIt(a,queries.get(i).l,queries.get(i).r));
       
       }
       return result;
    }
    static boolean findIt(int numRay[],int left,int right){
        if(isIncreasing(numRay, left, right)) {
			return true;
		}
		if(isDecrerasing(numRay, left, right)) {
			return true;
		}
		if(isIncreasingThenDecreasing(numRay,left,right)) {
			return true;
		}
		return false;
    }
    static boolean isIncreasingThenDecreasing(int arr[],int left ,int right) {
		 int temp=Integer.MIN_VALUE;boolean flag =true;
		for(int i=left;i<=right;i++) {
			
			if(temp>arr[i] && flag ==true) {
				flag=false;
				
			}
			
			if(flag==false && temp<arr[i] ) {
				return false;
			}
			temp=arr[i];
		}
		return true;
	}
	static boolean isDecrerasing(int arr[],int left ,int right) {
		int temp=Integer.MAX_VALUE;
		for(int i=left;i<=right;i++) {
			if(temp<arr[i]) {
				return false;
			}
			temp=arr[i];
		}
		return true;
	}
	static boolean isIncreasing(int arr[],int left ,int right) {
		 int temp=Integer.MIN_VALUE;
		for(int i=left;i<=right;i++) {
			
			if(temp>arr[i]) {
				return false;
			}
			temp=arr[i];
		}
		return true;
	}
}