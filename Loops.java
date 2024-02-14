/*TYpes of loops in java :
1: while : execute only when a certain condtiton is true .
2: d0-while : executes once before checking if the condition is true .
3: For : executes only when the condition is true.(simply better)

    condition are very important in any loop statement as they are used to stop the loop.
    they tell the complier when the certain iterartion(loop) is suppose to stop 
    if there are no stoping for the loop it will keep going on (Stack-Overflow) and the program will simply crash
*/
public class Loops {
    public static void main(String[] args) {
        int n= 0;
        //while loop:

        while(n<=10){
            System.out.println("hello jaba");
            n++;//incerement operator
        }

        /*
         * while (n==0){
         * System.out.println("hello jaba")
         * n++;
         * }
         * 
         * here as you can see the condition that is( n== 0) is true and it will allways be true so the iteration will never stop .
         */
        
        System.out.println("---------------------------------------------\n");
        do{
            System.out.println("hello jaba");
            n++;
        }while(n < 10);
        //it will only "hello jaba once as the value of n is "10" due to the increment operator in first while loop.
        //and at the end of the first iteration it will check the condition that the value of n is equal to "10"  and will stop any further iterations 
        //make not to forgot ";" after a do while loop

        System.out.println("---------------------------------------------\n");

        for( int i =0; i <=10;i++){
            System.out.println("hello jaba");
        }
    }
}
