/* Write a Java program to create a class called "Airplane" with a flight number, 
 * destination, and departure time attributes, and methods to check flight status and delay. */

import java.time.LocalTime;

public class main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane ap1 = new Airplane("OKL018","Hyderabad",LocalTime.of(10, 15));
		Airplane ap2 = new Airplane("DTK253","Dubai",LocalTime.of(12, 35));
		Airplane ap3 = new Airplane("BA1326","California",LocalTime.of(6, 12));
		
		ap1.checkStatus();
		ap2.checkStatus();
		ap3.checkStatus();
		
		ap1.delay(15);
		ap1.checkStatus();
		
		ap2.delay(29);
		ap2.checkStatus();
		
		
		ap3.checkStatus();
		
		System.out.println("Flight "+ap2.getFlightNo()+" is ready to departure at "+ap2.getDepartureTine());
	
	}

}
