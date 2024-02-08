/*demonstrate various conditional Statements
 * types of conditional Statements :
 * (1): if 
 * (2): if-else
 * (3):else-if
 * (4):ladder-if (Alternate of else-if)
 * (5): Short hand if-else (Using ternary operator ( ? ) )
 * (6):Switch ( used for multiple conditions)
 */
public class conditions {
    public static void main(String[] args) {
    int time = 22;
    if (time < 10) { //if 
      System.out.println("Good morning.");
    }else if (time < 18) { //else-if
      System.out.println("Good day.");
    }else {//else
      System.out.println("Good evening.");
    }


    System.out.println("-----------------------------------------------------------------------------------");

    
    //Short hand if-else (Using Ternary Operator(?)):
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    System.out.println("-----------------------------------------------------------------------------------");

    //Switch Statement:

    int day = 4;
    switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
      }
      System.out.println("-----------------------------------------------------------------------------------");
      
      //use of if ladder :
      //the if ladder can be used to add multiple conditions inside a single if statement :
      //for example here we chcek if number is even and is it between 20 - 40 or not 
      int num2 = 20;
      int check = num2&1 ;
      if(check == 0){
        System.out.println("number is even :pass ");

        if(num2 < 40 ){
          System.out.println("Number is less than 40 : pass");
          
        }
        if(num2 >= 20){
          System.out.println("Number is greater than 20 : pass");
          
        }
        
      }
      else {
        System.out.println("Not a vaid number");
      }
      
      System.out.println("-----------------------------------------------------------------------------------");
      
      //another method the add numltiple condtion and perform different operations and manpulations using logical operators :
      //logical And( && ): true only if all the conditions are true .

      if(check == 0 &&  num2 <= 40 && num2 >= 20 ){
        System.out.println("Number is even and between the range of 20-40 .");

      }

      //Logical OR (||): True if any one of the conditions are true.
      //logical NOt (!): Negates or Resverse the condition .

    }
    

}
