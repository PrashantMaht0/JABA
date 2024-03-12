import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate area and perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");

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
            case 4:
                triangleCalculations();
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

    private static void triangleCalculations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        System.out.println("Enter the first side length of the triangle:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the second side length of the triangle:");
        double side2 = scanner.nextDouble();

        double area = 0.5 * base * height;
        double perimeter = base + side1 + side2;

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
        scanner.close();
    }
}