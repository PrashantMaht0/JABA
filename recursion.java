/*
 * RECURSION : 
 * Recursion is when a function call itself recursively to perfrom a task which can be done using any loop control statement(For,While,Do-While,etc)
 * 
 * Note : A very important point to consider while working with recursion is its base case(which terminates the recusrion)
 *          usually in loop conrtol statement we have terminating(loop stoping statement) which tell the complier when to stop the iteration 
 *          but in case of recusrion we have to decide and delacre these statement very carefully or else the stackoverflow will occur.
 */

public class recursion {
    static void printFun(int test){
        if (test < 1)//base case
            return;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1);
            System.out.printf("%d ", test);
            return;
        }
    }
    static int Fib(int N){
        if (N == 0 || N == 1)//base case
			return N;

		return Fib(N - 1) + Fib(N - 2);
    }
    static int Power(int n, int p){
        if(p ==0){//base case
            return 1;
        }
        return n * Power(n,p-1);
    }
    public static void main(String[] args) {
        //printing a pattern using recursion 
        int test = 5;
        while(test>=0){
            printFun(test);
            System.out.println("\n");
            test--;
        }
        System.out.println("--------------------------------------\n");

        //First ten fibonaci numbers
        int range = 10;
        for(int i=0;i<range;i++){
            System.out.println(Fib(i));
        }
        System.out.println("--------------------------------------\n");
        //power of a number
        System.out.println(Power(2,5));

    }
    
}
