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

    
    //Short hand if-else (Using Ternary Operator(?)):
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

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


    }
    

}
