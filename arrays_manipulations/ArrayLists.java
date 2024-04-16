package arrays_manipulations;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        for(int i =0;i<=10;i++){
            numbers.add(i);
        }
        
        for(int i =0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}
