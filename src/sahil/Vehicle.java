package sahil;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fueltank;
	private String light;
	
	//default constructor
	public Vehicle() {
		this.engine = "on";
		this.wheels = 4;
		this.seats = 7;
		this.fueltank = 35;
		this.light = "on";
		
	}

	// paramitised constructor
	public Vehicle(String engine, int wheels, int seats, int fueltank, String light) {
		
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueltank = fueltank;
		this.light = light;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFueltank() {
		return fueltank;
	}

	public String getLight() {
		return light;
	}
	
	

}
