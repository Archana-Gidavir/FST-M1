package fsthello;

public class Activity3 {
	
	public static void main(String[] args) {
		double seconds = 1000000000;

		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		double MercuryAge = seconds / EarthSeconds / MercurySeconds;
		double VenusAge =seconds / EarthSeconds / VenusSeconds;
		double EarthAge =seconds / EarthSeconds;
		double MarsAge =seconds / EarthSeconds / MarsSeconds;
		double JupiterAge = seconds / EarthSeconds / JupiterSeconds;
		double SaturnAge =seconds / EarthSeconds / SaturnSeconds;
		double UranusAge =seconds / EarthSeconds / UranusSeconds;
		double NeptuneAge =seconds / EarthSeconds / NeptuneSeconds;
		
		System.out.println("Age on Mercury: " + MercuryAge + " years");
        System.out.println("Age on Venus: " + VenusAge + " years");
        System.out.println("Age on Earth: " + EarthAge + " years");
        System.out.println("Age on Mars: " + MarsAge + " years");
        System.out.println("Age on Jupiter: " + JupiterAge + " years");
        System.out.println("Age on Saturn: " + SaturnAge + " years");
        System.out.println("Age on Uranus: " + UranusAge + " years");
        System.out.println("Age on Neptune: " + NeptuneAge + " years");
		
	}

}
