
public class Triangle1 extends Shape{

	private int a,b,c;
	
	public Triangle1(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		double s = (a+b+c)/2;
		return Math.round(Math.sqrt( s*(s-a)*(s-b)*(s-c)));
		
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return  a+b+c;
	}

	
}
