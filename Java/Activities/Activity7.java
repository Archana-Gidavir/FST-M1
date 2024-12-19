package fsthello;

public class Activity7 {
	public static void main(String args[]) {
		MountainBike mb = new MountainBike(3, 10, 25);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(20);
	    mb.applyBrake(5);
	    
	    MountainBike mb1 = new MountainBike(5);
	    System.out.println(mb1.bicycleDesc());
	    mb1.speedUp(20);
	    mb1.applyBrake(5);
	}
}
