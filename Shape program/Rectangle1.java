
public class Rectangle1 extends Shape{

	private int length,breadth;
	
	Rectangle1(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

}
