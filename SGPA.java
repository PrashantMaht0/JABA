//Problem : Sgpa Calculater input:no.of subject , respective marks and there credits 
//expexted output : sgpa of the student 
/*Calculating SGPA (Semester Grade Point Average) 

Write down all your credit points for each subject:
Subject A: 4
Subject B: 2
Subject C: 3
Subject D: 2

    
Subject A: marks = 80
Subject B: marks = 90
Subject C: marks = 70
Subject D: marks = 80

compare the vaules and get the grade point :
grade :
    its calulated by comparing your marks for respective subject to grade crietria :
    Marks    Grade Point
    ---------------------
    91-100      10
    81-90        9
    71-80        8
    61-70        7
    51-60        6
    45-50        5
    40-44       4
    <40         0

Multiply the credit point of each subject by the grade you achieved in that subject:

Subject A: (4 \times 8 = 32)
Subject B: (3 \times 9 = 27)
Subject C: (3 \times 7 = 21)
Subject D: (1 \times 8 = 14)
Add all the scores:
Total score = (32+27+21+14 = 88)
Next, divide the total score by the sum of all the credit points:
SGPA formula: SGPA = Points secured in the semester\ Credits secured in the semester
Points secured in the semester = 88
Credits secured in the semester (sum of all credits from individual subjects) = 4 + 3 + 3 + 1 = 11
SGPA = 88\11 = 8.0)
*/
import java.util.Scanner;
public class SGPA {
    static int no_s;
    static int marks[];
    static int credits[];
    static int marks_sum;
    static int cred_sum;
    static float sgpa;
    static int grade_points[];
    static int GP;

    static Scanner scanOb = new Scanner(System.in);

    SGPA() {
        System.out.println("Enter the number of subjects:");
        no_s = scanOb.nextInt();
        marks = new int[no_s];
        credits = new int[no_s];
        grade_points = new int[no_s];
    }

    void input() {
        for (int i = 0; i < no_s; i++) {
            System.out.println("Enter the marks for subject [" + (i + 1) + "] :");
            marks[i] = scanOb.nextInt();
            System.out.println("Enter the credits for subject [" + (i + 1) + "] :");
            credits[i] = scanOb.nextInt();

            marks_sum += marks[i];
            cred_sum += credits[i];
        }
    }

    void sgpa() {
        for (int i = 0; i < no_s; i++) {
            if (marks[i] > 90) {
                grade_points[i] = 10*credits[i];
            } else if (marks[i] > 80) {
                grade_points[i] = 9*credits[i];
            } else if (marks[i] > 70) {
                grade_points[i] = 8*credits[i];
            } else if (marks[i] > 60) {
                grade_points[i] = 7*credits[i];
            } else if (marks[i] > 50) {
                grade_points[i] = 6*credits[i];
            } else if (marks[i] > 55) {
                grade_points[i] = 5*credits[i];
            } else if (marks[i] > 40) {
                grade_points[i] = 4*credits[i];
            } else if (marks[i] < 40) {
                grade_points[i] = 0*credits[i];
            }

            GP += grade_points[i];
        }

        if (cred_sum != 0) {
            sgpa = GP / (float) cred_sum; 
            System.out.println("Total garde points = " + GP);
            System.out.println("Total credits = "+ cred_sum);
            System.out.println("SGPA = " + sgpa);
        } else {
            System.out.println("Error: Division by zero. Credits sum is zero.");
        }
    }

    public static void main(String[] args) {
        SGPA obj = new SGPA();
        obj.input();
        obj.sgpa();
    }
}
