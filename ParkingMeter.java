/**
 * This class ParkingMeter know
 *  the number of minutes of parking time that has been purchased.
 */
public class ParkingMeter
{
	private int purchasedTime;
	/**
	 * no-arg constructor, setting the variable to zero.
	 */
	public ParkingMeter()
	{
		setPurchasedTime(0);
	}
	
	/**
	 * constructor, setting the variable to the given value
	 * @param purchasedTime
	 */
	public ParkingMeter(int purchasedTime)
	{
		this.setPurchasedTime(purchasedTime);
	}

	/**
	 * @return the purchasedTime
	 */
	public int getPurchasedTime() {
		return purchasedTime;
	}

	/**
	 * @param purchasedTime the purchasedTime to set
	 */
	public void setPurchasedTime(int purchasedTime) {
		this.purchasedTime = purchasedTime;
	}
	
}
