
public class Circle1 extends Shape{
	
	private double radius;
	private double pi = 3.14;
	
	public Circle1(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}
	

}
