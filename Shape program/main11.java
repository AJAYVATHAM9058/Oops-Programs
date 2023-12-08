/*  Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, 
 * and subclasses for "Rectangle", "Circle", and "Triangle". */
public class main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle1 re1 = new Rectangle1(11,13);
		Circle1 c1 = new Circle1(9.0);
		Triangle1 tr1 = new Triangle1(9,3,8);
		
		System.out.println("Area  Of Triangle is "+tr1.getArea());
		System.out.println("Perimeter of Triangle is "+tr1.getPerimeter());
		
		System.out.println("\nArea of Rectangle is "+re1.getArea());
		System.out.println("Perimeter of Rectangle is "+re1.getPerimeter());
		
		System.out.println("\nArea of Circle is "+c1.getArea());
		System.out.println("Perimeter of circle is "+c1.getPerimeter());
		
		
	}

}
