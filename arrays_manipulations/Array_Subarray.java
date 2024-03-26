package arrays_manipulations;
/*A subarray is a contiguous part of array. An array that is inside another array. 
For example, consider the array [1, 2, 3, 4], There are 10 non-empty sub-arrays.
 The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/substrings. 
There are two in general apporach to get the subarrays :
(1): using nested loops:
    the outer loop will take the starting element and inner loop will take the end element,
    and one more inner loop will print all the element from strat point to end point 
(2): using recusrion:
    take the start and end point(default = 0).
    (Base Case) If end == arr.length(i.e end point is reached to the last point of the array)
    if start > end : call the same function by incrementing end+1 and start = 0
    else :  a loop will print all the element between the start and end.
            and call the same function by increamenting start+1 
*/
public class Array_Subarray {
    static void subArray_loop(int arr[],int n){

        for(int i =0;i<n;i++){//outter loop

            for(int j = i;j<n;j++){//inner loop

               System.out.print("["); 

                for (int k = i; k <= j; k++) {//loop to print all the elements
                    System.out.print(arr[k]); 
                    if (k != j) {
                        System.out.print(", "); 
                    }
                }

                System.out.println("]"); 
            }
        }
    }

    static void SubArrays_rec(int[] arr, int start, int end)
	{ 
		// Stop if we have reached the end of the array(base case~)
		if (end == arr.length)
			return;
		// Increment the end point and start from 0
		else if (start > end)
			SubArrays_rec(arr, 0, end + 1);
		// Print the subarray and increment the starting point
		else {
			System.out.print("[");
			for (int i = start; i < end; i++){
				System.out.print(arr[i] + ", ");
            }
			System.out.println(arr[end] + "]");
			SubArrays_rec(arr, start + 1, end);
		}
		return;
	}
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int size = arr.length;
        System.out.println("Subaarys using loops");
        subArray_loop(arr, size);
        System.out.println("----------------------------------");
        System.out.println("Subarrays using recurions");
        SubArrays_rec(arr, 0, 0);

        
    }
}