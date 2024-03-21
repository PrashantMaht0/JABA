//take user input as city name and sort the element of the city in asecnding order
import java.util.*;
public class test5{
    static char[] sort(char arr[],int n){
            for (int j = 1; j <n; j++) {
                for (int k = 0; k <n - j; k++) {
                        if (arr[k] > arr[k+1]) {
                            char temp = arr[k];
                            arr[k] = arr[k+1];
                            arr[k+1] = temp;
                        }
                     }
                }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the city name: ");
        String city = scan.nextLine();
        city = city.toLowerCase();
        char charCity[] = new char[city.length()];
        for(int i =0;i<city.length();i++){
            charCity[i] = city.charAt(i);
        }
        int  n = charCity.length;
        sort(charCity,n);
        System.out.println("Sorted city elements :");
        System.out.println(Arrays.toString(charCity));

        scan.close();
    
    }
}