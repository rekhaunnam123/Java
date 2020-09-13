
/*Create an abstract class named Shape with the following protected attributes / member variables.
 String name
 Include a 1-argument constructor.
 Include getters and setters.
 Include an abstract method named calculateArea() . This method returns a Float value.
 Create a class named Circle . The class Circle is a derived class of Shape. Include the   following private attributes / member variables.
 Integer radius
 Include a 2-argument constructor. The order of the arguments is name, radius.
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the circle. [Take the value of pi as 3.14]
 Create a class named Square . The class Square is a derived class of Shape. Include the following private attributes / member variables.
 Integer side
 Include a 2-argument constructor. The order of the arguments is name, side.
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the square.
 Create a class named Rectangle . The class Rectangle is a derived class of Shape. Include the following private attributes / member variables.
 Integer length
 Integer breadth
 Include a 3-argument constructor. The order of the arguments is name, length, breadth
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the rectangle.
 Create another class called Main. In the method, create instances of the above classes and test the above classes.*/


package abt.main;



import abt.entry.Shape;
import abt.subclass.Circle;
import abt.subclass.Rectangle;
import abt.subclass.Square;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle("circle",2);
		System.out.println("Area of Circle: "+circle1.calculateArea());
		Square square1=new Square("square",6);
		System.out.println("Area of square: "+square1.calculateArea());
		Rectangle rectangle1=new Rectangle("rectangle",4,3);
		System.out.println("Area of rectagle "+rectangle1.calculateArea());

	}

}
