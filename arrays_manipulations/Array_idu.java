package arrays_manipulations;
import java.util.*;

/*
Array insertion of element: (1)Starting of array 
                            (2)End of array
                            (3)Middle of array(anywhere)
Array deletion of element :(1)Starting of array 
                            (2)End of array
                            (3)Middle of array(anywhere)
Array updation of element : (1)Middle of array(anywhere)
*/

public class Array_idu {
    public static int[] insertStart(int array[], int size, int element) {
        int new_array[] = new int[size + 1];
        new_array[0] = element;

        for (int i = 0; i < size; i++) {
            new_array[i + 1] = array[i];
        }
        return new_array;
    }
    public static int[] insertEnd(int array[],int size,int element){
        int new_array[] = new int[size+1];
        new_array[size]=element;
        for (int i = 0; i < size; i++) {
            new_array[i] = array[i];
        }
        return new_array;
    }
    public static int[] insertMid(int array[], int size, int pos, int element) {
        int new_size = size+1;
    int new_array[] = new int[new_size];
    new_array[pos] = element;

    for (int i = 0, j = 0; i < new_size; i++) {
        if (i == pos) {
            continue;
        }
        new_array[i] = array[j++];
    }
    return new_array;
    }

    public static int[] DelStart(int array[], int size){
        int new_size = size-1;
        int new_arr[] = new int[new_size];
        for (int i = 0; i < new_size; i++) {
            new_arr[i] = array[i+1];
        }
        return new_arr;
    }
    public static int[] DelEnd(int array[], int size){
        int new_size = size-1;
        int new_arr[] = new int[new_size];
        for (int i = 0; i < new_size; i++) {
            new_arr[i] = array[i];
        }
        return new_arr;
    }
    public static int[] DelMid(int array[], int size,int pos){
        int new_size = size -1;
        int new_arr[] = new int[new_size];
        for(int i=0,j=0;i<size;i++){
            if(i==pos){
                continue;
            }
            new_arr[j++]=array[i];
        }

        return new_arr;
    }
    static Scanner scan = new Scanner(System.in);
    static void Insert(int arr[],int size){
        
        System.out.println("Where you want to insert the element :\r\n (1)Starting of array \r\n" + 
                                                                    "(2)End of array\r\n" + 
                                                                    "(3)Middle of array(anywhere)");
        int ch = scan.nextInt();
        int element;
        switch (ch) {
            case 1:
                    System.out.println("Enter the element ");
                    element = scan.nextInt();
                    arr = insertStart(arr, size, element);
                    System.out.println(Arrays.toString(arr));
                break;
        case 2:
                    System.out.println("Enter the element ");
                    element = scan.nextInt();
                    arr = insertEnd(arr, size, element);
                    System.out.println(Arrays.toString(arr));
            break;
        case 3:
                    System.out.println("Enter the element :");
                    element = scan.nextInt();
                    System.out.println("Enter the Postion of element :");
                    int pos = scan.nextInt();
                    arr = insertMid(arr, size,pos, element);
                    System.out.println(Arrays.toString(arr));
            break;
        
            default:
                System.out.println("error!!!!!!!!!!!!!!");

                break;
        }

    }

    static void Del_(int arr[],int size){

        System.out.println("Where you want to de the element :\r\n (1)Starting of array \r\n" + 
                                                                    "(2)End of array\r\n" + 
                                                                    "(3)Middle of array(anywhere)");
        int ch = scan.nextInt();
        switch (ch) {
            case 1:
                    arr = DelStart(arr, size);
                    System.out.println(Arrays.toString(arr));
                break;
        case 2:
                    
                    arr = DelEnd(arr, size);
                    System.out.println(Arrays.toString(arr));
            break;
        case 3:
                    System.out.println("Enter the Postion of element :");
                    int pos = scan.nextInt();
                    arr = DelMid(arr, size,pos);
                    System.out.println(Arrays.toString(arr));
            break;
        
            default:
                System.out.println("error!!!!!!!!!!!!!!");

                break;
        }
    }

    public static int[] update(int arr[], int size){
        System.out.println("Enter the element :");
        int element = scan.nextInt();
        System.out.println("Enter the Postion of element :");
        int pos = scan.nextInt();

        arr[pos]=element;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) { 
        System.out.println("Enter the size of array ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the array :");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
    System.out.println("Enter the operation you want to perform : \n (1):Insert \n (2):Delete \n (3):Update :");
    int ch = scan.nextInt();

    switch (ch) {
        case 1:
            Insert(array, size);
            break;
        case 2:
            Del_(array, size);
            break;
        case 3:
            update(array, size);
            break;
    
        default:
            break;
    }

    }
}
