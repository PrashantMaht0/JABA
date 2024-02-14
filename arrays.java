/*Java Arrays:
 * 
 * 1: One Dimentional array : (only 1 axis) you can traverse in both direction
 * 2: Multi Dimentional (2-d)array : (2 axis) may traverse options:
 *  arrays can be of any type : Integers , Floats , Double , characters , Strings , Objects 
*/

public class arrays {
    public static void main(String[] args) {
        
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
    }
}
