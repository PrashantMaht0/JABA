package arrays_manipulations;
import java.util.Scanner;
/*
Array insertion of element: (1)Starting of array 
                            (2)End of array
                            (3)Middle of array(anywhere)
Array deletion of element :(1)Starting of array 
                            (2)End of array
                            (3)Middle of array(anywhere)
Array updation of element :(1)Starting of array 
                            (2)End of array
                            (3)Middle of array(anywhere)
*/

public class Array_idu {
    static Scanner scan = new Scanner(System.in);
    static void Insert(int arr[]){
        int index = arr.length;
        int element;
        System.out.println("Where you want to insert the element : (1)Starting of array \r\n" + 
                                                                    "(2)End of array\r\n" + 
                                                                    "(3)Middle of array(anywhere)");
        int ch = scan.nextInt();

        switch (ch) {
            case 1:
                    System.out.println("Enter the element ");
                    element = scan.nextInt();
                    
                
                break;
        
            default:
                break;
        }

    }
    public static void main(String[] args) { 

    int arr[] = new int[20]  ;//max length of array is 20
    System.out.println("Enter the operation you want to perform : \n (1):Insert \n (2):Delete \n (3):Update :");
    int ch = scan.nextInt();

    switch (ch) {
        case 1:
            
            
            break;
    
        default:
            break;
    }

    }
}
