package OOPs;
//using all the modifers :

class Myclass1{
    private 
        int a = 10;
    public
        int b = 20;
    protected 
        int c = 30;
}

class MyClass2 extends Myclass1{

    public void print_val(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class modifiers {
    MyClass2 ob1 = MyClass2();
    ob1.print_val();
}
