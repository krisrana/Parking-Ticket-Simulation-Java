import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *  This class Simulates the parking ticket.
 *  with collaboration of class ParkedCar and Policeofficer.
 *  it sets value for report of parking ticket variables.
 */
public class ParkingTicket
{
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int time;
	
	
	/**
	 * Constant variable
	 */
	public final double FIRSTFINE = 50.0;
	public final double HOURFINE = 20.0;
	
	/**
	 * constructor to set given value to variable
	 * @param car
	 * @param officer
	 * @param time
	 */
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, int time)
	{
		this.setCar(car);
		this.setOfficer(officer);
		this.time = time;
		calculateFine();
	}
	
	/**
	 * calculateFine method calculates fine based on the hours parked.
	 */
	private void calculateFine()
	{
		double hours = time / 60.0;
		int hour = (int) hours;
		
		if((hours - hour) < 0)
		{	
			if((hour - hour) > 0)
			{
				hour++;
			}
		}
		//if its first hour	
		setFine(FIRSTFINE);
		//if it has surpassed one hour.
		setFine(getFine() + (hour * HOURFINE));
	}
	
	
	public String printCurrentTime()
	{
		String timeStamp = new SimpleDateFormat("MM/dd/YYYY --- hh:mm a").format(Calendar.getInstance().getTime());
		
		return timeStamp;
	}

	/**
	 * @return the car
	 */
	public ParkedCar getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar(ParkedCar car) {
		this.car = car;
	}

	/**
	 * @return the officer
	 */
	public PoliceOfficer getOfficer() {
		return officer;
	}

	/**
	 * @param officer the officer to set
	 */
	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}

	/**
	 * @return the fine
	 */
	public double getFine() {
		return fine;
	}

	/**
	 * @param fine the fine to set
	 */
	public void setFine(double fine) {
		this.fine = fine;
	}
	
}
