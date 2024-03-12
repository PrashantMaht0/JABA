import java.util.Scanner;
//string to int type conversion
public class test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the String ");
        String mystr1 = scan.nextLine();
        System.out.println("Enter the String ");
        String mystr2 = scan.nextLine();

        //type conversion using praseint() method

        int num1 = Integer.parseInt(mystr1);
        int num2 = Integer.parseInt(mystr2);

        System.out.println("Addition of two strings: "+ (num1+num2));

        scan.close();

    }
}
