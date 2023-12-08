/* Write a Java program to create class called "TrafficLight" 
 * with attributes for color and duration, and methods to change
 *  the color and check for red or green. */
public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafficLight light = new TrafficLight("RED",20);
		
		System.out.println("Light is Red ? --> "+light.isRed());
		light.changeColor("GREEN");
		System.out.println("Light is GREEN ? --> "+light.isGreen());
		
		System.out.println("Duration of light is "+light.getDuration());
		light.setDuration(5);
		light.changeColor("RED");
		System.out.println("Light is GREEN ? --> "+light.isGreen());
	}

}
