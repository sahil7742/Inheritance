package sahil;
import sahil.Vehicle;
public class Truck extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;
	public Truck() {
		super();
		this.steering = "right";
		this.musicSystem = "off";
		this.airConditioner = "on";
		this.container = 2;
	}
	public Truck(String steering, String musicSystem, String airConditioner, int container,String engine, int wheels, int seats, int fueltank, String light) {
		super(engine,wheels,seats,fueltank,light);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFueltank()=" + getFueltank() + ", getLight()=" + getLight() + "]";
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public int getContainer() {
		return container;
	}

}
