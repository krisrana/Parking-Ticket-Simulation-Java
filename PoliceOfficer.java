/**
 * This class simulates a police officer inspecting parked cars.
 */
public class PoliceOfficer 
{
	private String name;
	private String badgeNumber;
	
	/**
	 * no-arg constructor, setting all class member to Null.
	 */
	public PoliceOfficer()
	{
		setName("");
		setBadgeNumber("");
	}
	
	/**
	 * constructor, setting the variable to the given value
	 * @param name
	 * @param badgeNumber
	 */
	public PoliceOfficer(String name, String badgeNumber)
	{
		this.setName(name);
		this.setBadgeNumber(badgeNumber);
	}
	
	/**
	 * 
	 * @param car
	 * @param meter
	 * @return
	 */
	public ParkingTicket inspecting(ParkedCar car, ParkingMeter meter)
	{
		ParkingTicket ticket = null;
		
		int timesUp = car.getMinutesParked() - meter.getPurchasedTime();
		
		if(timesUp > 0)
		{
			ticket = new ParkingTicket(car, this, timesUp);
		}
		
		return ticket;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the badgeNumber
	 */
	public String getBadgeNumber() {
		return badgeNumber;
	}

	/**
	 * @param badgeNumber the badgeNumber to set
	 */
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

}
