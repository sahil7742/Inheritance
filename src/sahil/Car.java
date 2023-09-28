package sahil;
import sahil.Vehicle;
public class Car extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank()
				+ ", getLight()=" + getLight() + "]";
	}
	public Car() {
		super();
		this.steering = "right";
		this.musicSystem = "running";
		this.airConditioner = "on";
		this.fridge = "cooling ";
		this.entertainmentSystem = "playing movie";
	}
	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,String engine, int wheels, int seats, int fueltank, String light) {
		super(engine,wheels,seats,fueltank,light);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
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
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	
	

}
