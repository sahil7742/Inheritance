package sahil;

import sahil.Vehicle;
public class Bike extends Vehicle{
	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank() + ", getLight()=" + getLight()
				+ "]";
	}

	private String handle;

	public Bike() {
		super();
		this.handle = "long";
	}

	public Bike(String handle,String engine, int wheels, int seats, int fueltank, String light) {
		super(engine,wheels,seats,fueltank,light);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}
	
	
}
