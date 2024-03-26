import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate area and perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

      switch (choice) {
            case 1:
                circleCalculations();
                break;
            case 2:
                rectangleCalculations();
                break;
            case 3:
                squareCalculations();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        scanner.close();
    }

    private static void circleCalculations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
        scanner.close();
    }

    private static void rectangleCalculations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        scanner.close();
    }

    private static void squareCalculations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the square:");
        double side = scanner.nextDouble();

        double area = Math.pow(side, 2);
        double perimeter = 4 * side;

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
        scanner.close();
    }

}