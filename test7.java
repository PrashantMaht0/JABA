interface Polygon{
  public static final int side = 5,length = 4,breadth = 8;
  public void getName();
  public void getNumberOfSides();
  public void getArea();
  public void getPerimeter();
}
class Rectangle implements Polygon{
  public void getName(){
   System.out.println("The name of the Polygon is: Rectangle");
  }
  public void getNumberOfSides(){
    System.out.println("There are 4 sides in a Rectangle");
  }
  public void getArea(){
  }
  public void getPerimeter(){
System.out.println("The Perimeter of Rectangle is: " +2*(length + breadth));
  }  
}
class Square implements Polygon{
  public void getName(){
    System.out.println("\nThe name of the Polygon is: Square");
  }
  public void getNumberOfSides(){
    System.out.println("There are 4 sides in a Rectangle");
  }
  public void getArea(){
    System.out.println("The Area of Square is: " +side * side);
  }
  public void getPerimeter(){
    System.out.println("The Perimeter of Square is: " +4*side);
  } 
}
public class test7{
  public static void main(String[] args){
    Rectangle rectangle = new Rectangle(); 
    Square square=new Square(); 
    rectangle.getName();
    rectangle.getNumberOfSides();
    rectangle.getArea();
    rectangle.getPerimeter();
    square.getName();
    square.getNumberOfSides();
    square.getArea();
    square.getPerimeter();
} 
}
