package OOPs;
//using all the modifers :
/**
 * InnerAccess_modifiers
 */
interface test{
public int num4 = 50;
    
}
class Myclass1{
    private 
        int a = 10;
    public
        int b = 20;
    protected 
        int c = 30;

    public void also_print_val(){
        System.out.println(a);
    }
}

class MyClass2 extends Myclass1{

    public void print_val(){
        //System.out.println(a); error
        System.out.println(b);
        System.out.println(c);
    }
}
public class Access_modifiers{
    public static void main(String[] args) {
     
    MyClass2 ob1 = new MyClass2();
    ob1.print_val();   
    Myclass1 ob2 = new Myclass1();
    ob2.also_print_val();
    }
}
