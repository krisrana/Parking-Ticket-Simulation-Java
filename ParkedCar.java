/**
 * This class ParkedCaris to know
 * Car's make, model, year, color, license number, and the number of minutes
 * that the car has been parked.
 */
public class ParkedCar
{
	private String carMake;
	private String model;
	private String year;
	private String color;
	private String license;
	private int minutesParked;
	
	/**
	 * no-arg constructor, setting all class member to Null and zero respectively.
	 */
	public ParkedCar()
	{
		setCarMake("");
		setModel("");
		setYear("");
		setColor("");
		setLicense("");
		setMinutesParked(0);
	}
	
	/**
	 * Constructor to set variable to the given value.
	 * @param carMake
	 * @param model
	 * @param year
	 * @param color
	 * @param license
	 * @param minutesParked
	 */
	public ParkedCar(String carMake, String model, String year, String color, String license, int minutesParked)
	{
		this.setCarMake(carMake);
		this.setModel(model);
		this.setYear(year);
		this.setColor(color);
		this.setLicense(license);
		this.setMinutesParked(minutesParked);
	}

	/**
	 * @return the carMake
	 */
	public String getCarMake() {
		return carMake;
	}

	/**
	 * @param carMake the carMake to set
	 */
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(String license) {
		this.license = license;
	}

	/**
	 * @return the minutesParked
	 */
	public int getMinutesParked() {
		return minutesParked;
	}

	/**
	 * @param minutesParked the minutesParked to set
	 */
	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}

}
