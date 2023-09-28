package sahil;

public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike();
		Truck truck = new Truck();
		Car car = new Car();
		bike.getHandle();
		bike.getLight();
		car.getEngine();
		bike.getWheels();
		truck.getSeats();
		bike.getFueltank();

		System.out.println(bike.getHandle());
		System.out.println(bike.getLight());
		System.out.println(car.getEngine());
		System.out.println(bike.getWheels());
		System.out.println(truck.getSeats());
		System.out.println(bike.getFueltank());
		

	}

}
