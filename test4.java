//user input in array : find max ,min,  sum , average
import java.util.Arrays;
import  java.util.Scanner;
public class test4 {
    static int sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    static int max(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int arr[]){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static float avg(int arr[]){
        float avg;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        avg = (float)sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array :");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Your array is :"+ Arrays.toString(arr));
        System.out.println("Your Sum of array is :"+ sum(arr));
        System.out.println("Your maximum element in array is :"+max(arr));
        System.out.println("Your minimun element in array is :"+ min(arr));
        System.out.println("Your average of array is :"+ avg(arr));

        scan.close();

    }
}
