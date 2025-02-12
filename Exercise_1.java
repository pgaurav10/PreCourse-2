// Time Complexity : O(logn)
// Space Complexity : O(logn)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 
// While writing for else part, instead of writing mid - 1 , I wrote mid, which didn't work.
// And one silly mistake I did, I didn't write return keyword for binarySearch in else if and else part, so it went into infinite loop.


// Your code here along with comments explaining your approach
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
        while(l<=r) {
            int mid = (l+r)/2;
            if(arr[mid]==x)
                return mid;
            else if(x>arr[mid])
                return binarySearch(arr, mid+1, r, x);
            else
                return binarySearch(arr, l, mid-1, x);
        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
