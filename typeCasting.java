//demostrate typecasting in java 
// type 1 : widening method(implicit conversion) : from lower to higher data type (byte -> double)
// type 2 : Narrowing method (Explicit conversion): from higher to lower data type (double -> byte)
public class typeCasting {
    public static void main(String[] args) {
    int myInt = 9;
    long myLongInt = myInt; // Widening Casting (int -> long int)
	  short myShort = (short) myLongInt; // Narrowing Casting (long int -> short int)
    //check if all have the same vaule i.e 9
    System.out.println("myInt = "+myInt);
    System.out.println("myDouble = "+myLongInt);
    System.out.println("myShort = "+myShort);
    //cheking there data types weather or not the there types are being casted.
    System.out.println("Data Type of myInt = "+((Object)myInt).getClass().getSimpleName());
    System.out.println("Data Type of myDouble = "+((Object)myLongInt).getClass().getSimpleName());
    System.out.println("Data Type of myShort = "+((Object)myShort).getClass().getSimpleName());
  }
}
