//Demonstrate Various String methods and Operations 
//A String in Java is actually an object . it's a non primitive data type 


public class stringMethods {
    public static void main(String[] args) {
        String myStr = "Hello World";
        System.out.println(myStr.getClass().getSimpleName());
        //here we do not need to do the explicit coversion of string data type into objects
        // like other primitive data types like : Int , Float ,etc as it's already a object of String class .


        System.out.println("----------------------------------------------------------------");

        /*When you use == to compare objects, you are checking whether the two references point to the exact same object in memory.
        In other words, it compares the memory addresses of the objects rather than their actual content. To compare to Strings in Java we use 
         .equals() method . #tricky_Question. 
         */
        String Str1 = "Hello ";
        String Str2 = "World";
        String Str3 = Str1 + Str2 ;
        String Str4 = Str1;
        String EqualsMethod = (Str3.equals(myStr))?"True":"False";//Using ternary Operator Instead of If- else Statement
        String otherMethod = (Str3==myStr)?"True":"False";
        boolean IsEquals = Str4 == Str1 ;
        System.out.println("myStr = "+myStr);
        System.out.println("Str3 = "+Str3);
        System.out.println("Comapre myStr , Str3 Using .equals() methods : "+ EqualsMethod);
        System.out.println("Comapre myStr , Str3 Using == methods :"+ otherMethod);
        System.out.println("Comapre Str4 , Str1 Using == methods :"+ IsEquals);//Here it will give true are Str4 is referrening the same memory address of Str1

        System.out.println("----------------------------------------------------------------");

        //few common String methods :

        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length());// .length() method to find the length of String
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // .indexOf() Method the find the index( of First Occurence) of specified txt in string

        System.out.println("----------------------------------------------------------------");
        

        // Concatination And Numbers in String :

        //Two Methods for Concatination of String : (1): using + operator , (2): Using concat() Function
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);//Using + Operator 
        System.out.println(firstName.concat(lastName));// Using concat() function 


        /*Here Even We have written integers in String Num1 and Num2 it will act as a String . 
        \The output will give 1020 (A normal string Conacatination) instead of 30 */
        String Num1 = "10";
        String Num2 = "20";
        System.out.println(Num1+Num2);
        
        System.out.println("----------------------------------------------------------------");

    }
    
}
