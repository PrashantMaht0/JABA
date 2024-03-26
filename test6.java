//java program to print area and perimeter of rectangle using default and parameterised constructor
public class test6 {
    int length;
    int breadth;

    // Default constructor
    test6() {
        length = 20;
        breadth = 10;
    }

    // Parameterized constructor
    test6(int l, int b) {
        length = l;
        breadth = b;
    }

    public  void area() {
        int area = length * breadth;
        System.out.println("Area of your rectangle is: " + area);
    }

    public void perimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of your rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        
        test6 ob1 = new test6();
        test6 ob2 = new test6(30, 15);

        System.out.println("Area of rectangle using default constructor:");
        ob1.area();
        ob1.perimeter();

        System.out.println("Area of rectangle using parameterized constructor:");
        ob2.area();
        ob2.perimeter();
    }
}
