// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
// One silly mistake which I did was I assigned k = 0 andf I was strugllibg to fibd the fix for it.

// Your code here along with comments explaining your approach

class MergeSort 
{ 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    {  
       //Your code here  
        int n1 = m-l+1;
        int n2 = r-m;
        
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[m+i+1];
        }
        int i=0,k = l,j = 0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = right[j];
            k++;
            j++;
        }
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
	//Write your code here
        //Call mergeSort from here 
        if(l<r) {
            int m = l+(r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 