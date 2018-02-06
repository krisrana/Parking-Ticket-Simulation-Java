/** 
 * @author krishna  Rana
 * Date: 6/13/2017
 * purpose: This class simulates the parking ticket scenario and outputs information accordingly. 
 *
 */
public class Mainclass 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//PLEASE UNCOMMENT THE SCENARIO ONE AT A TIME
		//first scenario: Car within limit
		//ParkedCar car = new ParkedCar("Honda", "Civic", "2008", "Silver", "LY78PQ", 59);
		
		//Second scenario: Car parked within the hour.
		//ParkedCar car = new ParkedCar("Honda", "Civic", "2008", "Silver", "LY78PQ", 62);
		
		//Thired scenario: Car parked more than an hour.
		//ParkedCar car = new ParkedCar("Honda", "Civic", "2008", "Silver", "LY78PQ", 121);
		
		//Fourth scenario: Car parked for more than couple of hours
	ParkedCar car = new ParkedCar("Honda", "Civic", "2008", "Silver", "LY78PQ", 240);
		
		//time purchased for parking
		ParkingMeter meter = new ParkingMeter(60);
		//Police officer information
		PoliceOfficer officer = new PoliceOfficer("Officer Rob", "5058");
		
		ParkingTicket ticket = officer.inspecting(car, meter);
	
		
		if(ticket != null)
		{
			System.out.println("******************PARKING TICKET******************\n");
			System.out.println("Ticket was printed:\t" + ticket.printCurrentTime());
			System.out.println("**************************************************\n");
			System.out.println("Police Officer: " + officer.getName() + ", -- Badge Number: " + officer.getBadgeNumber());
			System.out.println("----------------------------------------------------");
			System.out.println("Car info: \t" + "Make: " + car.getCarMake() + "\n\t\tModel: " +
								car.getModel() + "\n\t\tYear: " + car.getYear() + "\n\t\tColor: " + 
								car.getColor() + "\n\tLicense Plate: " + car.getLicense());
			System.out.println("----------------------------------------------------");
			System.out.println("Parking Time purchased: " + meter.getPurchasedTime() + " minutes");
			System.out.println("Total time car Parked: " + car.getMinutesParked() + " minutes");
			System.out.println("\nFine Amount: $" + ticket.getFine() + " only" );
			System.out.println("\nPlease, go to your Local Police Department to pay the fine.");
			System.out.println("For your convinience, Visit www.paymyfine.com/pay to pay fine online.");
			
		}
		else
			System.out.println("NO Ticket Needed - " + officer.getName());
		

	}

}
