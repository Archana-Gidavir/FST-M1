package fsthello;

public class Activity1 {
	public static void main(String[] args)
	{
		
		Car car1 = new Car ("Black", "Manula", 2014, 4, 2);
		
		System.out.println("Car1 Information");
		car1.displayCharacteristics();
		car1.accelarate();
		car1.brake();
		
		Car car2 = new Car ("While", "Automatic", 2024);
		
		System.out.println("\n" + "Car2 Information");
		car2.displayCharacteristics();
		car2.accelarate();
		car2.brake();
		
		Car car3 = new Car ();
		car3.colour = "Gray";
		car3.transmission="Manual";
		car3.make = 2020;
		
		System.out.println("\n" + "Car3 Information");
		car3.displayCharacteristics();
		car3.accelarate();
		car3.brake();
	}

}
