package arrays_manipulations;
import java.util.Scanner;
import java.util.Arrays;
//swap the positions of array elements using a temp variable
public class Array_swap {

    static int[] swap(int arr[],int pos1,int pos2){
        int temp = arr[pos1];
        arr[pos1]= arr[pos2];
        arr[pos2]=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("original array :"+Arrays.toString(arr));
        System.out.println("Enter the positions of element to swap");
        int pos1 = scan.nextInt();
        int pos2 = scan.nextInt();
        swap(arr,pos1,pos2);
        System.out.println("swapped array :"+Arrays.toString(arr));

        scan.close();
    }
}
