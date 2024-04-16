package OOPs;
interface Myclass_01{
    public
    int num1 = 10;
    public void fun1();
}

interface Myclass_02{
    public
    int num2 = 20;
}

class Inherit implements Myclass_01 , Myclass_02,test{
    public int num3 = num1 + num2;
    public void fun1(){
        System.out.println(num4);

    }
}
public class Multiinhert {
    public static void main(String[] args) {
        Inherit ob1 = new Inherit();
        System.out.println(ob1.num3);
        ob1.fun1();
    }
}
