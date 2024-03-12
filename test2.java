public class test2 {
    public static boolean isPrime(int n){
        boolean flag =true;
        for(int i= 2;i<n;i++){
            if(n%i==0){
                flag =false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int size = 10;
        int i=2;
        int count =0;
        while(count<size){
            if(isPrime(i)){
                System.out.println(i + " ");
                count++;
            }i++;
        }

    }
}
