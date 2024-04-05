package arrays_manipulations;

import java.util.ArrayList;

public class Arrays_subSquence {
    public static void genSequence(int[] inputArray, ArrayList<Integer> sequence, int index){
        if(index==inputArray.length){
            for(int i: sequence){
                System.out.print(Integer.toString(i) + " ");
            }
            if(sequence.size()==0){
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        sequence.add(inputArray[index]);
        genSequence(inputArray,sequence,index+1);
        sequence.remove(sequence.size()-1);
        genSequence(inputArray,sequence,index+1);
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,4};
        ArrayList<Integer> sequence = new ArrayList<>();
        genSequence(a, sequence, 0);
    }
}
