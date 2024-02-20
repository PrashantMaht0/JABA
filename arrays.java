/*Java Arrays:Basics
 * 
 * 1: One Dimentional array : (only 1 axis) you can traverse in both direction
 * 2: Multi Dimentional (2-d)array : (2 axis) may traverse options:
 *  arrays can be of any type : Integers , Floats , Double , characters , Strings , Objects 
*/
import java.util.Scanner ;
class student{
    public int roll_no ;
    public String name ;

    student(int roll_no ,String name){
        this.roll_no = roll_no;
        this.name = name ;
    }

};

public class arrays {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String cars[] = {"Bmw","volvo","audi","bla bla bla"};//array of strings

        //ways to iterarte over a array
        //iterating through there index (tip:index of a array or String always starts with Zero(0))
        //  0      1       2         3
        //"Bmw","volvo","audi","bla bla bla"
        System.out.println(cars[1]);
        System.out.println(cars[3]);
        System.out.println("------------------------------------------------------\n");

        //Using loops (eg.For loop)by accessing each index using the iterable variable (i)
        for(int i =0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        
        System.out.println("------------------------------------------------------\n");
        //For-each method(Similar to python for-each)

        for(String i : cars){
            System.out.println(i);
        }

        //Multi dimentional array :(eg a 3x3 matrix)
        int[][] matrix ={{1,2,3}
                        ,{4,5,6}
                        ,{7,8,9}};

        for (int i[] : matrix) {
            for (int j : i){
                System.out.println(j);
            }
        }

        System.out.println("------------------------------------------------------\n");
         
        System.out.println(matrix[1][1]);


        // array of objects :

        student arr[] = new student[5];

        arr[0] = new student(1,"prashant");
        arr[1] = new student(2,"vedant");
        arr[2] = new student(3,"Sushil");
        arr[3] = new student(4,"summit");
        arr[4] = new student(5,"smith");
        for(int i =0;i<arr.length;i++){
            System.out.println("Roll no :"+ arr[i].roll_no+" \t Name :"+ arr[i].name);

        }


    // jagged array : 
    /*         A jagged array is array of arrays or 2d(multidementional array )where the length of the 
                each sub-array(ethier column or row ) will be of different length
                for eg:
            int arr[][] = new int[][]  {
                        new int[] {10, 20, 30 ,40},
                        new int[] {50, 60, 70, 80, 90, 100},
                        new int[] {110, 120}
                        };
            here as you can se each sub-array is ahaveing different length.

        */
    //implemention od jagged array :

    System.out.println("Enter the number of rows :");
    int n_of_Rows = scan.nextInt();
    
    int jaggedArray[][] = new int[n_of_Rows][];

    //initialize the length of each sub-array:
        for(int i=0;i<n_of_Rows;i++){
        System.out.println("Enter the length of Sub-array ["+ (i+1) +"] :");
        int rowlength = scan.nextInt();
        jaggedArray[i] = new int[rowlength];//creating a new array in array(jaggedArray)of given length by user
    }

    //assigning the values to each subarray :
    for(int i=0;i<n_of_Rows;i++){
        System.out.println("Enter the elemnts of Sub-array ["+ (i+1) +"] :");
        for(int j=0;j< jaggedArray[i].length;j++){
            jaggedArray[i][j] = scan.nextInt();
        }
    }

     // Print the elements of the jagged array
        System.out.println("The jagged array is:");
    for (int i = 0; i < n_of_Rows; i++) {
        for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
        }
        System.out.println(" ");
    }

    scan.close();


    }
}
