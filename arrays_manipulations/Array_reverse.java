package arrays_manipulations;
import java.util.*;
/*
 * (1) Reversing Array completely:
 *      eg: org_Array = {1,2,3,4,5}
 *          rev_Array ={5,4,3,2,1}
 * 
 *      method 1 : craeting new array and storing values from original one in reverse order
 *      method 2 : swaping the first and last element in the same array and reversing them using there indexes
 * (2) Reversing Array Partially :
 *      Reversing array from a position i.e from the 0th index to the position will be reversed
 *          eg: org_Array = {1,2,3,4,5,6,7,8,9}
 *              postion = 6
 *              rev_Array ={7,6,5,4,3,2,1,8,9}
 */
public class Array_reverse {

    //(1):Reversing Array completely:
            static int[] rev_method1(int arr[], int size) {//return new array in reversed order
                int new_arr[] = new int[size];
                int j = 0;
                for (int i = size - 1; i >= 0; i--) {
                    new_arr[j] = arr[i];
                    j++;
                }
                return new_arr;
            }


        static int[] rev_method2(int arr[], int size){//swaping elements in array to make it reversed
            int n = size /2;
            for(int i= 0;i<n;i++){
                int temp = arr[i];
                    arr[i]= arr[size-i-1];
                    arr[size-i-1]=temp;
            }
            return arr;
        }
    //(2)Reversing Array from paritialy :
        static int[] rev_method3(int arr[], int size,int pos){
            int n = pos/2;
            for(int i= 0;i<n;i++){
                int temp = arr[i];
                    arr[i]= arr[pos-i-1];
                    arr[pos-i-1]=temp;
            }
            return arr;
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,7,8};
        int size = arr.length;
        System.out.println("Enter the Operations : \n (1):Reverse completely using method 1: \n (2):Reversing completely using method2: \n (3):Partially Reverse the array :");
        int ch = scan.nextInt();
        switch(ch){
            case 1 :
                System.out.println("Original array :"+Arrays.toString(arr));
                arr = rev_method1(arr, size);
                System.out.println("Reversed array :"+Arrays.toString(arr));
            break;
            case 2:
                System.out.println("Original array :"+Arrays.toString(arr));
                arr = rev_method2(arr, size);
                System.out.println("Reversed array :"+Arrays.toString(arr));
            break;
            case 3:
                System.out.println("Enter the Postion to reverse");
                int pos = scan.nextInt();
                System.out.println("Original array :"+Arrays.toString(arr));
                arr = rev_method3(arr, size,pos);
                System.out.println("Reversed array :"+Arrays.toString(arr));
            break;
            default:
            System.out.println("Not a vaild option");

        }
        scan.close();

    }
    
}
