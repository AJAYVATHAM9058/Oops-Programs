import java.time.*;

public class Airplane {

	private String flightNo,destination;
	private LocalTime scheduleDepartureTime;
	private int delayTime ;
	public Airplane(String flightNo,String destination,LocalTime scheduleDepartureTime) {
		this.scheduleDepartureTime = scheduleDepartureTime;
		this.destination = destination;
		this.flightNo = flightNo;
		this.delayTime = 0;
	}
	
	public String getFlightNo() {
		return flightNo;
	}
	public String getDestination() {
		return destination;
	}
	public LocalTime getDepartureTine() {
		return scheduleDepartureTime;
	}
	
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void setDepartureTime(LocalTime schedultDepartureTime) {
		this.scheduleDepartureTime = scheduleDepartureTime;
	}
	
	
	public void delay(int minutes) {
		this.delayTime = minutes;
		this.scheduleDepartureTime = this.scheduleDepartureTime.plusMinutes(minutes);
	}
	
	public void checkStatus() {
		if(delayTime==0) {
			System.out.println("Flight "+flightNo+"  is on Time");
		}
		else {
			System.out.println("\nFlight "+flightNo+" is delayed by "+delayTime+" minutes \nFlight is ready to departure in "+scheduleDepartureTime );
		}
	}
}
