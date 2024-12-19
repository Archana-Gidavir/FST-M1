package fsthello;

public class Activity6 {
	public static void main (String[] arg) {
		Plane ptest = new Plane(10);
		String[] passenger = {"meena","ritu","raju","mona"};
		//String[] passenger = {"meena","ritu","raju","mona","meena","ritu","raju","mona","meena","ritu","raju","mona"};
		//add Passengers
		ptest.onboard(passenger);
		
		//list of people onboard
        System.out.println("\nPeople on the plane: " + ptest.getPassengers());
        
		//Plane takes off
        System.out.println("\nPlane took off at: " + ptest.takeOff());
        
        //Flying.....pause execution for 5 seconds
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //Plane landed
        ptest.land();
        
        //Plane landing detail
        System.out.println("\nPlane landed at: " + ptest.getLastTimeLanded());
        System.out.println("\nPeople on the plane after landing: " + ptest.getPassengers());
	}

}
