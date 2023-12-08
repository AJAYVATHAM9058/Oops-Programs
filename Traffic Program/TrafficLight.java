
public class TrafficLight {

	private String color;
	private double duration;
	
	TrafficLight(String color,double duration){
		this.color = color;
		this.duration = duration;
	}
	
	public void changeColor(String newColor) {
		color = newColor;
	}
	
	public boolean isRed() {
		return color.equals("RED");
	}
	
	public boolean isGreen() {
		return color.equals("GREEN");
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public double getDuration() {
		return duration;
	}
	
}
