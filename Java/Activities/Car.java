package fsthello;

public class Car {
	String colour;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(String colour, String transmission, int make, int tyres, int doors) {
		this.colour = colour;
		this.transmission = transmission;
		this.make=make;
		this.tyres=tyres;
		this.doors=doors;
	}
	
	Car(String colour, String transmission, int make){
		this.colour = colour;
		this.transmission = transmission;
		this.make=make;
		this.tyres=4;
		this.doors=4;
	}
	
	Car(){
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Colour of the car is " + this.colour);
		System.out.println("Transmission of the car is " + this.transmission);
		System.out.println("Make of car is " + this.make);
		System.out.println("Number of Tyres are " + this.tyres);
		System.out.println("Number of Doors are " + this.doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}
	
}
